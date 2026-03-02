package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ShopApi {
    private final HttpClient client;
    
    public ShopApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing shop */
    public PlusApiResultPlusShopVO update(PlusShopForm body) throws Exception {
        return (PlusApiResultPlusShopVO) client.put(ApiPaths.backendPath("/shop"), body);
    }

    /** Create a new shop */
    public PlusApiResultPlusShopVO create(PlusShopForm body) throws Exception {
        return (PlusApiResultPlusShopVO) client.post(ApiPaths.backendPath("/shop"), body);
    }

    /** Get shops by page */
    public PlusApiResultPagePlusShopVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusShopVO) client.post(ApiPaths.backendPath("/shop/list"), body, params);
    }

    /** Get all shops */
    public PlusApiResultListPlusShopVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusShopVO) client.post(ApiPaths.backendPath("/shop/list/all"), body);
    }

    /** Get a shop by ID */
    public PlusApiResultPlusShopVO getById(String id) throws Exception {
        return (PlusApiResultPlusShopVO) client.get(ApiPaths.backendPath("/shop/" + id + ""));
    }

    /** Delete a shop */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/shop/" + id + ""));
    }
}
