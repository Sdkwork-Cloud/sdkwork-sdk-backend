package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class OrganizationMemberApi {
    private final HttpClient client;
    
    public OrganizationMemberApi(HttpClient client) {
        this.client = client;
    }

    /** Update organization member */
    public PlusApiResultPlusOrganizationMemberVO update(PlusOrganizationMemberForm body) throws Exception {
        return (PlusApiResultPlusOrganizationMemberVO) client.put(ApiPaths.backendPath("/organization-member"), body);
    }

    /** Create organization member */
    public PlusApiResultPlusOrganizationMemberVO create(PlusOrganizationMemberForm body) throws Exception {
        return (PlusApiResultPlusOrganizationMemberVO) client.post(ApiPaths.backendPath("/organization-member"), body);
    }

    /** Get organization members by page */
    public PlusApiResultPagePlusOrganizationMemberVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusOrganizationMemberVO) client.post(ApiPaths.backendPath("/organization-member/list"), body, params);
    }

    /** Get all organization members */
    public PlusApiResultListPlusOrganizationMemberVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusOrganizationMemberVO) client.post(ApiPaths.backendPath("/organization-member/list/all"), body);
    }

    /** Get organization member by ID */
    public PlusApiResultPlusOrganizationMemberVO getById(String id) throws Exception {
        return (PlusApiResultPlusOrganizationMemberVO) client.get(ApiPaths.backendPath("/organization-member/" + id + ""));
    }

    /** Delete organization member */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/organization-member/" + id + ""));
    }
}
