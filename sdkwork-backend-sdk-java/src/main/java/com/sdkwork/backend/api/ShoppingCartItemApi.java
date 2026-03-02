package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ShoppingCartItemApi {
    private final HttpClient client;
    
    public ShoppingCartItemApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing shopping cart item */
    public PlusApiResultPlusShoppingCartItemVO update(PlusShoppingCartItemForm body) throws Exception {
        return (PlusApiResultPlusShoppingCartItemVO) client.put(ApiPaths.backendPath("/trade/shopping/cart/item"), body);
    }

    /** Create a new shopping cart item */
    public PlusApiResultPlusShoppingCartItemVO create(PlusShoppingCartItemForm body) throws Exception {
        return (PlusApiResultPlusShoppingCartItemVO) client.post(ApiPaths.backendPath("/trade/shopping/cart/item"), body);
    }

    /** Get shopping cart items by page */
    public PlusApiResultPagePlusShoppingCartItemVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusShoppingCartItemVO) client.post(ApiPaths.backendPath("/trade/shopping/cart/item/list"), body, params);
    }

    /** Get all shopping cart items */
    public PlusApiResultListPlusShoppingCartItemVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusShoppingCartItemVO) client.post(ApiPaths.backendPath("/trade/shopping/cart/item/list/all"), body);
    }

    /** Get a shopping cart item by ID */
    public PlusApiResultPlusShoppingCartItemVO getById(String id) throws Exception {
        return (PlusApiResultPlusShoppingCartItemVO) client.get(ApiPaths.backendPath("/trade/shopping/cart/item/" + id + ""));
    }

    /** Delete a shopping cart item */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/shopping/cart/item/" + id + ""));
    }
}
