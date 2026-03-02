package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VipLevelBenefitApi {
    private final HttpClient client;
    
    public VipLevelBenefitApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing VIP level benefit */
    public PlusApiResultPlusVipLevelBenefitVO update(PlusVipLevelBenefitForm body) throws Exception {
        return (PlusApiResultPlusVipLevelBenefitVO) client.put(ApiPaths.backendPath("/vip/level/benefit"), body);
    }

    /** Create a new VIP level benefit */
    public PlusApiResultPlusVipLevelBenefitVO create(PlusVipLevelBenefitForm body) throws Exception {
        return (PlusApiResultPlusVipLevelBenefitVO) client.post(ApiPaths.backendPath("/vip/level/benefit"), body);
    }

    /** Get VIP level benefits by page */
    public PlusApiResultPagePlusVipLevelBenefitVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipLevelBenefitVO) client.post(ApiPaths.backendPath("/vip/level/benefit/list"), body, params);
    }

    /** Get all VIP level benefits */
    public PlusApiResultListPlusVipLevelBenefitVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipLevelBenefitVO) client.post(ApiPaths.backendPath("/vip/level/benefit/list/all"), body);
    }

    /** Get a VIP level benefit by ID */
    public PlusApiResultPlusVipLevelBenefitVO getById(String id) throws Exception {
        return (PlusApiResultPlusVipLevelBenefitVO) client.get(ApiPaths.backendPath("/vip/level/benefit/" + id + ""));
    }

    /** Delete a VIP level benefit */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/level/benefit/" + id + ""));
    }
}
