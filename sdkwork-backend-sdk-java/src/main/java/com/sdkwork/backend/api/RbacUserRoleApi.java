package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class RbacUserRoleApi {
    private final HttpClient client;
    
    public RbacUserRoleApi(HttpClient client) {
        this.client = client;
    }

    /** Update user-role relationship */
    public PlusApiResultPlusUserRoleVO update(PlusUserRoleForm body) throws Exception {
        return (PlusApiResultPlusUserRoleVO) client.put(ApiPaths.backendPath("/rbac/user/role"), body);
    }

    /** Create user-role relationship */
    public PlusApiResultPlusUserRoleVO create(PlusUserRoleForm body) throws Exception {
        return (PlusApiResultPlusUserRoleVO) client.post(ApiPaths.backendPath("/rbac/user/role"), body);
    }

    /** Get user-role relationships by page */
    public PlusApiResultPagePlusUserRoleVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusUserRoleVO) client.post(ApiPaths.backendPath("/rbac/user/role/list"), body, params);
    }

    /** Get all user-role relationships */
    public PlusApiResultListPlusUserRoleVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusUserRoleVO) client.post(ApiPaths.backendPath("/rbac/user/role/list/all"), body);
    }

    /** Get user-role relationship by ID */
    public PlusApiResultPlusUserRoleVO getById(String id) throws Exception {
        return (PlusApiResultPlusUserRoleVO) client.get(ApiPaths.backendPath("/rbac/user/role/" + id + ""));
    }

    /** Delete user-role relationship */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/rbac/user/role/" + id + ""));
    }
}
