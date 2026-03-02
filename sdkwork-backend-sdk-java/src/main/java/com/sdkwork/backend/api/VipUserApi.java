package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VipUserApi {
    private final HttpClient client;
    
    public VipUserApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing VIP user */
    public PlusApiResultPlusVipUserVO update(PlusVipUserForm body) throws Exception {
        return (PlusApiResultPlusVipUserVO) client.put(ApiPaths.backendPath("/vip/user"), body);
    }

    /** Create a new VIP user */
    public PlusApiResultPlusVipUserVO create(PlusVipUserForm body) throws Exception {
        return (PlusApiResultPlusVipUserVO) client.post(ApiPaths.backendPath("/vip/user"), body);
    }

    /** Get VIP users by page */
    public PlusApiResultPagePlusVipUserVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipUserVO) client.post(ApiPaths.backendPath("/vip/user/list"), body, params);
    }

    /** Get all VIP users */
    public PlusApiResultListPlusVipUserVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipUserVO) client.post(ApiPaths.backendPath("/vip/user/list/all"), body);
    }

    /** Get a VIP user by ID */
    public PlusApiResultPlusVipUserVO getCurrentUser() throws Exception {
        return (PlusApiResultPlusVipUserVO) client.post(ApiPaths.backendPath("/vip/user/get_current_user"), null);
    }

    /** Get a VIP user by ID */
    public PlusApiResultPlusVipUserVO getById(String id) throws Exception {
        return (PlusApiResultPlusVipUserVO) client.get(ApiPaths.backendPath("/vip/user/" + id + ""));
    }

    /** Delete a VIP user */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/user/" + id + ""));
    }
}
