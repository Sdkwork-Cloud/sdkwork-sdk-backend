package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class RbacRoleApi(private val client: HttpClient) {

    /** Update an existing system role */
    suspend fun update(body: PlusRoleForm): PlusApiResultPlusRoleVO? {
        return client.put(ApiPaths.backendPath("/role"), body) as? PlusApiResultPlusRoleVO
    }

    /** Create a new system role */
    suspend fun create(body: PlusRoleForm): PlusApiResultPlusRoleVO? {
        return client.post(ApiPaths.backendPath("/role"), body) as? PlusApiResultPlusRoleVO
    }

    /** Get system roles by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusRoleVO? {
        return client.post(ApiPaths.backendPath("/role/list"), body, params) as? PlusApiResultPagePlusRoleVO
    }

    /** Get all system roles */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusRoleVO? {
        return client.post(ApiPaths.backendPath("/role/list/all"), body) as? PlusApiResultListPlusRoleVO
    }

    /** Get a system role by ID */
    suspend fun getById(id: String): PlusApiResultPlusRoleVO? {
        return client.get(ApiPaths.backendPath("/role/$id")) as? PlusApiResultPlusRoleVO
    }

    /** Delete a system role */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/role/$id")) as? PlusApiResultBoolean
    }
}
