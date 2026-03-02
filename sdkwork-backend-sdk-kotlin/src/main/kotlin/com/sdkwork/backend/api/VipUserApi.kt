package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VipUserApi(private val client: HttpClient) {

    /** Update an existing VIP user */
    suspend fun update(body: PlusVipUserForm): PlusApiResultPlusVipUserVO? {
        return client.put(ApiPaths.backendPath("/vip/user"), body) as? PlusApiResultPlusVipUserVO
    }

    /** Create a new VIP user */
    suspend fun create(body: PlusVipUserForm): PlusApiResultPlusVipUserVO? {
        return client.post(ApiPaths.backendPath("/vip/user"), body) as? PlusApiResultPlusVipUserVO
    }

    /** Get VIP users by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipUserVO? {
        return client.post(ApiPaths.backendPath("/vip/user/list"), body, params) as? PlusApiResultPagePlusVipUserVO
    }

    /** Get all VIP users */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVipUserVO? {
        return client.post(ApiPaths.backendPath("/vip/user/list/all"), body) as? PlusApiResultListPlusVipUserVO
    }

    /** Get a VIP user by ID */
    suspend fun getCurrentUser(): PlusApiResultPlusVipUserVO? {
        return client.post(ApiPaths.backendPath("/vip/user/get_current_user"), null) as? PlusApiResultPlusVipUserVO
    }

    /** Get a VIP user by ID */
    suspend fun getById(id: String): PlusApiResultPlusVipUserVO? {
        return client.get(ApiPaths.backendPath("/vip/user/$id")) as? PlusApiResultPlusVipUserVO
    }

    /** Delete a VIP user */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/user/$id")) as? PlusApiResultBoolean
    }
}
