package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AccountApi {
    private final HttpClient client;
    
    public AccountApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing account */
    public PlusApiResultPlusAccountVO update(PlusAccountForm body) throws Exception {
        return (PlusApiResultPlusAccountVO) client.put(ApiPaths.backendPath("/account"), body);
    }

    /** Create a new account */
    public PlusApiResultPlusAccountVO create(PlusAccountForm body) throws Exception {
        return (PlusApiResultPlusAccountVO) client.post(ApiPaths.backendPath("/account"), body);
    }

    /** Update an existing account history record */
    public PlusApiResultPlusAccountHistoryVO updateHistory(PlusAccountHistoryForm body) throws Exception {
        return (PlusApiResultPlusAccountHistoryVO) client.put(ApiPaths.backendPath("/account/history"), body);
    }

    /** Create a new account history record */
    public PlusApiResultPlusAccountHistoryVO createHistory(PlusAccountHistoryForm body) throws Exception {
        return (PlusApiResultPlusAccountHistoryVO) client.post(ApiPaths.backendPath("/account/history"), body);
    }

    /** Get points-to-cash rate */
    public PlusApiResultAccountExchangeRateVO getPointsToCashRate() throws Exception {
        return (PlusApiResultAccountExchangeRateVO) client.get(ApiPaths.backendPath("/account/exchange-config/points-cash-rate"));
    }

    /** Update points-to-cash rate */
    public PlusApiResultAccountExchangeRateVO updatePointsToCashRate(AccountExchangeRateUpdateForm body) throws Exception {
        return (PlusApiResultAccountExchangeRateVO) client.put(ApiPaths.backendPath("/account/exchange-config/points-cash-rate"), body);
    }

    /** Get accounts by page */
    public PlusApiResultPagePlusAccountVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAccountVO) client.post(ApiPaths.backendPath("/account/list"), body, params);
    }

    /** Get all accounts */
    public PlusApiResultListPlusAccountVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAccountVO) client.post(ApiPaths.backendPath("/account/list/all"), body);
    }

    /** Get account history records by page */
    public PlusApiResultPagePlusAccountHistoryVO createListByPageHistory(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAccountHistoryVO) client.post(ApiPaths.backendPath("/account/history/list"), body, params);
    }

    /** Get all account history records */
    public PlusApiResultListPlusAccountHistoryVO createListAllEntitiesHistory(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAccountHistoryVO) client.post(ApiPaths.backendPath("/account/history/list/all"), body);
    }

    /** Get points account */
    public PlusApiResultPlusAccountVO getPoints(PlusGetAccountForm body) throws Exception {
        return (PlusApiResultPlusAccountVO) client.post(ApiPaths.backendPath("/account/get_points"), body);
    }

    /** Get cash account */
    public PlusApiResultPlusAccountVO getCash(PlusGetAccountForm body) throws Exception {
        return (PlusApiResultPlusAccountVO) client.post(ApiPaths.backendPath("/account/get_cash"), body);
    }

    /** Get an account by ID */
    public PlusApiResultPlusAccountVO getById(String id) throws Exception {
        return (PlusApiResultPlusAccountVO) client.get(ApiPaths.backendPath("/account/" + id + ""));
    }

    /** Delete an account */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/account/" + id + ""));
    }

    /** Get an account history record by ID */
    public PlusApiResultPlusAccountHistoryVO getByIdHistory(String id) throws Exception {
        return (PlusApiResultPlusAccountHistoryVO) client.get(ApiPaths.backendPath("/account/history/" + id + ""));
    }

    /** Delete an account history record */
    public PlusApiResultBoolean deleteHistory(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/account/history/" + id + ""));
    }
}
