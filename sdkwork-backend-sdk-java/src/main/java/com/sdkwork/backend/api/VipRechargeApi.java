package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VipRechargeApi {
    private final HttpClient client;
    
    public VipRechargeApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing VIP recharge record */
    public PlusApiResultPlusVipRechargeVO update(PlusVipRechargeForm body) throws Exception {
        return (PlusApiResultPlusVipRechargeVO) client.put(ApiPaths.backendPath("/vip/recharge"), body);
    }

    /** Create a new VIP recharge record */
    public PlusApiResultPlusVipRechargeVO create(PlusVipRechargeForm body) throws Exception {
        return (PlusApiResultPlusVipRechargeVO) client.post(ApiPaths.backendPath("/vip/recharge"), body);
    }

    /** Get VIP recharge records by page */
    public PlusApiResultPagePlusVipRechargeVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipRechargeVO) client.post(ApiPaths.backendPath("/vip/recharge/list"), body, params);
    }

    /** Get all VIP recharge records */
    public PlusApiResultListPlusVipRechargeVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipRechargeVO) client.post(ApiPaths.backendPath("/vip/recharge/list/all"), body);
    }

    /** Get a VIP recharge record by ID */
    public PlusApiResultPlusVipRechargeVO getById(String id) throws Exception {
        return (PlusApiResultPlusVipRechargeVO) client.get(ApiPaths.backendPath("/vip/recharge/" + id + ""));
    }

    /** Delete a VIP recharge record */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/recharge/" + id + ""));
    }
}
