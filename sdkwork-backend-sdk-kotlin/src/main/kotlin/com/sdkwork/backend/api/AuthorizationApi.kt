package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AuthorizationApi(private val client: HttpClient) {

    /** 检查用户角色 */
    suspend fun hasRole(body: RoleCheckForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/auth/authorization/has_role"), body) as? PlusApiResultBoolean
    }

    /** 检查用户权限 */
    suspend fun hasPermission(body: PermissionCheckForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/auth/authorization/has_permission"), body) as? PlusApiResultBoolean
    }

    /** 获取用户角色列表 */
    suspend fun getRoles(): PlusApiResultListString? {
        return client.get(ApiPaths.backendPath("/auth/authorization/roles")) as? PlusApiResultListString
    }

    /** 获取用户权限列表 */
    suspend fun getPermissions(): PlusApiResultListString? {
        return client.get(ApiPaths.backendPath("/auth/authorization/permissions")) as? PlusApiResultListString
    }
}
