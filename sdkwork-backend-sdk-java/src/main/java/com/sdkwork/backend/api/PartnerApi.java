package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class PartnerApi {
    private final HttpClient client;
    
    public PartnerApi(HttpClient client) {
        this.client = client;
    }

    /** Update a partner */
    public PlusApiResultPlusPartnerVO update(PlusPartnerForm body) throws Exception {
        return (PlusApiResultPlusPartnerVO) client.put(ApiPaths.backendPath("/partner"), body);
    }

    /** Create a new partner */
    public PlusApiResultPlusPartnerVO create(PlusPartnerForm body) throws Exception {
        return (PlusApiResultPlusPartnerVO) client.post(ApiPaths.backendPath("/partner"), body);
    }

    /** Get partners by page */
    public PlusApiResultPagePlusPartnerVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusPartnerVO) client.post(ApiPaths.backendPath("/partner/list"), body, params);
    }

    /** Get all partners */
    public PlusApiResultListPlusPartnerVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusPartnerVO) client.post(ApiPaths.backendPath("/partner/list/all"), body);
    }

    /** Get a partner by ID */
    public PlusApiResultPlusPartnerVO getById(String id) throws Exception {
        return (PlusApiResultPlusPartnerVO) client.get(ApiPaths.backendPath("/partner/" + id + ""));
    }

    /** Delete a partner */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/partner/" + id + ""));
    }
}
