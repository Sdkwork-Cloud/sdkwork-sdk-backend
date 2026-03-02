package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VipPackageGroupApi {
    private final HttpClient client;
    
    public VipPackageGroupApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing VIP package group */
    public PlusApiResultPlusVipPackGroupVO update(PlusVipPackGroupForm body) throws Exception {
        return (PlusApiResultPlusVipPackGroupVO) client.put(ApiPaths.backendPath("/vip/pack_group"), body);
    }

    /** Create a new VIP package group */
    public PlusApiResultPlusVipPackGroupVO create(PlusVipPackGroupForm body) throws Exception {
        return (PlusApiResultPlusVipPackGroupVO) client.post(ApiPaths.backendPath("/vip/pack_group"), body);
    }

    /** List public */
    public PlusApiResultPagePlusVipPackGroupVO listPublic(PlusVipPackGroupQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipPackGroupVO) client.post(ApiPaths.backendPath("/vip/pack_group/list_public"), body, params);
    }

    /** Get VIP package groups by page */
    public PlusApiResultPagePlusVipPackGroupVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipPackGroupVO) client.post(ApiPaths.backendPath("/vip/pack_group/list"), body, params);
    }

    /** Get all VIP package groups */
    public PlusApiResultListPlusVipPackGroupVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipPackGroupVO) client.post(ApiPaths.backendPath("/vip/pack_group/list/all"), body);
    }

    /** Get a VIP package group by ID */
    public PlusApiResultPlusVipPackGroupVO getById(String id) throws Exception {
        return (PlusApiResultPlusVipPackGroupVO) client.get(ApiPaths.backendPath("/vip/pack_group/" + id + ""));
    }

    /** Delete a VIP package group */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/pack_group/" + id + ""));
    }
}
