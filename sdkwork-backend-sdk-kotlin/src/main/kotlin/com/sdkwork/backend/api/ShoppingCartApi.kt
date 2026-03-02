package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ShoppingCartApi(private val client: HttpClient) {

    /** Update shopping cart */
    suspend fun update(body: PlusShoppingCartForm): PlusApiResultPlusShoppingCartVO? {
        return client.put(ApiPaths.backendPath("/trade/shopping/cart"), body) as? PlusApiResultPlusShoppingCartVO
    }

    /** Create shopping cart */
    suspend fun create(body: PlusShoppingCartForm): PlusApiResultPlusShoppingCartVO? {
        return client.post(ApiPaths.backendPath("/trade/shopping/cart"), body) as? PlusApiResultPlusShoppingCartVO
    }

    /** Get shopping carts by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusShoppingCartVO? {
        return client.post(ApiPaths.backendPath("/trade/shopping/cart/list"), body, params) as? PlusApiResultPagePlusShoppingCartVO
    }

    /** Get all shopping carts */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusShoppingCartVO? {
        return client.post(ApiPaths.backendPath("/trade/shopping/cart/list/all"), body) as? PlusApiResultListPlusShoppingCartVO
    }

    /** Get shopping cart by ID */
    suspend fun getById(id: String): PlusApiResultPlusShoppingCartVO? {
        return client.get(ApiPaths.backendPath("/trade/shopping/cart/$id")) as? PlusApiResultPlusShoppingCartVO
    }

    /** Delete shopping cart */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/shopping/cart/$id")) as? PlusApiResultBoolean
    }
}
