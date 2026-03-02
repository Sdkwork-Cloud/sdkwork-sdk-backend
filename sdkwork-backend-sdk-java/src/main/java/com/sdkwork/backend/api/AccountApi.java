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

    /** Get accounts by page */
    public PlusApiResultPagePlusAccountVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAccountVO) client.post(ApiPaths.backendPath("/account/list"), body, params);
    }

    /** Get all accounts */
    public PlusApiResultListPlusAccountVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAccountVO) client.post(ApiPaths.backendPath("/account/list/all"), body);
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
}
