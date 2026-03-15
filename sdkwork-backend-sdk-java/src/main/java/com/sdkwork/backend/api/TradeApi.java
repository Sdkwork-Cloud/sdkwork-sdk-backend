package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class TradeApi {
    private final HttpClient client;
    
    public TradeApi(HttpClient client) {
        this.client = client;
    }

    /** Update shopping cart */
    public PlusApiResultPlusShoppingCartVO update(PlusShoppingCartForm body) throws Exception {
        return (PlusApiResultPlusShoppingCartVO) client.put(ApiPaths.backendPath("/trade/shopping/cart"), body);
    }

    /** Create shopping cart */
    public PlusApiResultPlusShoppingCartVO create(PlusShoppingCartForm body) throws Exception {
        return (PlusApiResultPlusShoppingCartVO) client.post(ApiPaths.backendPath("/trade/shopping/cart"), body);
    }

    /** Update an existing shopping cart item */
    public PlusApiResultPlusShoppingCartItemVO updateItem(PlusShoppingCartItemForm body) throws Exception {
        return (PlusApiResultPlusShoppingCartItemVO) client.put(ApiPaths.backendPath("/trade/shopping/cart/item"), body);
    }

    /** Create a new shopping cart item */
    public PlusApiResultPlusShoppingCartItemVO createItem(PlusShoppingCartItemForm body) throws Exception {
        return (PlusApiResultPlusShoppingCartItemVO) client.post(ApiPaths.backendPath("/trade/shopping/cart/item"), body);
    }

    /** Update an existing refund record */
    public PlusApiResultPlusRefundVO updateRefund(PlusRefundForm body) throws Exception {
        return (PlusApiResultPlusRefundVO) client.put(ApiPaths.backendPath("/trade/refund"), body);
    }

    /** Create a new refund record */
    public PlusApiResultPlusRefundVO createRefund(PlusRefundForm body) throws Exception {
        return (PlusApiResultPlusRefundVO) client.post(ApiPaths.backendPath("/trade/refund"), body);
    }

    /** Update an existing payment record */
    public PlusApiResultPlusPaymentVO updatePayment(PlusPaymentForm body) throws Exception {
        return (PlusApiResultPlusPaymentVO) client.put(ApiPaths.backendPath("/trade/payment"), body);
    }

    /** Create a new payment record */
    public PlusApiResultPlusPaymentVO createPayment(PlusPaymentForm body) throws Exception {
        return (PlusApiResultPlusPaymentVO) client.post(ApiPaths.backendPath("/trade/payment"), body);
    }

    /** Update an existing order */
    public PlusApiResultPlusOrderVO updateOrder(PlusOrderForm body) throws Exception {
        return (PlusApiResultPlusOrderVO) client.put(ApiPaths.backendPath("/trade/order"), body);
    }

    /** Create a new order */
    public PlusApiResultPlusOrderVO createOrder(PlusOrderForm body) throws Exception {
        return (PlusApiResultPlusOrderVO) client.post(ApiPaths.backendPath("/trade/order"), body);
    }

    /** Update worker dispatch profile */
    public PlusApiResultPlusOrderWorkerDispatchProfileVO updateWorkerDispatchProfile(PlusOrderWorkerDispatchProfileForm body) throws Exception {
        return (PlusApiResultPlusOrderWorkerDispatchProfileVO) client.put(ApiPaths.backendPath("/trade/order/worker-dispatch-profile"), body);
    }

    /** Create worker dispatch profile */
    public PlusApiResultPlusOrderWorkerDispatchProfileVO createWorkerDispatchProfile(PlusOrderWorkerDispatchProfileForm body) throws Exception {
        return (PlusApiResultPlusOrderWorkerDispatchProfileVO) client.post(ApiPaths.backendPath("/trade/order/worker-dispatch-profile"), body);
    }

    /** Update an existing order item */
    public PlusApiResultPlusOrderItemVO updateItem2(PlusOrderItemForm body) throws Exception {
        return (PlusApiResultPlusOrderItemVO) client.put(ApiPaths.backendPath("/trade/order/item"), body);
    }

    /** Create a new order item */
    public PlusApiResultPlusOrderItemVO createItem2(PlusOrderItemForm body) throws Exception {
        return (PlusApiResultPlusOrderItemVO) client.post(ApiPaths.backendPath("/trade/order/item"), body);
    }

    /** Update dispatch rule */
    public PlusApiResultPlusOrderDispatchRuleVO updateDispatchRule(PlusOrderDispatchRuleForm body) throws Exception {
        return (PlusApiResultPlusOrderDispatchRuleVO) client.put(ApiPaths.backendPath("/trade/order/dispatch-rule"), body);
    }

    /** Create dispatch rule */
    public PlusApiResultPlusOrderDispatchRuleVO createDispatchRule(PlusOrderDispatchRuleForm body) throws Exception {
        return (PlusApiResultPlusOrderDispatchRuleVO) client.post(ApiPaths.backendPath("/trade/order/dispatch-rule"), body);
    }

    /** Get shopping carts by page */
    public PlusApiResultPagePlusShoppingCartVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusShoppingCartVO) client.post(ApiPaths.backendPath("/trade/shopping/cart/list"), body, params);
    }

    /** Get all shopping carts */
    public PlusApiResultListPlusShoppingCartVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusShoppingCartVO) client.post(ApiPaths.backendPath("/trade/shopping/cart/list/all"), body);
    }

    /** Get shopping cart items by page */
    public PlusApiResultPagePlusShoppingCartItemVO createListByPageItem(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusShoppingCartItemVO) client.post(ApiPaths.backendPath("/trade/shopping/cart/item/list"), body, params);
    }

    /** Get all shopping cart items */
    public PlusApiResultListPlusShoppingCartItemVO createListAllEntitiesItem(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusShoppingCartItemVO) client.post(ApiPaths.backendPath("/trade/shopping/cart/item/list/all"), body);
    }

    /** Get refund records by page */
    public PlusApiResultPagePlusRefundVO createListByPageRefund(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusRefundVO) client.post(ApiPaths.backendPath("/trade/refund/list"), body, params);
    }

    /** Get all refund records */
    public PlusApiResultListPlusRefundVO createListAllEntitiesRefund(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusRefundVO) client.post(ApiPaths.backendPath("/trade/refund/list/all"), body);
    }

    /** Check payment status */
    public PlusApiResultBoolean checkPaymentStatus(PlusPaymentStatusQueryForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/trade/payment/status"), body);
    }

    /** Refund payment */
    public PlusApiResultBoolean refundPayment(PlusRefundForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/trade/payment/refund"), body);
    }

    /** Get payment records by page */
    public PlusApiResultPagePlusPaymentVO createListByPagePayment(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusPaymentVO) client.post(ApiPaths.backendPath("/trade/payment/list"), body, params);
    }

    /** Get all payment records */
    public PlusApiResultListPlusPaymentVO createListAllEntitiesPayment(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusPaymentVO) client.post(ApiPaths.backendPath("/trade/payment/list/all"), body);
    }

    /** Cancel payment */
    public PlusApiResultBoolean cancelPayment(PlusPaymentCancelForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/trade/payment/cancel"), body);
    }

    /** Ship an order */
    public PlusApiResultOrderShipVO shipOrder(String id, String body) throws Exception {
        return (PlusApiResultOrderShipVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/ship"), body);
    }

    /** Start service order */
    public PlusApiResultServiceOrderVO startServiceOrder(String id, OrderDispatchActionForm body) throws Exception {
        return (PlusApiResultServiceOrderVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/dispatch/start"), body);
    }

    /** Release service order */
    public PlusApiResultServiceOrderVO releaseServiceOrder(String id, OrderDispatchActionForm body) throws Exception {
        return (PlusApiResultServiceOrderVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/dispatch/release"), body);
    }

    /** Complete service order */
    public PlusApiResultServiceOrderVO completeServiceOrder(String id, OrderDispatchActionForm body) throws Exception {
        return (PlusApiResultServiceOrderVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/dispatch/complete"), body);
    }

    /** Claim service order */
    public PlusApiResultServiceOrderVO claimServiceOrder(String id, OrderDispatchActionForm body) throws Exception {
        return (PlusApiResultServiceOrderVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/dispatch/claim"), body);
    }

    /** Assign service order */
    public PlusApiResultServiceOrderVO assignServiceOrder(String id, OrderDispatchAssignForm body) throws Exception {
        return (PlusApiResultServiceOrderVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/dispatch/assign"), body);
    }

    /** Confirm an order */
    public PlusApiResultOrderConfirmVO confirmOrder(String id) throws Exception {
        return (PlusApiResultOrderConfirmVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/confirm"), null);
    }

    /** Complete an order */
    public PlusApiResultOrderCompleteVO completeOrder(String id) throws Exception {
        return (PlusApiResultOrderCompleteVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/complete"), null);
    }

    /** Close an order */
    public PlusApiResultOrderCloseVO closeOrder(String id) throws Exception {
        return (PlusApiResultOrderCloseVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/close"), null);
    }

    /** Cancel an order */
    public PlusApiResultOrderCancelVO cancelOrder(String id) throws Exception {
        return (PlusApiResultOrderCancelVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/cancel"), null);
    }

    /** List worker dispatch profiles by page */
    public PlusApiResultPagePlusOrderWorkerDispatchProfileVO createListByPageWorkerDispatchProfile(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusOrderWorkerDispatchProfileVO) client.post(ApiPaths.backendPath("/trade/order/worker-dispatch-profile/list"), body, params);
    }

    /** List all worker dispatch profiles */
    public PlusApiResultListPlusOrderWorkerDispatchProfileVO createListAllEntitiesWorkerDispatchProfile(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusOrderWorkerDispatchProfileVO) client.post(ApiPaths.backendPath("/trade/order/worker-dispatch-profile/list/all"), body);
    }

    /** Create virtual order */
    public PlusApiResultVirtualOrderVO createVirtualOrder(CreateVirtualOrderForm body) throws Exception {
        return (PlusApiResultVirtualOrderVO) client.post(ApiPaths.backendPath("/trade/order/virtual"), body);
    }

    /** Create VIP order */
    public PlusApiResultVipOrderVO createVipOrder(CreateVipOrderForm body) throws Exception {
        return (PlusApiResultVipOrderVO) client.post(ApiPaths.backendPath("/trade/order/vip"), body);
    }

    /** Create service order */
    public PlusApiResultServiceOrderVO createServiceOrder(CreateServiceOrderForm body) throws Exception {
        return (PlusApiResultServiceOrderVO) client.post(ApiPaths.backendPath("/trade/order/service"), body);
    }

    /** Create points order */
    public PlusApiResultPointsOrderVO createPointsOrder(CreatePointsOrderForm body) throws Exception {
        return (PlusApiResultPointsOrderVO) client.post(ApiPaths.backendPath("/trade/order/points"), body);
    }

    /** Get orders by page */
    public PlusApiResultPagePlusOrderVO createListByPageOrder(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusOrderVO) client.post(ApiPaths.backendPath("/trade/order/list"), body, params);
    }

    /** Get all orders */
    public PlusApiResultListPlusOrderVO createListAllEntitiesOrder(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusOrderVO) client.post(ApiPaths.backendPath("/trade/order/list/all"), body);
    }

    /** Get order items by page */
    public PlusApiResultPagePlusOrderItemVO createListByPageItem2(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusOrderItemVO) client.post(ApiPaths.backendPath("/trade/order/item/list"), body, params);
    }

    /** Get all order items */
    public PlusApiResultListPlusOrderItemVO createListAllEntitiesItem2(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusOrderItemVO) client.post(ApiPaths.backendPath("/trade/order/item/list/all"), body);
    }

    /** Create IM group order */
    public PlusApiResultImGroupOrderVO createImGroupOrder(CreateImGroupOrderForm body) throws Exception {
        return (PlusApiResultImGroupOrderVO) client.post(ApiPaths.backendPath("/trade/order/im_group"), body);
    }

    /** Create goods order */
    public PlusApiResultGoodsOrderVO createGoodsOrder(CreateGoodsOrderForm body) throws Exception {
        return (PlusApiResultGoodsOrderVO) client.post(ApiPaths.backendPath("/trade/order/goods"), body);
    }

    /** List dispatch rules by page */
    public PlusApiResultPagePlusOrderDispatchRuleVO createListByPageDispatchRule(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusOrderDispatchRuleVO) client.post(ApiPaths.backendPath("/trade/order/dispatch-rule/list"), body, params);
    }

    /** List all dispatch rules */
    public PlusApiResultListPlusOrderDispatchRuleVO createListAllEntitiesDispatchRule(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusOrderDispatchRuleVO) client.post(ApiPaths.backendPath("/trade/order/dispatch-rule/list/all"), body);
    }

    /** Create booking order */
    public PlusApiResultBookingOrderVO createBookingOrder(CreateBookingOrderForm body) throws Exception {
        return (PlusApiResultBookingOrderVO) client.post(ApiPaths.backendPath("/trade/order/booking"), body);
    }

    /** Get shopping cart by ID */
    public PlusApiResultPlusShoppingCartVO getById(String id) throws Exception {
        return (PlusApiResultPlusShoppingCartVO) client.get(ApiPaths.backendPath("/trade/shopping/cart/" + id + ""));
    }

    /** Delete shopping cart */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/shopping/cart/" + id + ""));
    }

    /** Get a shopping cart item by ID */
    public PlusApiResultPlusShoppingCartItemVO getByIdItem(String id) throws Exception {
        return (PlusApiResultPlusShoppingCartItemVO) client.get(ApiPaths.backendPath("/trade/shopping/cart/item/" + id + ""));
    }

    /** Delete a shopping cart item */
    public PlusApiResultBoolean deleteItem(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/shopping/cart/item/" + id + ""));
    }

    /** Get a refund record by ID */
    public PlusApiResultPlusRefundVO getByIdRefund(String id) throws Exception {
        return (PlusApiResultPlusRefundVO) client.get(ApiPaths.backendPath("/trade/refund/" + id + ""));
    }

    /** Delete a refund record */
    public PlusApiResultBoolean deleteRefund(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/refund/" + id + ""));
    }

    /** Get a payment record by ID */
    public PlusApiResultPlusPaymentVO getByIdPayment(String id) throws Exception {
        return (PlusApiResultPlusPaymentVO) client.get(ApiPaths.backendPath("/trade/payment/" + id + ""));
    }

    /** Delete a payment record */
    public PlusApiResultBoolean deletePayment(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/payment/" + id + ""));
    }

    /** Get an order by ID */
    public PlusApiResultPlusOrderVO getByIdOrder(String id) throws Exception {
        return (PlusApiResultPlusOrderVO) client.get(ApiPaths.backendPath("/trade/order/" + id + ""));
    }

    /** Delete an order */
    public PlusApiResultBoolean deleteOrder(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/order/" + id + ""));
    }

    /** Get worker dispatch profile by id */
    public PlusApiResultPlusOrderWorkerDispatchProfileVO getByIdWorkerDispatchProfile(String id) throws Exception {
        return (PlusApiResultPlusOrderWorkerDispatchProfileVO) client.get(ApiPaths.backendPath("/trade/order/worker-dispatch-profile/" + id + ""));
    }

    /** Delete worker dispatch profile */
    public PlusApiResultBoolean deleteWorkerDispatchProfile(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/order/worker-dispatch-profile/" + id + ""));
    }

    /** Get an order item by ID */
    public PlusApiResultPlusOrderItemVO getByIdItem2(String id) throws Exception {
        return (PlusApiResultPlusOrderItemVO) client.get(ApiPaths.backendPath("/trade/order/item/" + id + ""));
    }

    /** Delete an order item */
    public PlusApiResultBoolean deleteItem2(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/order/item/" + id + ""));
    }

    /** Get dispatch rule by id */
    public PlusApiResultPlusOrderDispatchRuleVO getByIdDispatchRule(String id) throws Exception {
        return (PlusApiResultPlusOrderDispatchRuleVO) client.get(ApiPaths.backendPath("/trade/order/dispatch-rule/" + id + ""));
    }

    /** Delete dispatch rule */
    public PlusApiResultBoolean deleteDispatchRule(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/order/dispatch-rule/" + id + ""));
    }
}
