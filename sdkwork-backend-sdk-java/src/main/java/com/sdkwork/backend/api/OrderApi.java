package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class OrderApi {
    private final HttpClient client;
    
    public OrderApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing order */
    public PlusApiResultPlusOrderVO update(PlusOrderForm body) throws Exception {
        return (PlusApiResultPlusOrderVO) client.put(ApiPaths.backendPath("/trade/order"), body);
    }

    /** Create a new order */
    public PlusApiResultPlusOrderVO create(PlusOrderForm body) throws Exception {
        return (PlusApiResultPlusOrderVO) client.post(ApiPaths.backendPath("/trade/order"), body);
    }

    /** Ship an order */
    public PlusApiResultOrderShipVO ship(String id, String body) throws Exception {
        return (PlusApiResultOrderShipVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/ship"), body);
    }

    /** Confirm an order */
    public PlusApiResultOrderConfirmVO confirm(String id) throws Exception {
        return (PlusApiResultOrderConfirmVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/confirm"), null);
    }

    /** Complete an order */
    public PlusApiResultOrderCompleteVO complete(String id) throws Exception {
        return (PlusApiResultOrderCompleteVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/complete"), null);
    }

    /** Close an order */
    public PlusApiResultOrderCloseVO close(String id) throws Exception {
        return (PlusApiResultOrderCloseVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/close"), null);
    }

    /** Cancel an order */
    public PlusApiResultOrderCancelVO cancel(String id) throws Exception {
        return (PlusApiResultOrderCancelVO) client.post(ApiPaths.backendPath("/trade/order/" + id + "/cancel"), null);
    }

    /** Create virtual order */
    public PlusApiResultVirtualOrderVO createVirtual(CreateVirtualOrderForm body) throws Exception {
        return (PlusApiResultVirtualOrderVO) client.post(ApiPaths.backendPath("/trade/order/virtual"), body);
    }

    /** Create VIP order */
    public PlusApiResultVipOrderVO createVip(CreateVipOrderForm body) throws Exception {
        return (PlusApiResultVipOrderVO) client.post(ApiPaths.backendPath("/trade/order/vip"), body);
    }

    /** Create points order */
    public PlusApiResultPointsOrderVO createPoints(CreatePointsOrderForm body) throws Exception {
        return (PlusApiResultPointsOrderVO) client.post(ApiPaths.backendPath("/trade/order/points"), body);
    }

    /** Get orders by page */
    public PlusApiResultPagePlusOrderVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusOrderVO) client.post(ApiPaths.backendPath("/trade/order/list"), body, params);
    }

    /** Get all orders */
    public PlusApiResultListPlusOrderVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusOrderVO) client.post(ApiPaths.backendPath("/trade/order/list/all"), body);
    }

    /** Create IM group order */
    public PlusApiResultImGroupOrderVO createImGroup(CreateImGroupOrderForm body) throws Exception {
        return (PlusApiResultImGroupOrderVO) client.post(ApiPaths.backendPath("/trade/order/im_group"), body);
    }

    /** Create goods order */
    public PlusApiResultGoodsOrderVO createGoods(CreateGoodsOrderForm body) throws Exception {
        return (PlusApiResultGoodsOrderVO) client.post(ApiPaths.backendPath("/trade/order/goods"), body);
    }

    /** Get an order by ID */
    public PlusApiResultPlusOrderVO getById(String id) throws Exception {
        return (PlusApiResultPlusOrderVO) client.get(ApiPaths.backendPath("/trade/order/" + id + ""));
    }

    /** Delete an order */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/order/" + id + ""));
    }
}
