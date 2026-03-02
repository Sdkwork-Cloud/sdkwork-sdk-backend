package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ShoppingCartApi {
    private final HttpClient client;
    
    public ShoppingCartApi(HttpClient client) {
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

    /** Get shopping carts by page */
    public PlusApiResultPagePlusShoppingCartVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusShoppingCartVO) client.post(ApiPaths.backendPath("/trade/shopping/cart/list"), body, params);
    }

    /** Get all shopping carts */
    public PlusApiResultListPlusShoppingCartVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusShoppingCartVO) client.post(ApiPaths.backendPath("/trade/shopping/cart/list/all"), body);
    }

    /** Get shopping cart by ID */
    public PlusApiResultPlusShoppingCartVO getById(String id) throws Exception {
        return (PlusApiResultPlusShoppingCartVO) client.get(ApiPaths.backendPath("/trade/shopping/cart/" + id + ""));
    }

    /** Delete shopping cart */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/shopping/cart/" + id + ""));
    }
}
