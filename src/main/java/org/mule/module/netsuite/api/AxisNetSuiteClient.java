/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api;

import org.mule.module.netsuite.api.annotation.NetSuiteOperation;
import org.mule.module.netsuite.api.annotation.ReturnType;
import org.mule.module.netsuite.api.model.entity.EntityId;
import org.mule.module.netsuite.api.model.entity.EntityReference;

import com.netsuite.webservices.platform.core_2010_2.AttachBasicReference;
import com.netsuite.webservices.platform.core_2010_2.AttachContactReference;
import com.netsuite.webservices.platform.core_2010_2.BudgetExchangeRateFilter;
import com.netsuite.webservices.platform.core_2010_2.ConsolidatedExchangeRateFilter;
import com.netsuite.webservices.platform.core_2010_2.CustomizationType;
import com.netsuite.webservices.platform.core_2010_2.DetachBasicReference;
import com.netsuite.webservices.platform.core_2010_2.GetAllRecord;
import com.netsuite.webservices.platform.core_2010_2.GetDeletedFilter;
import com.netsuite.webservices.platform.core_2010_2.GetSavedSearchRecord;
import com.netsuite.webservices.platform.core_2010_2.ItemAvailabilityFilter;
import com.netsuite.webservices.platform.core_2010_2.Record;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.platform.core_2010_2.UpdateInviteeStatusReference;
import com.netsuite.webservices.platform.core_2010_2.types.CalendarEventAttendeeResponse;
import com.netsuite.webservices.platform.core_2010_2.types.GetAllRecordType;
import com.netsuite.webservices.platform.core_2010_2.types.GetCustomizationType;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;
import com.netsuite.webservices.platform.messages_2010_2.AddRequest;
import com.netsuite.webservices.platform.messages_2010_2.AttachRequest;
import com.netsuite.webservices.platform.messages_2010_2.CheckAsyncStatusRequest;
import com.netsuite.webservices.platform.messages_2010_2.DeleteRequest;
import com.netsuite.webservices.platform.messages_2010_2.DetachRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetAllRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetAsyncResultRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetBudgetExchangeRateRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetConsolidatedExchangeRateRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetCustomizationIdRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetDeletedRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetItemAvailabilityRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetSavedSearchRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetServerTimeRequest;
import com.netsuite.webservices.platform.messages_2010_2.InitializeListRequest;
import com.netsuite.webservices.platform.messages_2010_2.InitializeRequest;
import com.netsuite.webservices.platform.messages_2010_2.UpdateInviteeStatusRequest;
import com.netsuite.webservices.platform.messages_2010_2.UpdateRequest;
import com.netsuite.webservices.platform_2010_2.NetSuitePortType;

import java.util.Map;

import javax.validation.constraints.NotNull;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.LazyDynaMap;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;

public class AxisNetSuiteClient implements SoapNetSuiteClient
{
    private final AxisPortProvider portProvider;

    public AxisNetSuiteClient(@NotNull AxisPortProvider portProvider)
    {
        Validate.notNull(portProvider);
        this.portProvider = portProvider;
    }

    public Object update(RecordType recordType, Map<String, Object> recordAttributes) throws Exception
    {
        return getAuthenticatedPort().update(new UpdateRequest(createRecord(recordType, recordAttributes)));
    }

    public Object add(RecordType recordType, Map<String, Object> recordAttributes) throws Exception
    {
        return getAuthenticatedPort().add(new AddRequest(createRecord(recordType, recordAttributes)));
    }

    public void find() throws Exception
    {
    }

    private Record createRecord(RecordType recordType, Map<String, Object> recordAttributes) throws Exception
    {
        Record record = (Record) Class.forName(StringUtils.capitalize(recordType.value())).newInstance();
        BeanUtils.copyProperties(record, new LazyDynaMap(recordAttributes));
        return record;
    }

    public Object attachEntity(@NotNull EntityReference sourceEntity,
                               @NotNull EntityReference destinationEntity,
                               EntityReference contactEntity) throws Exception
    {
        Validate.notNull(sourceEntity);
        Validate.notNull(destinationEntity);

        if (contactEntity == null)
        {
            return getAuthenticatedPort().attach(
                new AttachRequest(new AttachBasicReference(destinationEntity.createRef(),
                    sourceEntity.createRef())));
        }
        else
        {
            return getAuthenticatedPort().attach(
                new AttachRequest(new AttachContactReference(destinationEntity.createRef(),
                    sourceEntity.createRef(), contactEntity.createRef())));
        }
    }

    public Object deleteEntity(EntityReference entity) throws Exception
    {
        // TODO use customRecordRef?
        return getAuthenticatedPort().delete(new DeleteRequest(entity.createRef()));
    }

    public Object detachEntity(@NotNull EntityReference sourceEntity,
                               @NotNull EntityReference destinationEntity) throws Exception
    {
        return getAuthenticatedPort().detach(
            new DetachRequest(new DetachBasicReference(destinationEntity.createRef(),
                sourceEntity.createRef())));
    }

    public Object getDeletedEntity(RecordType type, String whenExpression) throws Exception
    {
        return getAuthenticatedPort().getDeleted(new GetDeletedRequest(new GetDeletedFilter(/* TODO */)));
    }

    public Object getEntity(EntityReference entity) throws Exception
    {
        return getAuthenticatedPort().get(new GetRequest(entity.createRef()));
    }

    public Object getEntities(RecordType type) throws Exception
    {
        return getAuthenticatedPort().getAll(
            new GetAllRequest(new GetAllRecord(GetAllRecordType.fromValue(type.value()))));
    }

    public Object getBudgetExchangeRate(@NotNull EntityId period,
                                        @NotNull EntityId fromSubsidiary,
                                        EntityId toSubsidiary) throws Exception
    {
        Validate.notNull(period);
        Validate.notNull(fromSubsidiary);
        return getAuthenticatedPort().getBudgetExchangeRate(
            new GetBudgetExchangeRateRequest(new BudgetExchangeRateFilter(period.createRef(),
                fromSubsidiary.createRef(), createRefNullSafe(toSubsidiary))));
    }

    public Object getConsolidatedExchangeRate(@NotNull EntityId period,
                                              @NotNull EntityId fromSubsidiary,
                                              EntityId toSubsidiary) throws Exception
    {
        return getAuthenticatedPort().getConsolidatedExchangeRate(
            new GetConsolidatedExchangeRateRequest(new ConsolidatedExchangeRateFilter(period.createRef(),
                fromSubsidiary.createRef(), createRefNullSafe(toSubsidiary))));
    }

    public Object getCustomizationId(@NotNull RecordType type, boolean includeInactives) throws Exception
    {
        Validate.notNull(type);
        return getAuthenticatedPort().getCustomizationId(
            new GetCustomizationIdRequest(
                new CustomizationType(GetCustomizationType.fromValue(type.value())), includeInactives));
    }

    public Object getItemAvailability() throws Exception
    {
        return getAuthenticatedPort().getItemAvailability(
            new GetItemAvailabilityRequest(new ItemAvailabilityFilter(/* TODO */)));
    }

    public Object getSavedSearch(@NotNull RecordType type) throws Exception
    {
        Validate.notNull(type);
        return getAuthenticatedPort().getSavedSearch(
            new GetSavedSearchRequest(new GetSavedSearchRecord(SearchRecordType.fromValue(type.value()))));
    }

    public Object getServerTime() throws Exception
    {
        return getAuthenticatedPort().getServerTime(new GetServerTimeRequest());
    }

    public Object updateInviteeStatus(@NotNull EntityReference entity,
                                      @NotNull CalendarEventAttendeeResponse status) throws Exception
    {
        Validate.notNull(entity);
        Validate.notNull(status);
        return getAuthenticatedPort().updateInviteeStatus(
            new UpdateInviteeStatusRequest(new UpdateInviteeStatusReference(entity.createRef(), status)));
    }

    @NetSuiteOperation(resultName = "AsyncStatus", resultType = ReturnType.RECORD)
    public Object checkAsyncStatus(String jobId) throws Exception
    {
        Validate.notEmpty(jobId);
        return getAuthenticatedPort().checkAsyncStatus(new CheckAsyncStatusRequest(jobId));
    }

    @NetSuiteOperation(resultName = "AsyncResult", resultType = ReturnType.RECORD)
    public Object getAsyncResult(String jobId, int pageIndex) throws Exception
    {
        Validate.notEmpty(jobId);
        return getAuthenticatedPort().getAsyncResult(new GetAsyncResultRequest(jobId, pageIndex));
    }

    /*
     * initialize / initializeList
     * [https://system.netsuite.com/help/helpcenter/en_US/Output/Help/
     * SuiteFlex/WebServices/STP_initializeinitializelist.html] • Use to emulate the
     * UI workflow by pre-populating fields on transaction line items with values
     * from a related record. The init
     */

    public Object initialize() throws Exception
    {
        return getAuthenticatedPort().initialize(new InitializeRequest());
    }

    public Object initializeList() throws Exception
    {
        return getAuthenticatedPort().initializeList(new InitializeListRequest());
    }

    public NetSuitePortType getAuthenticatedPort() throws Exception
    {
        return portProvider.getAuthenticatedPort();
    }

    private RecordRef createRefNullSafe(EntityId toSubsidiary)
    {
        return toSubsidiary != null ? toSubsidiary.createRef() : null;
    }

}