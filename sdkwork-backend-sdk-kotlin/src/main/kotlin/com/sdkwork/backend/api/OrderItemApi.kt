package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class OrderItemApi(private val client: HttpClient) {

    /** Update an existing order item */
    suspend fun update(body: PlusOrderItemForm): PlusApiResultPlusOrderItemVO? {
        return client.put(ApiPaths.backendPath("/trade/order/item"), body) as? PlusApiResultPlusOrderItemVO
    }

    /** Create a new order item */
    suspend fun create(body: PlusOrderItemForm): PlusApiResultPlusOrderItemVO? {
        return client.post(ApiPaths.backendPath("/trade/order/item"), body) as? PlusApiResultPlusOrderItemVO
    }

    /** Get order items by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusOrderItemVO? {
        return client.post(ApiPaths.backendPath("/trade/order/item/list"), body, params) as? PlusApiResultPagePlusOrderItemVO
    }

    /** Get all order items */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusOrderItemVO? {
        return client.post(ApiPaths.backendPath("/trade/order/item/list/all"), body) as? PlusApiResultListPlusOrderItemVO
    }

    /** Get an order item by ID */
    suspend fun getById(id: String): PlusApiResultPlusOrderItemVO? {
        return client.get(ApiPaths.backendPath("/trade/order/item/$id")) as? PlusApiResultPlusOrderItemVO
    }

    /** Delete an order item */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/order/item/$id")) as? PlusApiResultBoolean
    }
}
