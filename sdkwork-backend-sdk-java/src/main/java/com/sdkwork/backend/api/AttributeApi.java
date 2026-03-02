package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AttributeApi {
    private final HttpClient client;
    
    public AttributeApi(HttpClient client) {
        this.client = client;
    }

    /** Update attribute */
    public PlusApiResultPlusAttributeVO update(PlusAttributeForm body) throws Exception {
        return (PlusApiResultPlusAttributeVO) client.put(ApiPaths.backendPath("/attribute"), body);
    }

    /** Create attribute */
    public PlusApiResultPlusAttributeVO create(PlusAttributeForm body) throws Exception {
        return (PlusApiResultPlusAttributeVO) client.post(ApiPaths.backendPath("/attribute"), body);
    }

    /** Get attributes by page */
    public PlusApiResultPagePlusAttributeVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAttributeVO) client.post(ApiPaths.backendPath("/attribute/list"), body, params);
    }

    /** Get all attributes */
    public PlusApiResultListPlusAttributeVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAttributeVO) client.post(ApiPaths.backendPath("/attribute/list/all"), body);
    }

    /** Get attribute by ID */
    public PlusApiResultPlusAttributeVO getById(String id) throws Exception {
        return (PlusApiResultPlusAttributeVO) client.get(ApiPaths.backendPath("/attribute/" + id + ""));
    }

    /** Delete attribute */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/attribute/" + id + ""));
    }
}
