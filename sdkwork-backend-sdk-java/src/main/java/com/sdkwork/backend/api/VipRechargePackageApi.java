package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VipRechargePackageApi {
    private final HttpClient client;
    
    public VipRechargePackageApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing VIP recharge package */
    public PlusApiResultPlusVipRechargePackVO update(PlusVipRechargePackForm body) throws Exception {
        return (PlusApiResultPlusVipRechargePackVO) client.put(ApiPaths.backendPath("/vip/recharge/pack"), body);
    }

    /** Create a new VIP recharge package */
    public PlusApiResultPlusVipRechargePackVO create(PlusVipRechargePackForm body) throws Exception {
        return (PlusApiResultPlusVipRechargePackVO) client.post(ApiPaths.backendPath("/vip/recharge/pack"), body);
    }

    /** Get VIP recharge packages by page */
    public PlusApiResultPagePlusVipRechargePackVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipRechargePackVO) client.post(ApiPaths.backendPath("/vip/recharge/pack/list"), body, params);
    }

    /** Get all VIP recharge packages */
    public PlusApiResultListPlusVipRechargePackVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipRechargePackVO) client.post(ApiPaths.backendPath("/vip/recharge/pack/list/all"), body);
    }

    /** Get a VIP recharge package by ID */
    public PlusApiResultPlusVipRechargePackVO getById(String id) throws Exception {
        return (PlusApiResultPlusVipRechargePackVO) client.get(ApiPaths.backendPath("/vip/recharge/pack/" + id + ""));
    }

    /** Delete a VIP recharge package */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/recharge/pack/" + id + ""));
    }
}
