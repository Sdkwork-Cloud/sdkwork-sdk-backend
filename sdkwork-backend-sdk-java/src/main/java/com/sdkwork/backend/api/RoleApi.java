package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class RoleApi {
    private final HttpClient client;
    
    public RoleApi(HttpClient client) {
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

    /** Update role-permission association */
    public PlusApiResultPlusRolePermissionVO updatePermission(PlusRolePermissionForm body) throws Exception {
        return (PlusApiResultPlusRolePermissionVO) client.put(ApiPaths.backendPath("/role/permission"), body);
    }

    /** Create role-permission association */
    public PlusApiResultPlusRolePermissionVO createPermission(PlusRolePermissionForm body) throws Exception {
        return (PlusApiResultPlusRolePermissionVO) client.post(ApiPaths.backendPath("/role/permission"), body);
    }

    /** Get role-permission associations by page */
    public PlusApiResultPagePlusRolePermissionVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusRolePermissionVO) client.post(ApiPaths.backendPath("/role/permission/list"), body, params);
    }

    /** Get all role-permission associations */
    public PlusApiResultListPlusRolePermissionVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusRolePermissionVO) client.post(ApiPaths.backendPath("/role/permission/list/all"), body);
    }

    /** Get system roles by page */
    public PlusApiResultPagePlusRoleVO createListByPageRole(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusRoleVO) client.post(ApiPaths.backendPath("/role/list"), body, params);
    }

    /** Get all system roles */
    public PlusApiResultListPlusRoleVO createListAllEntitiesRole(QueryListForm body) throws Exception {
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

    /** Get role-permission association by ID */
    public PlusApiResultPlusRolePermissionVO getByIdPermission(String id) throws Exception {
        return (PlusApiResultPlusRolePermissionVO) client.get(ApiPaths.backendPath("/role/permission/" + id + ""));
    }

    /** Delete role-permission association */
    public PlusApiResultBoolean deletePermission(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/role/permission/" + id + ""));
    }
}
