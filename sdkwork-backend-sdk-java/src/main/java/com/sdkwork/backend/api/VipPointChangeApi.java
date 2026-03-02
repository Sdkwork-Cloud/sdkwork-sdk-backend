package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VipPointChangeApi {
    private final HttpClient client;
    
    public VipPointChangeApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing VIP point change record */
    public PlusApiResultPlusVipPointChangeVO update(PlusVipPointChangeForm body) throws Exception {
        return (PlusApiResultPlusVipPointChangeVO) client.put(ApiPaths.backendPath("/vip/point/change"), body);
    }

    /** Create a new VIP point change record */
    public PlusApiResultPlusVipPointChangeVO create(PlusVipPointChangeForm body) throws Exception {
        return (PlusApiResultPlusVipPointChangeVO) client.post(ApiPaths.backendPath("/vip/point/change"), body);
    }

    /** Get VIP point change records by page */
    public PlusApiResultPagePlusVipPointChangeVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipPointChangeVO) client.post(ApiPaths.backendPath("/vip/point/change/list"), body, params);
    }

    /** Get all VIP point change records */
    public PlusApiResultListPlusVipPointChangeVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipPointChangeVO) client.post(ApiPaths.backendPath("/vip/point/change/list/all"), body);
    }

    /** Get a VIP point change record by ID */
    public PlusApiResultPlusVipPointChangeVO getById(String id) throws Exception {
        return (PlusApiResultPlusVipPointChangeVO) client.get(ApiPaths.backendPath("/vip/point/change/" + id + ""));
    }

    /** Delete a VIP point change record */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/point/change/" + id + ""));
    }
}
