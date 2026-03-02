package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ShopApi(private val client: HttpClient) {

    /** Update an existing shop */
    suspend fun update(body: PlusShopForm): PlusApiResultPlusShopVO? {
        return client.put(ApiPaths.backendPath("/shop"), body) as? PlusApiResultPlusShopVO
    }

    /** Create a new shop */
    suspend fun create(body: PlusShopForm): PlusApiResultPlusShopVO? {
        return client.post(ApiPaths.backendPath("/shop"), body) as? PlusApiResultPlusShopVO
    }

    /** Get shops by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusShopVO? {
        return client.post(ApiPaths.backendPath("/shop/list"), body, params) as? PlusApiResultPagePlusShopVO
    }

    /** Get all shops */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusShopVO? {
        return client.post(ApiPaths.backendPath("/shop/list/all"), body) as? PlusApiResultListPlusShopVO
    }

    /** Get a shop by ID */
    suspend fun getById(id: String): PlusApiResultPlusShopVO? {
        return client.get(ApiPaths.backendPath("/shop/$id")) as? PlusApiResultPlusShopVO
    }

    /** Delete a shop */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/shop/$id")) as? PlusApiResultBoolean
    }
}
