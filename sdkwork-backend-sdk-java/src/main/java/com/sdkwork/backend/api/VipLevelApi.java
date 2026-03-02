package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VipLevelApi {
    private final HttpClient client;
    
    public VipLevelApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing VIP level */
    public PlusApiResultPlusVipLevelVO update(PlusVipLevelForm body) throws Exception {
        return (PlusApiResultPlusVipLevelVO) client.put(ApiPaths.backendPath("/vip/level"), body);
    }

    /** Create a new VIP level */
    public PlusApiResultPlusVipLevelVO create(PlusVipLevelForm body) throws Exception {
        return (PlusApiResultPlusVipLevelVO) client.post(ApiPaths.backendPath("/vip/level"), body);
    }

    /** Get VIP levels by page */
    public PlusApiResultPagePlusVipLevelVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipLevelVO) client.post(ApiPaths.backendPath("/vip/level/list"), body, params);
    }

    /** Get all VIP levels */
    public PlusApiResultListPlusVipLevelVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipLevelVO) client.post(ApiPaths.backendPath("/vip/level/list/all"), body);
    }

    /** Get a VIP level by ID */
    public PlusApiResultPlusVipLevelVO getById(String id) throws Exception {
        return (PlusApiResultPlusVipLevelVO) client.get(ApiPaths.backendPath("/vip/level/" + id + ""));
    }

    /** Delete a VIP level */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/level/" + id + ""));
    }
}
