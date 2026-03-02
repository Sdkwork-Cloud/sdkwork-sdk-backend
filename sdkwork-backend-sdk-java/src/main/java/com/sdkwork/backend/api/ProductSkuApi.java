package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ProductSkuApi {
    private final HttpClient client;
    
    public ProductSkuApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing SKU */
    public PlusApiResultPlusSkuVO update(PlusSkuForm body) throws Exception {
        return (PlusApiResultPlusSkuVO) client.put(ApiPaths.backendPath("/sku"), body);
    }

    /** Create a new SKU */
    public PlusApiResultPlusSkuVO create(PlusSkuForm body) throws Exception {
        return (PlusApiResultPlusSkuVO) client.post(ApiPaths.backendPath("/sku"), body);
    }

    /** Get SKUs by page */
    public PlusApiResultPagePlusSkuVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusSkuVO) client.post(ApiPaths.backendPath("/sku/list"), body, params);
    }

    /** Get all SKUs */
    public PlusApiResultListPlusSkuVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusSkuVO) client.post(ApiPaths.backendPath("/sku/list/all"), body);
    }

    /** Get an SKU by ID */
    public PlusApiResultPlusSkuVO getById(String id) throws Exception {
        return (PlusApiResultPlusSkuVO) client.get(ApiPaths.backendPath("/sku/" + id + ""));
    }

    /** Delete an SKU */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/sku/" + id + ""));
    }
}
