package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VipLevelApi(private val client: HttpClient) {

    /** Update an existing VIP level */
    suspend fun update(body: PlusVipLevelForm): PlusApiResultPlusVipLevelVO? {
        return client.put(ApiPaths.backendPath("/vip/level"), body) as? PlusApiResultPlusVipLevelVO
    }

    /** Create a new VIP level */
    suspend fun create(body: PlusVipLevelForm): PlusApiResultPlusVipLevelVO? {
        return client.post(ApiPaths.backendPath("/vip/level"), body) as? PlusApiResultPlusVipLevelVO
    }

    /** Get VIP levels by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipLevelVO? {
        return client.post(ApiPaths.backendPath("/vip/level/list"), body, params) as? PlusApiResultPagePlusVipLevelVO
    }

    /** Get all VIP levels */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVipLevelVO? {
        return client.post(ApiPaths.backendPath("/vip/level/list/all"), body) as? PlusApiResultListPlusVipLevelVO
    }

    /** Get a VIP level by ID */
    suspend fun getById(id: String): PlusApiResultPlusVipLevelVO? {
        return client.get(ApiPaths.backendPath("/vip/level/$id")) as? PlusApiResultPlusVipLevelVO
    }

    /** Delete a VIP level */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/level/$id")) as? PlusApiResultBoolean
    }
}
