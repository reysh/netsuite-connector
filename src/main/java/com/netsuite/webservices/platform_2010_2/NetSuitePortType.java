package com.netsuite.webservices.platform_2010_2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.3.0
 * Tue Apr 26 17:35:33 ART 2011
 * Generated source version: 2.3.0
 * 
 */
 
@WebService(targetNamespace = "urn:platform_2010_2.webservices.netsuite.com", name = "NetSuitePortType")
@XmlSeeAlso({com.netsuite.webservices.transactions.sales_2010_2.ObjectFactory.class, com.netsuite.webservices.setup.customization_2010_2.ObjectFactory.class, com.netsuite.webservices.lists.support_2010_2.ObjectFactory.class, com.netsuite.webservices.transactions.sales_2010_2.types.ObjectFactory.class, com.netsuite.webservices.transactions.general_2010_2.ObjectFactory.class, com.netsuite.webservices.platform.core_2010_2.types.ObjectFactory.class, com.netsuite.webservices.transactions.purchases_2010_2.ObjectFactory.class, com.netsuite.webservices.transactions.purchases_2010_2.types.ObjectFactory.class, com.netsuite.webservices.transactions.financial_2010_2.types.ObjectFactory.class, com.netsuite.webservices.activities.scheduling_2010_2.ObjectFactory.class, com.netsuite.webservices.lists.employees_2010_2.ObjectFactory.class, com.netsuite.webservices.transactions.employees_2010_2.ObjectFactory.class, com.netsuite.webservices.platform.common_2010_2.ObjectFactory.class, com.netsuite.webservices.platform.core_2010_2.ObjectFactory.class, com.netsuite.webservices.transactions.customers_2010_2.types.ObjectFactory.class, com.netsuite.webservices.transactions.inventory_2010_2.types.ObjectFactory.class, com.netsuite.webservices.setup.customization_2010_2.types.ObjectFactory.class, com.netsuite.webservices.platform.messages_2010_2.ObjectFactory.class, com.netsuite.webservices.activities.scheduling_2010_2.types.ObjectFactory.class, com.netsuite.webservices.transactions.financial_2010_2.ObjectFactory.class, com.netsuite.webservices.lists.accounting_2010_2.types.ObjectFactory.class, com.netsuite.webservices.general.communication_2010_2.types.ObjectFactory.class, com.netsuite.webservices.documents.filecabinet_2010_2.ObjectFactory.class, com.netsuite.webservices.documents.filecabinet_2010_2.types.ObjectFactory.class, com.netsuite.webservices.lists.accounting_2010_2.ObjectFactory.class, com.netsuite.webservices.platform.faults_2010_2.types.ObjectFactory.class, com.netsuite.webservices.transactions.bank_2010_2.ObjectFactory.class, com.netsuite.webservices.lists.marketing_2010_2.types.ObjectFactory.class, com.netsuite.webservices.transactions.customers_2010_2.ObjectFactory.class, com.netsuite.webservices.lists.employees_2010_2.types.ObjectFactory.class, com.netsuite.webservices.transactions.employees_2010_2.types.ObjectFactory.class, com.netsuite.webservices.general.communication_2010_2.ObjectFactory.class, com.netsuite.webservices.platform.faults_2010_2.ObjectFactory.class, com.netsuite.webservices.platform.common_2010_2.types.ObjectFactory.class, com.netsuite.webservices.lists.support_2010_2.types.ObjectFactory.class, com.netsuite.webservices.lists.marketing_2010_2.ObjectFactory.class, com.netsuite.webservices.transactions.inventory_2010_2.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface NetSuitePortType {

    @WebResult(name = "getConsolidatedExchangeRateResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "getConsolidatedExchangeRate")
    public com.netsuite.webservices.platform.messages_2010_2.GetConsolidatedExchangeRateResponse getConsolidatedExchangeRate(
        @WebParam(partName = "parameters", name = "getConsolidatedExchangeRate", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetConsolidatedExchangeRateRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "mapSsoResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "mapSso")
    public com.netsuite.webservices.platform.messages_2010_2.MapSsoResponse mapSso(
        @WebParam(partName = "parameters", name = "mapSso", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.MapSsoRequest parameters
    ) throws ExceededRequestLimitFault, UnexpectedErrorFault, InvalidAccountFault, InvalidVersionFault, InsufficientPermissionFault, InvalidCredentialsFault;

    @WebResult(name = "searchResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "search")
    public com.netsuite.webservices.platform.messages_2010_2.SearchResponse search(
        @WebParam(partName = "parameters", name = "search", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.SearchRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "initializeResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "initialize")
    public com.netsuite.webservices.platform.messages_2010_2.InitializeResponse initialize(
        @WebParam(partName = "parameters", name = "initialize", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.InitializeRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "ssoLoginResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "ssoLogin")
    public com.netsuite.webservices.platform.messages_2010_2.SsoLoginResponse ssoLogin(
        @WebParam(partName = "parameters", name = "ssoLogin", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.SsoLoginRequest parameters
    ) throws ExceededRequestLimitFault, UnexpectedErrorFault, InvalidAccountFault, InvalidVersionFault, InsufficientPermissionFault, InvalidCredentialsFault;

    @WebResult(name = "getListResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "getList")
    public com.netsuite.webservices.platform.messages_2010_2.GetListResponse getList(
        @WebParam(partName = "parameters", name = "getList", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetListRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "getSelectValueResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "getSelectValue")
    public com.netsuite.webservices.platform.messages_2010_2.GetSelectValueResponse getSelectValue(
        @WebParam(partName = "parameters", name = "getSelectValue", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetSelectValueRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "detachResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "detach")
    public com.netsuite.webservices.platform.messages_2010_2.DetachResponse detach(
        @WebParam(partName = "parameters", name = "detach", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.DetachRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "updateResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "update")
    public com.netsuite.webservices.platform.messages_2010_2.UpdateResponse update(
        @WebParam(partName = "parameters", name = "update", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.UpdateRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "checkAsyncStatusResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "checkAsyncStatus")
    public com.netsuite.webservices.platform.messages_2010_2.AsyncStatusResponse checkAsyncStatus(
        @WebParam(partName = "parameters", name = "checkAsyncStatus", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.CheckAsyncStatusRequest parameters
    ) throws AsyncFault, ExceededRequestLimitFault, InvalidSessionFault, UnexpectedErrorFault, InvalidCredentialsFault;

    @WebResult(name = "updateInviteeStatusResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "updateInviteeStatus")
    public com.netsuite.webservices.platform.messages_2010_2.UpdateInviteeStatusResponse updateInviteeStatus(
        @WebParam(partName = "parameters", name = "updateInviteeStatus", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.UpdateInviteeStatusRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "getPostingTransactionSummaryResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "getPostingTransactionSummary")
    public com.netsuite.webservices.platform.messages_2010_2.GetPostingTransactionSummaryResponse getPostingTransactionSummary(
        @WebParam(partName = "parameters", name = "getPostingTransactionSummary", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetPostingTransactionSummaryRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "asyncUpdateListResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "asyncUpdateList")
    public com.netsuite.webservices.platform.messages_2010_2.AsyncStatusResponse asyncUpdateList(
        @WebParam(partName = "parameters", name = "asyncUpdateList", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.AsyncUpdateListRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "addResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "add")
    public com.netsuite.webservices.platform.messages_2010_2.AddResponse add(
        @WebParam(partName = "parameters", name = "add", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.AddRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "asyncAddListResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "asyncAddList")
    public com.netsuite.webservices.platform.messages_2010_2.AsyncStatusResponse asyncAddList(
        @WebParam(partName = "parameters", name = "asyncAddList", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.AsyncAddListRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "getServerTimeResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "getServerTime")
    public com.netsuite.webservices.platform.messages_2010_2.GetServerTimeResponse getServerTime(
        @WebParam(partName = "parameters", name = "getServerTime", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetServerTimeRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault;

    @WebResult(name = "initializeListResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "initializeList")
    public com.netsuite.webservices.platform.messages_2010_2.InitializeListResponse initializeList(
        @WebParam(partName = "parameters", name = "initializeList", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.InitializeListRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "getAllResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "getAll")
    public com.netsuite.webservices.platform.messages_2010_2.GetAllResponse getAll(
        @WebParam(partName = "parameters", name = "getAll", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetAllRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "searchMoreResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "searchMore")
    public com.netsuite.webservices.platform.messages_2010_2.SearchMoreResponse searchMore(
        @WebParam(partName = "parameters", name = "searchMore", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.SearchMoreRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, ExceededRecordCountFault;

    @WebResult(name = "updateListResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "updateList")
    public com.netsuite.webservices.platform.messages_2010_2.UpdateListResponse updateList(
        @WebParam(partName = "parameters", name = "updateList", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.UpdateListRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "loginResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "login")
    public com.netsuite.webservices.platform.messages_2010_2.LoginResponse login(
        @WebParam(partName = "parameters", name = "login", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.LoginRequest parameters
    ) throws ExceededRequestLimitFault, UnexpectedErrorFault, InvalidAccountFault, InvalidVersionFault, InsufficientPermissionFault, InvalidCredentialsFault;

    @WebResult(name = "asyncDeleteListResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "asyncDeleteList")
    public com.netsuite.webservices.platform.messages_2010_2.AsyncStatusResponse asyncDeleteList(
        @WebParam(partName = "parameters", name = "asyncDeleteList", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.AsyncDeleteListRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "getBudgetExchangeRateResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "getBudgetExchangeRate")
    public com.netsuite.webservices.platform.messages_2010_2.GetBudgetExchangeRateResponse getBudgetExchangeRate(
        @WebParam(partName = "parameters", name = "getBudgetExchangeRate", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetBudgetExchangeRateRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "updateInviteeStatusListResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "updateInviteeStatusList")
    public com.netsuite.webservices.platform.messages_2010_2.UpdateInviteeStatusListResponse updateInviteeStatusList(
        @WebParam(partName = "parameters", name = "updateInviteeStatusList", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.UpdateInviteeStatusListRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "getItemAvailabilityResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "getItemAvailability")
    public com.netsuite.webservices.platform.messages_2010_2.GetItemAvailabilityResponse getItemAvailability(
        @WebParam(partName = "parameters", name = "getItemAvailability", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetItemAvailabilityRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "addListResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "addList")
    public com.netsuite.webservices.platform.messages_2010_2.AddListResponse addList(
        @WebParam(partName = "parameters", name = "addList", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.AddListRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "searchNextResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "searchNext")
    public com.netsuite.webservices.platform.messages_2010_2.SearchNextResponse searchNext(
        @WebParam(partName = "parameters", name = "searchNext", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.SearchNextRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, ExceededRecordCountFault;

    @WebResult(name = "getDeletedResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "getDeleted")
    public com.netsuite.webservices.platform.messages_2010_2.GetDeletedResponse getDeleted(
        @WebParam(partName = "parameters", name = "getDeleted", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetDeletedRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "asyncGetListResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "asyncGetList")
    public com.netsuite.webservices.platform.messages_2010_2.AsyncStatusResponse asyncGetList(
        @WebParam(partName = "parameters", name = "asyncGetList", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.AsyncGetListRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "getAsyncResultResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "getAsyncResult")
    public com.netsuite.webservices.platform.messages_2010_2.GetAsyncResultResponse getAsyncResult(
        @WebParam(partName = "parameters", name = "getAsyncResult", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetAsyncResultRequest parameters
    ) throws AsyncFault, ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "attachResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "attach")
    public com.netsuite.webservices.platform.messages_2010_2.AttachResponse attach(
        @WebParam(partName = "parameters", name = "attach", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.AttachRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "getSavedSearchResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "getSavedSearch")
    public com.netsuite.webservices.platform.messages_2010_2.GetSavedSearchResponse getSavedSearch(
        @WebParam(partName = "parameters", name = "getSavedSearch", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetSavedSearchRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "deleteListResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "deleteList")
    public com.netsuite.webservices.platform.messages_2010_2.DeleteListResponse deleteList(
        @WebParam(partName = "parameters", name = "deleteList", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.DeleteListRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "getResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "get")
    public com.netsuite.webservices.platform.messages_2010_2.GetResponse get(
        @WebParam(partName = "parameters", name = "get", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "getCustomizationIdResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "getCustomizationId")
    public com.netsuite.webservices.platform.messages_2010_2.GetCustomizationIdResponse getCustomizationId(
        @WebParam(partName = "parameters", name = "getCustomizationId", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.GetCustomizationIdRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "changePasswordOrEmailResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "changePasswordOrEmail")
    public com.netsuite.webservices.platform.messages_2010_2.ChangePasswordOrEmailResponse changePasswordOrEmail(
        @WebParam(partName = "parameters", name = "changePasswordOrEmail", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.ChangePasswordOrEmailRequest parameters
    ) throws ExceededRequestLimitFault, UnexpectedErrorFault, InvalidAccountFault, InvalidVersionFault, InsufficientPermissionFault, InvalidCredentialsFault;

    @WebResult(name = "logoutResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "logout")
    public com.netsuite.webservices.platform.messages_2010_2.LogoutResponse logout(
        @WebParam(partName = "parameters", name = "logout", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.LogoutRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, UnexpectedErrorFault;

    @WebResult(name = "asyncSearchResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "asyncSearch")
    public com.netsuite.webservices.platform.messages_2010_2.AsyncStatusResponse asyncSearch(
        @WebParam(partName = "parameters", name = "asyncSearch", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.AsyncSearchRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "deleteResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "delete")
    public com.netsuite.webservices.platform.messages_2010_2.DeleteResponse delete(
        @WebParam(partName = "parameters", name = "delete", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.DeleteRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "asyncInitializeListResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "asyncInitializeList")
    public com.netsuite.webservices.platform.messages_2010_2.AsyncStatusResponse asyncInitializeList(
        @WebParam(partName = "parameters", name = "asyncInitializeList", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.AsyncInitializeListRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;

    @WebResult(name = "searchMoreWithIdResponse", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com", partName = "parameters")
    @WebMethod(action = "searchMoreWithId")
    public com.netsuite.webservices.platform.messages_2010_2.SearchMoreWithIdResponse searchMoreWithId(
        @WebParam(partName = "parameters", name = "searchMoreWithId", targetNamespace = "urn:messages_2010_2.platform.webservices.netsuite.com")
        com.netsuite.webservices.platform.messages_2010_2.SearchMoreWithIdRequest parameters
    ) throws ExceededRequestLimitFault, InvalidSessionFault, ExceededRequestSizeFault, UnexpectedErrorFault, ExceededUsageLimitFault, InvalidCredentialsFault, ExceededRecordCountFault;
}