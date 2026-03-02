package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AuthorizationApi {
    private final HttpClient client;
    
    public AuthorizationApi(HttpClient client) {
        this.client = client;
    }

    /** 检查用户角色 */
    public PlusApiResultBoolean hasRole(RoleCheckForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/auth/authorization/has_role"), body);
    }

    /** 检查用户权限 */
    public PlusApiResultBoolean hasPermission(PermissionCheckForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/auth/authorization/has_permission"), body);
    }

    /** 获取用户角色列表 */
    public PlusApiResultListString getRoles() throws Exception {
        return (PlusApiResultListString) client.get(ApiPaths.backendPath("/auth/authorization/roles"));
    }

    /** 获取用户权限列表 */
    public PlusApiResultListString getPermissions() throws Exception {
        return (PlusApiResultListString) client.get(ApiPaths.backendPath("/auth/authorization/permissions"));
    }
}
