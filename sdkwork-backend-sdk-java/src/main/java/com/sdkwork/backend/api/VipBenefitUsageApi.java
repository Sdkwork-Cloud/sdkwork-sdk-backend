package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VipBenefitUsageApi {
    private final HttpClient client;
    
    public VipBenefitUsageApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing VIP benefit usage record */
    public PlusApiResultPlusVipBenefitUsageVO update(PlusVipBenefitUsageForm body) throws Exception {
        return (PlusApiResultPlusVipBenefitUsageVO) client.put(ApiPaths.backendPath("/vip/benefit/usage"), body);
    }

    /** Create a new VIP benefit usage record */
    public PlusApiResultPlusVipBenefitUsageVO create(PlusVipBenefitUsageForm body) throws Exception {
        return (PlusApiResultPlusVipBenefitUsageVO) client.post(ApiPaths.backendPath("/vip/benefit/usage"), body);
    }

    /** Get VIP benefit usage records by page */
    public PlusApiResultPagePlusVipBenefitUsageVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipBenefitUsageVO) client.post(ApiPaths.backendPath("/vip/benefit/usage/list"), body, params);
    }

    /** Get all VIP benefit usage records */
    public PlusApiResultListPlusVipBenefitUsageVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipBenefitUsageVO) client.post(ApiPaths.backendPath("/vip/benefit/usage/list/all"), body);
    }

    /** Get a VIP benefit usage record by ID */
    public PlusApiResultPlusVipBenefitUsageVO getById(String id) throws Exception {
        return (PlusApiResultPlusVipBenefitUsageVO) client.get(ApiPaths.backendPath("/vip/benefit/usage/" + id + ""));
    }

    /** Delete a VIP benefit usage record */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/benefit/usage/" + id + ""));
    }
}
