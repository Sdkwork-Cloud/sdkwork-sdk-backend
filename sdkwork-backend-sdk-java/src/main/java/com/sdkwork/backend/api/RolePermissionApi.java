package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class RolePermissionApi {
    private final HttpClient client;
    
    public RolePermissionApi(HttpClient client) {
        this.client = client;
    }

    /** Update role-permission association */
    public PlusApiResultPlusRolePermissionVO update(PlusRolePermissionForm body) throws Exception {
        return (PlusApiResultPlusRolePermissionVO) client.put(ApiPaths.backendPath("/role/permission"), body);
    }

    /** Create role-permission association */
    public PlusApiResultPlusRolePermissionVO create(PlusRolePermissionForm body) throws Exception {
        return (PlusApiResultPlusRolePermissionVO) client.post(ApiPaths.backendPath("/role/permission"), body);
    }

    /** Get role-permission associations by page */
    public PlusApiResultPagePlusRolePermissionVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusRolePermissionVO) client.post(ApiPaths.backendPath("/role/permission/list"), body, params);
    }

    /** Get all role-permission associations */
    public PlusApiResultListPlusRolePermissionVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusRolePermissionVO) client.post(ApiPaths.backendPath("/role/permission/list/all"), body);
    }

    /** Get role-permission association by ID */
    public PlusApiResultPlusRolePermissionVO getById(String id) throws Exception {
        return (PlusApiResultPlusRolePermissionVO) client.get(ApiPaths.backendPath("/role/permission/" + id + ""));
    }

    /** Delete role-permission association */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/role/permission/" + id + ""));
    }
}
