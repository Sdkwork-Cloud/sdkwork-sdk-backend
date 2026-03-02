package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VipBenefitApi {
    private final HttpClient client;
    
    public VipBenefitApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing VIP benefit */
    public PlusApiResultPlusVipBenefitVO update(PlusVipBenefitForm body) throws Exception {
        return (PlusApiResultPlusVipBenefitVO) client.put(ApiPaths.backendPath("/vip/benefit"), body);
    }

    /** Create a new VIP benefit */
    public PlusApiResultPlusVipBenefitVO create(PlusVipBenefitForm body) throws Exception {
        return (PlusApiResultPlusVipBenefitVO) client.post(ApiPaths.backendPath("/vip/benefit"), body);
    }

    /** Get VIP benefits by page */
    public PlusApiResultPagePlusVipBenefitVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipBenefitVO) client.post(ApiPaths.backendPath("/vip/benefit/list"), body, params);
    }

    /** Get all VIP benefits */
    public PlusApiResultListPlusVipBenefitVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipBenefitVO) client.post(ApiPaths.backendPath("/vip/benefit/list/all"), body);
    }

    /** Get a VIP benefit by ID */
    public PlusApiResultPlusVipBenefitVO getById(String id) throws Exception {
        return (PlusApiResultPlusVipBenefitVO) client.get(ApiPaths.backendPath("/vip/benefit/" + id + ""));
    }

    /** Delete a VIP benefit */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/benefit/" + id + ""));
    }
}
