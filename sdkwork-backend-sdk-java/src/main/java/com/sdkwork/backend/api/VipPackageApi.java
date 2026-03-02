package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VipPackageApi {
    private final HttpClient client;
    
    public VipPackageApi(HttpClient client) {
        this.client = client;
    }

    /** Update VIP Package */
    public PlusApiResultPlusVipPackVO update(PlusVipPackForm body) throws Exception {
        return (PlusApiResultPlusVipPackVO) client.put(ApiPaths.backendPath("/vip/pack"), body);
    }

    /** Create VIP Package */
    public PlusApiResultPlusVipPackVO create(PlusVipPackForm body) throws Exception {
        return (PlusApiResultPlusVipPackVO) client.post(ApiPaths.backendPath("/vip/pack"), body);
    }

    /** Get VIP Packages by Page */
    public PlusApiResultPagePlusVipPackVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipPackVO) client.post(ApiPaths.backendPath("/vip/pack/list"), body, params);
    }

    /** Get All VIP Packages */
    public PlusApiResultListPlusVipPackVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipPackVO) client.post(ApiPaths.backendPath("/vip/pack/list/all"), body);
    }

    /** Get VIP Package by ID */
    public PlusApiResultPlusVipPackVO getById(String id) throws Exception {
        return (PlusApiResultPlusVipPackVO) client.get(ApiPaths.backendPath("/vip/pack/" + id + ""));
    }

    /** Delete VIP Package */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/pack/" + id + ""));
    }
}
