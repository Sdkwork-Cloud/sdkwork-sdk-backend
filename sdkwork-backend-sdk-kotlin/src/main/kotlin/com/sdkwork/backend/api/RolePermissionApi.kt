package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class RolePermissionApi(private val client: HttpClient) {

    /** Update role-permission association */
    suspend fun update(body: PlusRolePermissionForm): PlusApiResultPlusRolePermissionVO? {
        return client.put(ApiPaths.backendPath("/role/permission"), body) as? PlusApiResultPlusRolePermissionVO
    }

    /** Create role-permission association */
    suspend fun create(body: PlusRolePermissionForm): PlusApiResultPlusRolePermissionVO? {
        return client.post(ApiPaths.backendPath("/role/permission"), body) as? PlusApiResultPlusRolePermissionVO
    }

    /** Get role-permission associations by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusRolePermissionVO? {
        return client.post(ApiPaths.backendPath("/role/permission/list"), body, params) as? PlusApiResultPagePlusRolePermissionVO
    }

    /** Get all role-permission associations */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusRolePermissionVO? {
        return client.post(ApiPaths.backendPath("/role/permission/list/all"), body) as? PlusApiResultListPlusRolePermissionVO
    }

    /** Get role-permission association by ID */
    suspend fun getById(id: String): PlusApiResultPlusRolePermissionVO? {
        return client.get(ApiPaths.backendPath("/role/permission/$id")) as? PlusApiResultPlusRolePermissionVO
    }

    /** Delete role-permission association */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/role/permission/$id")) as? PlusApiResultBoolean
    }
}
