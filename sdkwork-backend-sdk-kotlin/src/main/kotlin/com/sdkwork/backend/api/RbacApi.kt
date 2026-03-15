package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class RbacApi(private val client: HttpClient) {

    /** Update user-role relationship */
    suspend fun update(body: PlusUserRoleForm): PlusApiResultPlusUserRoleVO? {
        return client.put(ApiPaths.backendPath("/rbac/user/role"), body) as? PlusApiResultPlusUserRoleVO
    }

    /** Create user-role relationship */
    suspend fun create(body: PlusUserRoleForm): PlusApiResultPlusUserRoleVO? {
        return client.post(ApiPaths.backendPath("/rbac/user/role"), body) as? PlusApiResultPlusUserRoleVO
    }

    /** Get user-role relationships by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusUserRoleVO? {
        return client.post(ApiPaths.backendPath("/rbac/user/role/list"), body, params) as? PlusApiResultPagePlusUserRoleVO
    }

    /** Get all user-role relationships */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusUserRoleVO? {
        return client.post(ApiPaths.backendPath("/rbac/user/role/list/all"), body) as? PlusApiResultListPlusUserRoleVO
    }

    /** Get user-role relationship by ID */
    suspend fun getById(id: String): PlusApiResultPlusUserRoleVO? {
        return client.get(ApiPaths.backendPath("/rbac/user/role/$id")) as? PlusApiResultPlusUserRoleVO
    }

    /** Delete user-role relationship */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/rbac/user/role/$id")) as? PlusApiResultBoolean
    }
}
