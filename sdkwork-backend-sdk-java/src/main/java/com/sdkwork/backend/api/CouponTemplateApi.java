package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class CouponTemplateApi {
    private final HttpClient client;
    
    public CouponTemplateApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing coupon template */
    public PlusApiResultPlusCouponTemplateVO update(PlusCouponTemplateForm body) throws Exception {
        return (PlusApiResultPlusCouponTemplateVO) client.put(ApiPaths.backendPath("/coupon/template"), body);
    }

    /** Create a new coupon template */
    public PlusApiResultPlusCouponTemplateVO create(PlusCouponTemplateForm body) throws Exception {
        return (PlusApiResultPlusCouponTemplateVO) client.post(ApiPaths.backendPath("/coupon/template"), body);
    }

    /** Get coupon templates by page */
    public PlusApiResultPagePlusCouponTemplateVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusCouponTemplateVO) client.post(ApiPaths.backendPath("/coupon/template/list"), body, params);
    }

    /** Get all coupon templates */
    public PlusApiResultListPlusCouponTemplateVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusCouponTemplateVO) client.post(ApiPaths.backendPath("/coupon/template/list/all"), body);
    }

    /** Get a coupon template by ID */
    public PlusApiResultPlusCouponTemplateVO getById(String id) throws Exception {
        return (PlusApiResultPlusCouponTemplateVO) client.get(ApiPaths.backendPath("/coupon/template/" + id + ""));
    }

    /** Delete a coupon template */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/coupon/template/" + id + ""));
    }
}
