package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class OrderItemApi {
    private final HttpClient client;
    
    public OrderItemApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing order item */
    public PlusApiResultPlusOrderItemVO update(PlusOrderItemForm body) throws Exception {
        return (PlusApiResultPlusOrderItemVO) client.put(ApiPaths.backendPath("/trade/order/item"), body);
    }

    /** Create a new order item */
    public PlusApiResultPlusOrderItemVO create(PlusOrderItemForm body) throws Exception {
        return (PlusApiResultPlusOrderItemVO) client.post(ApiPaths.backendPath("/trade/order/item"), body);
    }

    /** Get order items by page */
    public PlusApiResultPagePlusOrderItemVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusOrderItemVO) client.post(ApiPaths.backendPath("/trade/order/item/list"), body, params);
    }

    /** Get all order items */
    public PlusApiResultListPlusOrderItemVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusOrderItemVO) client.post(ApiPaths.backendPath("/trade/order/item/list/all"), body);
    }

    /** Get an order item by ID */
    public PlusApiResultPlusOrderItemVO getById(String id) throws Exception {
        return (PlusApiResultPlusOrderItemVO) client.get(ApiPaths.backendPath("/trade/order/item/" + id + ""));
    }

    /** Delete an order item */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/order/item/" + id + ""));
    }
}
