package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class RbacRoleApi {
    private final HttpClient client;
    
    public RbacRoleApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing system role */
    public PlusApiResultPlusRoleVO update(PlusRoleForm body) throws Exception {
        return (PlusApiResultPlusRoleVO) client.put(ApiPaths.backendPath("/role"), body);
    }

    /** Create a new system role */
    public PlusApiResultPlusRoleVO create(PlusRoleForm body) throws Exception {
        return (PlusApiResultPlusRoleVO) client.post(ApiPaths.backendPath("/role"), body);
    }

    /** Get system roles by page */
    public PlusApiResultPagePlusRoleVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusRoleVO) client.post(ApiPaths.backendPath("/role/list"), body, params);
    }

    /** Get all system roles */
    public PlusApiResultListPlusRoleVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusRoleVO) client.post(ApiPaths.backendPath("/role/list/all"), body);
    }

    /** Get a system role by ID */
    public PlusApiResultPlusRoleVO getById(String id) throws Exception {
        return (PlusApiResultPlusRoleVO) client.get(ApiPaths.backendPath("/role/" + id + ""));
    }

    /** Delete a system role */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/role/" + id + ""));
    }
}
