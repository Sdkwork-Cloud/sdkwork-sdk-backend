package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class UserApi {
    private final HttpClient client;
    
    public UserApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing user */
    public PlusApiResultPlusUserVO update(PlusUserForm body) throws Exception {
        return (PlusApiResultPlusUserVO) client.put(ApiPaths.backendPath("/user"), body);
    }

    /** Create a new user */
    public PlusApiResultPlusUserVO create(PlusUserForm body) throws Exception {
        return (PlusApiResultPlusUserVO) client.post(ApiPaths.backendPath("/user"), body);
    }

    /** Get users by page */
    public PlusApiResultPagePlusUserVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusUserVO) client.post(ApiPaths.backendPath("/user/list"), body, params);
    }

    /** Get all users */
    public PlusApiResultListPlusUserVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusUserVO) client.post(ApiPaths.backendPath("/user/list/all"), body);
    }

    /** Get a user by ID */
    public PlusApiResultPlusUserVO getById(String id) throws Exception {
        return (PlusApiResultPlusUserVO) client.get(ApiPaths.backendPath("/user/" + id + ""));
    }

    /** Delete a user */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/user/" + id + ""));
    }

    /** Get current user profile */
    public PlusApiResultPlusUserProfileVO getProfile() throws Exception {
        return (PlusApiResultPlusUserProfileVO) client.get(ApiPaths.backendPath("/user/profile"));
    }
}
