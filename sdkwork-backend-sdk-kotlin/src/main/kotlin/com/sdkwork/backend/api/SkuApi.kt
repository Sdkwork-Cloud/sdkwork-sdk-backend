package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class SkuApi(private val client: HttpClient) {

    /** Update an existing SKU */
    suspend fun update(body: PlusSkuForm): PlusApiResultPlusSkuVO? {
        return client.put(ApiPaths.backendPath("/sku"), body) as? PlusApiResultPlusSkuVO
    }

    /** Create a new SKU */
    suspend fun create(body: PlusSkuForm): PlusApiResultPlusSkuVO? {
        return client.post(ApiPaths.backendPath("/sku"), body) as? PlusApiResultPlusSkuVO
    }

    /** Get SKUs by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusSkuVO? {
        return client.post(ApiPaths.backendPath("/sku/list"), body, params) as? PlusApiResultPagePlusSkuVO
    }

    /** Get all SKUs */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusSkuVO? {
        return client.post(ApiPaths.backendPath("/sku/list/all"), body) as? PlusApiResultListPlusSkuVO
    }

    /** Get an SKU by ID */
    suspend fun getById(id: String): PlusApiResultPlusSkuVO? {
        return client.get(ApiPaths.backendPath("/sku/$id")) as? PlusApiResultPlusSkuVO
    }

    /** Delete an SKU */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/sku/$id")) as? PlusApiResultBoolean
    }
}
