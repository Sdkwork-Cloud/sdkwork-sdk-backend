package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class RoleApi(private val client: HttpClient) {

    /** Update an existing system role */
    suspend fun update(body: PlusRoleForm): PlusApiResultPlusRoleVO? {
        return client.put(ApiPaths.backendPath("/role"), body) as? PlusApiResultPlusRoleVO
    }

    /** Create a new system role */
    suspend fun create(body: PlusRoleForm): PlusApiResultPlusRoleVO? {
        return client.post(ApiPaths.backendPath("/role"), body) as? PlusApiResultPlusRoleVO
    }

    /** Update role-permission association */
    suspend fun updatePermission(body: PlusRolePermissionForm): PlusApiResultPlusRolePermissionVO? {
        return client.put(ApiPaths.backendPath("/role/permission"), body) as? PlusApiResultPlusRolePermissionVO
    }

    /** Create role-permission association */
    suspend fun createPermission(body: PlusRolePermissionForm): PlusApiResultPlusRolePermissionVO? {
        return client.post(ApiPaths.backendPath("/role/permission"), body) as? PlusApiResultPlusRolePermissionVO
    }

    /** Get role-permission associations by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusRolePermissionVO? {
        return client.post(ApiPaths.backendPath("/role/permission/list"), body, params) as? PlusApiResultPagePlusRolePermissionVO
    }

    /** Get all role-permission associations */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusRolePermissionVO? {
        return client.post(ApiPaths.backendPath("/role/permission/list/all"), body) as? PlusApiResultListPlusRolePermissionVO
    }

    /** Get system roles by page */
    suspend fun createListByPageRole(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusRoleVO? {
        return client.post(ApiPaths.backendPath("/role/list"), body, params) as? PlusApiResultPagePlusRoleVO
    }

    /** Get all system roles */
    suspend fun createListAllEntitiesRole(body: QueryListForm? = null): PlusApiResultListPlusRoleVO? {
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

    /** Get role-permission association by ID */
    suspend fun getByIdPermission(id: String): PlusApiResultPlusRolePermissionVO? {
        return client.get(ApiPaths.backendPath("/role/permission/$id")) as? PlusApiResultPlusRolePermissionVO
    }

    /** Delete role-permission association */
    suspend fun deletePermission(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/role/permission/$id")) as? PlusApiResultBoolean
    }
}
