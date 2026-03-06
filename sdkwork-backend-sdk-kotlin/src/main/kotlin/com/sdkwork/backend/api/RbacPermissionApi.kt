package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class RbacPermissionApi(private val client: HttpClient) {

    suspend fun update(body: PlusPermissionForm): PlusApiResultPlusPermissionVO? {
        return client.put(ApiPaths.backendPath("/permission"), body) as? PlusApiResultPlusPermissionVO
    }

    suspend fun create(body: PlusPermissionForm): PlusApiResultPlusPermissionVO? {
        return client.post(ApiPaths.backendPath("/permission"), body) as? PlusApiResultPlusPermissionVO
    }

    /** List permissions by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusPermissionVO? {
        return client.post(ApiPaths.backendPath("/permission/list"), body, params) as? PlusApiResultPagePlusPermissionVO
    }

    /** List all permissions */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusPermissionVO? {
        return client.post(ApiPaths.backendPath("/permission/list/all"), body) as? PlusApiResultListPlusPermissionVO
    }

    suspend fun getById(id: String): PlusApiResultPlusPermissionVO? {
        return client.get(ApiPaths.backendPath("/permission/$id")) as? PlusApiResultPlusPermissionVO
    }

    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/permission/$id")) as? PlusApiResultBoolean
    }
}
