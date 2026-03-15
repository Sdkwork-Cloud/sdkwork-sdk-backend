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

    /** Update an existing position */
    public PlusApiResultPlusPositionVO updatePosition(PlusPositionForm body) throws Exception {
        return (PlusApiResultPlusPositionVO) client.put(ApiPaths.backendPath("/organization/position"), body);
    }

    /** Create a new position */
    public PlusApiResultPlusPositionVO createPosition(PlusPositionForm body) throws Exception {
        return (PlusApiResultPlusPositionVO) client.post(ApiPaths.backendPath("/organization/position"), body);
    }

    /** Update member relation */
    public PlusApiResultPlusMemberRelationsVO updateMemberRelations(PlusMemberRelationsForm body) throws Exception {
        return (PlusApiResultPlusMemberRelationsVO) client.put(ApiPaths.backendPath("/organization/member-relations"), body);
    }

    /** Create member relation */
    public PlusApiResultPlusMemberRelationsVO createMemberRelations(PlusMemberRelationsForm body) throws Exception {
        return (PlusApiResultPlusMemberRelationsVO) client.post(ApiPaths.backendPath("/organization/member-relations"), body);
    }

    /** Uninstall app from organization */
    public PlusApiResultPlusOrganizationVO uninstall(String id, PlusOrganizationForm body) throws Exception {
        return (PlusApiResultPlusOrganizationVO) client.post(ApiPaths.backendPath("/organization/" + id + "/uninstall"), body);
    }

    /** Install app for organization */
    public PlusApiResultPlusOrganizationVO install(String id, PlusOrganizationForm body) throws Exception {
        return (PlusApiResultPlusOrganizationVO) client.post(ApiPaths.backendPath("/organization/" + id + "/install"), body);
    }

    /** Get positions by page */
    public PlusApiResultPagePlusPositionVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusPositionVO) client.post(ApiPaths.backendPath("/organization/position/list"), body, params);
    }

    /** Get all positions */
    public PlusApiResultListPlusPositionVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusPositionVO) client.post(ApiPaths.backendPath("/organization/position/list/all"), body);
    }

    /** Get member relations by page */
    public PlusApiResultPagePlusMemberRelationsVO createListByPageMemberRelations(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusMemberRelationsVO) client.post(ApiPaths.backendPath("/organization/member-relations/list"), body, params);
    }

    /** Get all member relations */
    public PlusApiResultListPlusMemberRelationsVO createListAllEntitiesMemberRelations(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusMemberRelationsVO) client.post(ApiPaths.backendPath("/organization/member-relations/list/all"), body);
    }

    /** Get organizations by page */
    public PlusApiResultPagePlusOrganizationVO createListByPageOrganization(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusOrganizationVO) client.post(ApiPaths.backendPath("/organization/list"), body, params);
    }

    /** Get all organizations */
    public PlusApiResultListPlusOrganizationVO createListAllEntitiesOrganization(QueryListForm body) throws Exception {
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

    /** Get a position by ID */
    public PlusApiResultPlusPositionVO getByIdPosition(String id) throws Exception {
        return (PlusApiResultPlusPositionVO) client.get(ApiPaths.backendPath("/organization/position/" + id + ""));
    }

    /** Delete a position */
    public PlusApiResultBoolean deletePosition(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/organization/position/" + id + ""));
    }

    /** Get member relation by ID */
    public PlusApiResultPlusMemberRelationsVO getByIdMemberRelations(String id) throws Exception {
        return (PlusApiResultPlusMemberRelationsVO) client.get(ApiPaths.backendPath("/organization/member-relations/" + id + ""));
    }

    /** Delete member relation */
    public PlusApiResultBoolean deleteMemberRelations(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/organization/member-relations/" + id + ""));
    }
}
