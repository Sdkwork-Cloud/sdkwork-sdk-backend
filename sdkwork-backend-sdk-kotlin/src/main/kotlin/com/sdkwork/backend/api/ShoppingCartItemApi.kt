package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ShoppingCartItemApi(private val client: HttpClient) {

    /** Update an existing shopping cart item */
    suspend fun update(body: PlusShoppingCartItemForm): PlusApiResultPlusShoppingCartItemVO? {
        return client.put(ApiPaths.backendPath("/trade/shopping/cart/item"), body) as? PlusApiResultPlusShoppingCartItemVO
    }

    /** Create a new shopping cart item */
    suspend fun create(body: PlusShoppingCartItemForm): PlusApiResultPlusShoppingCartItemVO? {
        return client.post(ApiPaths.backendPath("/trade/shopping/cart/item"), body) as? PlusApiResultPlusShoppingCartItemVO
    }

    /** Get shopping cart items by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusShoppingCartItemVO? {
        return client.post(ApiPaths.backendPath("/trade/shopping/cart/item/list"), body, params) as? PlusApiResultPagePlusShoppingCartItemVO
    }

    /** Get all shopping cart items */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusShoppingCartItemVO? {
        return client.post(ApiPaths.backendPath("/trade/shopping/cart/item/list/all"), body) as? PlusApiResultListPlusShoppingCartItemVO
    }

    /** Get a shopping cart item by ID */
    suspend fun getById(id: String): PlusApiResultPlusShoppingCartItemVO? {
        return client.get(ApiPaths.backendPath("/trade/shopping/cart/item/$id")) as? PlusApiResultPlusShoppingCartItemVO
    }

    /** Delete a shopping cart item */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/shopping/cart/item/$id")) as? PlusApiResultBoolean
    }
}
