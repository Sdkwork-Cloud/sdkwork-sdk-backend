package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class TradeApi(private val client: HttpClient) {

    /** Update shopping cart */
    suspend fun update(body: PlusShoppingCartForm): PlusApiResultPlusShoppingCartVO? {
        return client.put(ApiPaths.backendPath("/trade/shopping/cart"), body) as? PlusApiResultPlusShoppingCartVO
    }

    /** Create shopping cart */
    suspend fun create(body: PlusShoppingCartForm): PlusApiResultPlusShoppingCartVO? {
        return client.post(ApiPaths.backendPath("/trade/shopping/cart"), body) as? PlusApiResultPlusShoppingCartVO
    }

    /** Update an existing shopping cart item */
    suspend fun updateItem(body: PlusShoppingCartItemForm): PlusApiResultPlusShoppingCartItemVO? {
        return client.put(ApiPaths.backendPath("/trade/shopping/cart/item"), body) as? PlusApiResultPlusShoppingCartItemVO
    }

    /** Create a new shopping cart item */
    suspend fun createItem(body: PlusShoppingCartItemForm): PlusApiResultPlusShoppingCartItemVO? {
        return client.post(ApiPaths.backendPath("/trade/shopping/cart/item"), body) as? PlusApiResultPlusShoppingCartItemVO
    }

    /** Update an existing refund record */
    suspend fun updateRefund(body: PlusRefundForm): PlusApiResultPlusRefundVO? {
        return client.put(ApiPaths.backendPath("/trade/refund"), body) as? PlusApiResultPlusRefundVO
    }

    /** Create a new refund record */
    suspend fun createRefund(body: PlusRefundForm): PlusApiResultPlusRefundVO? {
        return client.post(ApiPaths.backendPath("/trade/refund"), body) as? PlusApiResultPlusRefundVO
    }

    /** Update an existing payment record */
    suspend fun updatePayment(body: PlusPaymentForm): PlusApiResultPlusPaymentVO? {
        return client.put(ApiPaths.backendPath("/trade/payment"), body) as? PlusApiResultPlusPaymentVO
    }

    /** Create a new payment record */
    suspend fun createPayment(body: PlusPaymentForm): PlusApiResultPlusPaymentVO? {
        return client.post(ApiPaths.backendPath("/trade/payment"), body) as? PlusApiResultPlusPaymentVO
    }

    /** Update an existing order */
    suspend fun updateOrder(body: PlusOrderForm): PlusApiResultPlusOrderVO? {
        return client.put(ApiPaths.backendPath("/trade/order"), body) as? PlusApiResultPlusOrderVO
    }

    /** Create a new order */
    suspend fun createOrder(body: PlusOrderForm): PlusApiResultPlusOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order"), body) as? PlusApiResultPlusOrderVO
    }

    /** Update worker dispatch profile */
    suspend fun updateWorkerDispatchProfile(body: PlusOrderWorkerDispatchProfileForm): PlusApiResultPlusOrderWorkerDispatchProfileVO? {
        return client.put(ApiPaths.backendPath("/trade/order/worker-dispatch-profile"), body) as? PlusApiResultPlusOrderWorkerDispatchProfileVO
    }

    /** Create worker dispatch profile */
    suspend fun createWorkerDispatchProfile(body: PlusOrderWorkerDispatchProfileForm): PlusApiResultPlusOrderWorkerDispatchProfileVO? {
        return client.post(ApiPaths.backendPath("/trade/order/worker-dispatch-profile"), body) as? PlusApiResultPlusOrderWorkerDispatchProfileVO
    }

    /** Update an existing order item */
    suspend fun updateItem2(body: PlusOrderItemForm): PlusApiResultPlusOrderItemVO? {
        return client.put(ApiPaths.backendPath("/trade/order/item"), body) as? PlusApiResultPlusOrderItemVO
    }

    /** Create a new order item */
    suspend fun createItem2(body: PlusOrderItemForm): PlusApiResultPlusOrderItemVO? {
        return client.post(ApiPaths.backendPath("/trade/order/item"), body) as? PlusApiResultPlusOrderItemVO
    }

    /** Update dispatch rule */
    suspend fun updateDispatchRule(body: PlusOrderDispatchRuleForm): PlusApiResultPlusOrderDispatchRuleVO? {
        return client.put(ApiPaths.backendPath("/trade/order/dispatch-rule"), body) as? PlusApiResultPlusOrderDispatchRuleVO
    }

    /** Create dispatch rule */
    suspend fun createDispatchRule(body: PlusOrderDispatchRuleForm): PlusApiResultPlusOrderDispatchRuleVO? {
        return client.post(ApiPaths.backendPath("/trade/order/dispatch-rule"), body) as? PlusApiResultPlusOrderDispatchRuleVO
    }

    /** Get shopping carts by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusShoppingCartVO? {
        return client.post(ApiPaths.backendPath("/trade/shopping/cart/list"), body, params) as? PlusApiResultPagePlusShoppingCartVO
    }

    /** Get all shopping carts */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusShoppingCartVO? {
        return client.post(ApiPaths.backendPath("/trade/shopping/cart/list/all"), body) as? PlusApiResultListPlusShoppingCartVO
    }

    /** Get shopping cart items by page */
    suspend fun createListByPageItem(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusShoppingCartItemVO? {
        return client.post(ApiPaths.backendPath("/trade/shopping/cart/item/list"), body, params) as? PlusApiResultPagePlusShoppingCartItemVO
    }

    /** Get all shopping cart items */
    suspend fun createListAllEntitiesItem(body: QueryListForm? = null): PlusApiResultListPlusShoppingCartItemVO? {
        return client.post(ApiPaths.backendPath("/trade/shopping/cart/item/list/all"), body) as? PlusApiResultListPlusShoppingCartItemVO
    }

    /** Get refund records by page */
    suspend fun createListByPageRefund(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusRefundVO? {
        return client.post(ApiPaths.backendPath("/trade/refund/list"), body, params) as? PlusApiResultPagePlusRefundVO
    }

    /** Get all refund records */
    suspend fun createListAllEntitiesRefund(body: QueryListForm? = null): PlusApiResultListPlusRefundVO? {
        return client.post(ApiPaths.backendPath("/trade/refund/list/all"), body) as? PlusApiResultListPlusRefundVO
    }

    /** Check payment status */
    suspend fun checkPaymentStatus(body: PlusPaymentStatusQueryForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/trade/payment/status"), body) as? PlusApiResultBoolean
    }

    /** Refund payment */
    suspend fun refundPayment(body: PlusRefundForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/trade/payment/refund"), body) as? PlusApiResultBoolean
    }

    /** Get payment records by page */
    suspend fun createListByPagePayment(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusPaymentVO? {
        return client.post(ApiPaths.backendPath("/trade/payment/list"), body, params) as? PlusApiResultPagePlusPaymentVO
    }

    /** Get all payment records */
    suspend fun createListAllEntitiesPayment(body: QueryListForm? = null): PlusApiResultListPlusPaymentVO? {
        return client.post(ApiPaths.backendPath("/trade/payment/list/all"), body) as? PlusApiResultListPlusPaymentVO
    }

    /** Cancel payment */
    suspend fun cancelPayment(body: PlusPaymentCancelForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/trade/payment/cancel"), body) as? PlusApiResultBoolean
    }

    /** Ship an order */
    suspend fun shipOrder(id: String, body: String? = null): PlusApiResultOrderShipVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/ship"), body) as? PlusApiResultOrderShipVO
    }

    /** Start service order */
    suspend fun startServiceOrder(id: String, body: OrderDispatchActionForm? = null): PlusApiResultServiceOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/dispatch/start"), body) as? PlusApiResultServiceOrderVO
    }

    /** Release service order */
    suspend fun releaseServiceOrder(id: String, body: OrderDispatchActionForm? = null): PlusApiResultServiceOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/dispatch/release"), body) as? PlusApiResultServiceOrderVO
    }

    /** Complete service order */
    suspend fun completeServiceOrder(id: String, body: OrderDispatchActionForm? = null): PlusApiResultServiceOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/dispatch/complete"), body) as? PlusApiResultServiceOrderVO
    }

    /** Claim service order */
    suspend fun claimServiceOrder(id: String, body: OrderDispatchActionForm? = null): PlusApiResultServiceOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/dispatch/claim"), body) as? PlusApiResultServiceOrderVO
    }

    /** Assign service order */
    suspend fun assignServiceOrder(id: String, body: OrderDispatchAssignForm): PlusApiResultServiceOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/dispatch/assign"), body) as? PlusApiResultServiceOrderVO
    }

    /** Confirm an order */
    suspend fun confirmOrder(id: String): PlusApiResultOrderConfirmVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/confirm"), null) as? PlusApiResultOrderConfirmVO
    }

    /** Complete an order */
    suspend fun completeOrder(id: String): PlusApiResultOrderCompleteVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/complete"), null) as? PlusApiResultOrderCompleteVO
    }

    /** Close an order */
    suspend fun closeOrder(id: String): PlusApiResultOrderCloseVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/close"), null) as? PlusApiResultOrderCloseVO
    }

    /** Cancel an order */
    suspend fun cancelOrder(id: String): PlusApiResultOrderCancelVO? {
        return client.post(ApiPaths.backendPath("/trade/order/$id/cancel"), null) as? PlusApiResultOrderCancelVO
    }

    /** List worker dispatch profiles by page */
    suspend fun createListByPageWorkerDispatchProfile(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusOrderWorkerDispatchProfileVO? {
        return client.post(ApiPaths.backendPath("/trade/order/worker-dispatch-profile/list"), body, params) as? PlusApiResultPagePlusOrderWorkerDispatchProfileVO
    }

    /** List all worker dispatch profiles */
    suspend fun createListAllEntitiesWorkerDispatchProfile(body: QueryListForm? = null): PlusApiResultListPlusOrderWorkerDispatchProfileVO? {
        return client.post(ApiPaths.backendPath("/trade/order/worker-dispatch-profile/list/all"), body) as? PlusApiResultListPlusOrderWorkerDispatchProfileVO
    }

    /** Create virtual order */
    suspend fun createVirtualOrder(body: CreateVirtualOrderForm): PlusApiResultVirtualOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/virtual"), body) as? PlusApiResultVirtualOrderVO
    }

    /** Create VIP order */
    suspend fun createVipOrder(body: CreateVipOrderForm): PlusApiResultVipOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/vip"), body) as? PlusApiResultVipOrderVO
    }

    /** Create service order */
    suspend fun createServiceOrder(body: CreateServiceOrderForm): PlusApiResultServiceOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/service"), body) as? PlusApiResultServiceOrderVO
    }

    /** Create points order */
    suspend fun createPointsOrder(body: CreatePointsOrderForm): PlusApiResultPointsOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/points"), body) as? PlusApiResultPointsOrderVO
    }

    /** Get orders by page */
    suspend fun createListByPageOrder(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/list"), body, params) as? PlusApiResultPagePlusOrderVO
    }

    /** Get all orders */
    suspend fun createListAllEntitiesOrder(body: QueryListForm? = null): PlusApiResultListPlusOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/list/all"), body) as? PlusApiResultListPlusOrderVO
    }

    /** Get order items by page */
    suspend fun createListByPageItem2(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusOrderItemVO? {
        return client.post(ApiPaths.backendPath("/trade/order/item/list"), body, params) as? PlusApiResultPagePlusOrderItemVO
    }

    /** Get all order items */
    suspend fun createListAllEntitiesItem2(body: QueryListForm? = null): PlusApiResultListPlusOrderItemVO? {
        return client.post(ApiPaths.backendPath("/trade/order/item/list/all"), body) as? PlusApiResultListPlusOrderItemVO
    }

    /** Create IM group order */
    suspend fun createImGroupOrder(body: CreateImGroupOrderForm): PlusApiResultImGroupOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/im_group"), body) as? PlusApiResultImGroupOrderVO
    }

    /** Create goods order */
    suspend fun createGoodsOrder(body: CreateGoodsOrderForm): PlusApiResultGoodsOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/goods"), body) as? PlusApiResultGoodsOrderVO
    }

    /** List dispatch rules by page */
    suspend fun createListByPageDispatchRule(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusOrderDispatchRuleVO? {
        return client.post(ApiPaths.backendPath("/trade/order/dispatch-rule/list"), body, params) as? PlusApiResultPagePlusOrderDispatchRuleVO
    }

    /** List all dispatch rules */
    suspend fun createListAllEntitiesDispatchRule(body: QueryListForm? = null): PlusApiResultListPlusOrderDispatchRuleVO? {
        return client.post(ApiPaths.backendPath("/trade/order/dispatch-rule/list/all"), body) as? PlusApiResultListPlusOrderDispatchRuleVO
    }

    /** Create booking order */
    suspend fun createBookingOrder(body: CreateBookingOrderForm): PlusApiResultBookingOrderVO? {
        return client.post(ApiPaths.backendPath("/trade/order/booking"), body) as? PlusApiResultBookingOrderVO
    }

    /** Get shopping cart by ID */
    suspend fun getById(id: String): PlusApiResultPlusShoppingCartVO? {
        return client.get(ApiPaths.backendPath("/trade/shopping/cart/$id")) as? PlusApiResultPlusShoppingCartVO
    }

    /** Delete shopping cart */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/shopping/cart/$id")) as? PlusApiResultBoolean
    }

    /** Get a shopping cart item by ID */
    suspend fun getByIdItem(id: String): PlusApiResultPlusShoppingCartItemVO? {
        return client.get(ApiPaths.backendPath("/trade/shopping/cart/item/$id")) as? PlusApiResultPlusShoppingCartItemVO
    }

    /** Delete a shopping cart item */
    suspend fun deleteItem(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/shopping/cart/item/$id")) as? PlusApiResultBoolean
    }

    /** Get a refund record by ID */
    suspend fun getByIdRefund(id: String): PlusApiResultPlusRefundVO? {
        return client.get(ApiPaths.backendPath("/trade/refund/$id")) as? PlusApiResultPlusRefundVO
    }

    /** Delete a refund record */
    suspend fun deleteRefund(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/refund/$id")) as? PlusApiResultBoolean
    }

    /** Get a payment record by ID */
    suspend fun getByIdPayment(id: String): PlusApiResultPlusPaymentVO? {
        return client.get(ApiPaths.backendPath("/trade/payment/$id")) as? PlusApiResultPlusPaymentVO
    }

    /** Delete a payment record */
    suspend fun deletePayment(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/payment/$id")) as? PlusApiResultBoolean
    }

    /** Get an order by ID */
    suspend fun getByIdOrder(id: String): PlusApiResultPlusOrderVO? {
        return client.get(ApiPaths.backendPath("/trade/order/$id")) as? PlusApiResultPlusOrderVO
    }

    /** Delete an order */
    suspend fun deleteOrder(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/order/$id")) as? PlusApiResultBoolean
    }

    /** Get worker dispatch profile by id */
    suspend fun getByIdWorkerDispatchProfile(id: String): PlusApiResultPlusOrderWorkerDispatchProfileVO? {
        return client.get(ApiPaths.backendPath("/trade/order/worker-dispatch-profile/$id")) as? PlusApiResultPlusOrderWorkerDispatchProfileVO
    }

    /** Delete worker dispatch profile */
    suspend fun deleteWorkerDispatchProfile(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/order/worker-dispatch-profile/$id")) as? PlusApiResultBoolean
    }

    /** Get an order item by ID */
    suspend fun getByIdItem2(id: String): PlusApiResultPlusOrderItemVO? {
        return client.get(ApiPaths.backendPath("/trade/order/item/$id")) as? PlusApiResultPlusOrderItemVO
    }

    /** Delete an order item */
    suspend fun deleteItem2(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/order/item/$id")) as? PlusApiResultBoolean
    }

    /** Get dispatch rule by id */
    suspend fun getByIdDispatchRule(id: String): PlusApiResultPlusOrderDispatchRuleVO? {
        return client.get(ApiPaths.backendPath("/trade/order/dispatch-rule/$id")) as? PlusApiResultPlusOrderDispatchRuleVO
    }

    /** Delete dispatch rule */
    suspend fun deleteDispatchRule(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/order/dispatch-rule/$id")) as? PlusApiResultBoolean
    }
}
