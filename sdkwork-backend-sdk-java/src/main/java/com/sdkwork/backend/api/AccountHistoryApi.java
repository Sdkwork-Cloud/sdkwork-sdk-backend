package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AccountHistoryApi {
    private final HttpClient client;
    
    public AccountHistoryApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing account history record */
    public PlusApiResultPlusAccountHistoryVO update(PlusAccountHistoryForm body) throws Exception {
        return (PlusApiResultPlusAccountHistoryVO) client.put(ApiPaths.backendPath("/account/history"), body);
    }

    /** Create a new account history record */
    public PlusApiResultPlusAccountHistoryVO create(PlusAccountHistoryForm body) throws Exception {
        return (PlusApiResultPlusAccountHistoryVO) client.post(ApiPaths.backendPath("/account/history"), body);
    }

    /** Get account history records by page */
    public PlusApiResultPagePlusAccountHistoryVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAccountHistoryVO) client.post(ApiPaths.backendPath("/account/history/list"), body, params);
    }

    /** Get all account history records */
    public PlusApiResultListPlusAccountHistoryVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAccountHistoryVO) client.post(ApiPaths.backendPath("/account/history/list/all"), body);
    }

    /** Get an account history record by ID */
    public PlusApiResultPlusAccountHistoryVO getById(String id) throws Exception {
        return (PlusApiResultPlusAccountHistoryVO) client.get(ApiPaths.backendPath("/account/history/" + id + ""));
    }

    /** Delete an account history record */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/account/history/" + id + ""));
    }
}
