package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ProductApi(private val client: HttpClient) {

    /** Update an existing product */
    suspend fun update(body: PlusProductForm): PlusApiResultPlusProductVO? {
        return client.put(ApiPaths.backendPath("/product"), body) as? PlusApiResultPlusProductVO
    }

    /** Create a new product */
    suspend fun create(body: PlusProductForm): PlusApiResultPlusProductVO? {
        return client.post(ApiPaths.backendPath("/product"), body) as? PlusApiResultPlusProductVO
    }

    /** Get all products */
    suspend fun mallHome(body: QueryListForm? = null): PlusApiResultPlusMallHomeVO? {
        return client.post(ApiPaths.backendPath("/product/mall_home"), body) as? PlusApiResultPlusMallHomeVO
    }

    /** Get products by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusProductVO? {
        return client.post(ApiPaths.backendPath("/product/list"), body, params) as? PlusApiResultPagePlusProductVO
    }

    /** Get all products */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusProductVO? {
        return client.post(ApiPaths.backendPath("/product/list/all"), body) as? PlusApiResultListPlusProductVO
    }

    /** Get a product by ID */
    suspend fun getById(id: String): PlusApiResultPlusProductVO? {
        return client.get(ApiPaths.backendPath("/product/$id")) as? PlusApiResultPlusProductVO
    }

    /** Delete a product */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/product/$id")) as? PlusApiResultBoolean
    }

    /** Get a product by ID */
    suspend fun getDetail(params: Map<String, Any>? = null): PlusApiResultPlusProductVO? {
        return client.get(ApiPaths.backendPath("/product/detail"), params) as? PlusApiResultPlusProductVO
    }
}
