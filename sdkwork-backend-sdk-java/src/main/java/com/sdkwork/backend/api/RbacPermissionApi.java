package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class RbacPermissionApi {
    private final HttpClient client;
    
    public RbacPermissionApi(HttpClient client) {
        this.client = client;
    }

    public PlusApiResultPlusPermissionVO update(PlusPermissionForm body) throws Exception {
        return (PlusApiResultPlusPermissionVO) client.put(ApiPaths.backendPath("/permission"), body);
    }

    public PlusApiResultPlusPermissionVO create(PlusPermissionForm body) throws Exception {
        return (PlusApiResultPlusPermissionVO) client.post(ApiPaths.backendPath("/permission"), body);
    }

    /** List permissions by page */
    public PlusApiResultPagePlusPermissionVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusPermissionVO) client.post(ApiPaths.backendPath("/permission/list"), body, params);
    }

    /** List all permissions */
    public PlusApiResultListPlusPermissionVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusPermissionVO) client.post(ApiPaths.backendPath("/permission/list/all"), body);
    }

    public PlusApiResultPlusPermissionVO getById(String id) throws Exception {
        return (PlusApiResultPlusPermissionVO) client.get(ApiPaths.backendPath("/permission/" + id + ""));
    }

    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/permission/" + id + ""));
    }
}
