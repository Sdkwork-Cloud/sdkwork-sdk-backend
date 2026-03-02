package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class TenantApi {
    private final HttpClient client;
    
    public TenantApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing tenant */
    public PlusApiResultPlusTenantVO update(PlusTenantForm body) throws Exception {
        return (PlusApiResultPlusTenantVO) client.put(ApiPaths.backendPath("/tenant"), body);
    }

    /** Create a new tenant */
    public PlusApiResultPlusTenantVO create(PlusTenantForm body) throws Exception {
        return (PlusApiResultPlusTenantVO) client.post(ApiPaths.backendPath("/tenant"), body);
    }

    /** Uninstall app from tenant */
    public PlusApiResultPlusTenantVO uninstall(String id, PlusTenantForm body) throws Exception {
        return (PlusApiResultPlusTenantVO) client.post(ApiPaths.backendPath("/tenant/" + id + "/uninstall"), body);
    }

    /** Install app for tenant */
    public PlusApiResultPlusTenantVO install(String id, PlusTenantForm body) throws Exception {
        return (PlusApiResultPlusTenantVO) client.post(ApiPaths.backendPath("/tenant/" + id + "/install"), body);
    }

    /** Get tenants by page */
    public PlusApiResultPagePlusTenantVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusTenantVO) client.post(ApiPaths.backendPath("/tenant/list"), body, params);
    }

    /** Get all tenants */
    public PlusApiResultListPlusTenantVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusTenantVO) client.post(ApiPaths.backendPath("/tenant/list/all"), body);
    }

    /** Get access tokens */
    public PlusApiResultListTokenResult getAccessTokens(GetAccessTokenForm body) throws Exception {
        return (PlusApiResultListTokenResult) client.post(ApiPaths.backendPath("/tenant/get_access_tokens"), body);
    }

    /** Get a tenant by ID */
    public PlusApiResultPlusTenantVO getById(String id) throws Exception {
        return (PlusApiResultPlusTenantVO) client.get(ApiPaths.backendPath("/tenant/" + id + ""));
    }

    /** Delete a tenant */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/tenant/" + id + ""));
    }
}
