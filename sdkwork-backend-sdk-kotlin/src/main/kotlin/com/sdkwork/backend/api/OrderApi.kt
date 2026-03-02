package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class OrderApi(private val client: HttpClient) {

    /** Update an existing order */
    suspend fun update(body: PlusOrderForm): PlusApiResultPlusOrderVO? {
        return client.put(ApiPaths.backendPath("/trade/order"), body) as? PlusApiResultPlusOrderVO
    }

    /** Create a new order */
    suspend fun create(body: PlusOrderForm): PlusApiResultPlusOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order"), body) as? PlusApiResultPlusOrderVO
    }

    /** Ship an order */
    suspend fun ship(id: String, body: String): PlusApiResultOrderShipVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/ship"), body) as? PlusApiResultOrderShipVO
    }

    /** Confirm an order */
    suspend fun confirm(id: String): PlusApiResultOrderConfirmVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/confirm"), null) as? PlusApiResultOrderConfirmVO
    }

    /** Complete an order */
    suspend fun complete(id: String): PlusApiResultOrderCompleteVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/complete"), null) as? PlusApiResultOrderCompleteVO
    }

    /** Close an order */
    suspend fun close(id: String): PlusApiResultOrderCloseVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/close"), null) as? PlusApiResultOrderCloseVO
    }

    /** Cancel an order */
    suspend fun cancel(id: String): PlusApiResultOrderCancelVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/cancel"), null) as? PlusApiResultOrderCancelVO
    }

    /** Create virtual order */
    suspend fun createVirtual(body: CreateVirtualOrderForm): PlusApiResultVirtualOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/virtual"), body) as? PlusApiResultVirtualOrderVO
    }

    /** Create VIP order */
    suspend fun createVip(body: CreateVipOrderForm): PlusApiResultVipOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/vip"), body) as? PlusApiResultVipOrderVO
    }

    /** Create points order */
    suspend fun createPoints(body: CreatePointsOrderForm): PlusApiResultPointsOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/points"), body) as? PlusApiResultPointsOrderVO
    }

    /** Get orders by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/list"), body, params) as? PlusApiResultPagePlusOrderVO
    }

    /** Get all orders */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/list/all"), body) as? PlusApiResultListPlusOrderVO
    }

    /** Create IM group order */
    suspend fun createImGroup(body: CreateImGroupOrderForm): PlusApiResultImGroupOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/im_group"), body) as? PlusApiResultImGroupOrderVO
    }

    /** Create goods order */
    suspend fun createGoods(body: CreateGoodsOrderForm): PlusApiResultGoodsOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/goods"), body) as? PlusApiResultGoodsOrderVO
    }

    /** Get an order by ID */
    suspend fun getById(id: String): PlusApiResultPlusOrderVO? {
        return client.get(ApiPaths.backendPath("/trade/order/$id")) as? PlusApiResultPlusOrderVO
    }

    /** Delete an order */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/order/$id")) as? PlusApiResultBoolean
    }
}
