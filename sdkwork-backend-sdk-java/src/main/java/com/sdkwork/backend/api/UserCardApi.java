package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class UserCardApi {
    private final HttpClient client;
    
    public UserCardApi(HttpClient client) {
        this.client = client;
    }

    /** Update user-card binding */
    public PlusApiResultPlusUserCardVO update(PlusUserCardForm body) throws Exception {
        return (PlusApiResultPlusUserCardVO) client.put(ApiPaths.backendPath("/user/card"), body);
    }

    /** Create user-card binding */
    public PlusApiResultPlusUserCardVO create(PlusUserCardForm body) throws Exception {
        return (PlusApiResultPlusUserCardVO) client.post(ApiPaths.backendPath("/user/card"), body);
    }

    /** Get user-card bindings by page */
    public PlusApiResultPagePlusUserCardVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusUserCardVO) client.post(ApiPaths.backendPath("/user/card/list"), body, params);
    }

    /** Get all user-card bindings */
    public PlusApiResultListPlusUserCardVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusUserCardVO) client.post(ApiPaths.backendPath("/user/card/list/all"), body);
    }

    /** Get user-card binding by ID */
    public PlusApiResultPlusUserCardVO getById(String id) throws Exception {
        return (PlusApiResultPlusUserCardVO) client.get(ApiPaths.backendPath("/user/card/" + id + ""));
    }

    /** Delete user-card binding */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/user/card/" + id + ""));
    }
}
