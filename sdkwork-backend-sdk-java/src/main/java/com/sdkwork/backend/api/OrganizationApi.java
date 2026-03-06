package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class OrganizationApi {
    private final HttpClient client;
    
    public OrganizationApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing organization */
    public PlusApiResultPlusOrganizationVO update(PlusOrganizationForm body) throws Exception {
        return (PlusApiResultPlusOrganizationVO) client.put(ApiPaths.backendPath("/organization"), body);
    }

    /** Create a new organization */
    public PlusApiResultPlusOrganizationVO create(PlusOrganizationForm body) throws Exception {
        return (PlusApiResultPlusOrganizationVO) client.post(ApiPaths.backendPath("/organization"), body);
    }

    /** Uninstall app from organization */
    public PlusApiResultPlusOrganizationVO uninstall(String id, PlusOrganizationForm body) throws Exception {
        return (PlusApiResultPlusOrganizationVO) client.post(ApiPaths.backendPath("/organization/" + id + "/uninstall"), body);
    }

    /** Install app for organization */
    public PlusApiResultPlusOrganizationVO install(String id, PlusOrganizationForm body) throws Exception {
        return (PlusApiResultPlusOrganizationVO) client.post(ApiPaths.backendPath("/organization/" + id + "/install"), body);
    }

    /** Get organizations by page */
    public PlusApiResultPagePlusOrganizationVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusOrganizationVO) client.post(ApiPaths.backendPath("/organization/list"), body, params);
    }

    /** Get all organizations */
    public PlusApiResultListPlusOrganizationVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusOrganizationVO) client.post(ApiPaths.backendPath("/organization/list/all"), body);
    }

    /** Get access tokens */
    public PlusApiResultListTokenResult getAccessTokens(GetAccessTokenForm body) throws Exception {
        return (PlusApiResultListTokenResult) client.post(ApiPaths.backendPath("/organization/get_access_tokens"), body);
    }

    /** Get an organization by ID */
    public PlusApiResultPlusOrganizationVO getById(String id) throws Exception {
        return (PlusApiResultPlusOrganizationVO) client.get(ApiPaths.backendPath("/organization/" + id + ""));
    }

    /** Delete an organization */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/organization/" + id + ""));
    }

    /** Get child organizations */
    public PlusApiResultListPlusOrganizationVO getChildren(String id) throws Exception {
        return (PlusApiResultListPlusOrganizationVO) client.get(ApiPaths.backendPath("/organization/" + id + "/children"));
    }
}
