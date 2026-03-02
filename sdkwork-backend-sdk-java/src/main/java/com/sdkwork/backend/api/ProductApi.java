package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ProductApi {
    private final HttpClient client;
    
    public ProductApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing product */
    public PlusApiResultPlusProductVO update(PlusProductForm body) throws Exception {
        return (PlusApiResultPlusProductVO) client.put(ApiPaths.backendPath("/product"), body);
    }

    /** Create a new product */
    public PlusApiResultPlusProductVO create(PlusProductForm body) throws Exception {
        return (PlusApiResultPlusProductVO) client.post(ApiPaths.backendPath("/product"), body);
    }

    /** Get all products */
    public PlusApiResultPlusMallHomeVO mallHome(QueryListForm body) throws Exception {
        return (PlusApiResultPlusMallHomeVO) client.post(ApiPaths.backendPath("/product/mall_home"), body);
    }

    /** Get products by page */
    public PlusApiResultPagePlusProductVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusProductVO) client.post(ApiPaths.backendPath("/product/list"), body, params);
    }

    /** Get all products */
    public PlusApiResultListPlusProductVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusProductVO) client.post(ApiPaths.backendPath("/product/list/all"), body);
    }

    /** Get a product by ID */
    public PlusApiResultPlusProductVO getById(String id) throws Exception {
        return (PlusApiResultPlusProductVO) client.get(ApiPaths.backendPath("/product/" + id + ""));
    }

    /** Delete a product */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/product/" + id + ""));
    }

    /** Get a product by ID */
    public PlusApiResultPlusProductVO getDetail(Map<String, Object> params) throws Exception {
        return (PlusApiResultPlusProductVO) client.get(ApiPaths.backendPath("/product/detail"), params);
    }
}
