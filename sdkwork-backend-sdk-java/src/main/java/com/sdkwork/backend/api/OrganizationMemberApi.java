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

    /** Transfer member position */
    public PlusApiResultBoolean transferPosition(String id, Map<String, Object> params) throws Exception {
        return (PlusApiResultBoolean) client.put(ApiPaths.backendPath("/organization-member/" + id + "/positions/transfer"), null, params);
    }

    /** Set member primary department */
    public PlusApiResultBoolean setPrimaryDepartment(String id, String departmentId) throws Exception {
        return (PlusApiResultBoolean) client.put(ApiPaths.backendPath("/organization-member/" + id + "/departments/" + departmentId + "/primary"), null);
    }

    /** Transfer member department */
    public PlusApiResultBoolean transferDepartment(String id, Map<String, Object> params) throws Exception {
        return (PlusApiResultBoolean) client.put(ApiPaths.backendPath("/organization-member/" + id + "/departments/transfer"), null, params);
    }

    /** Deactivate member */
    public PlusApiResultBoolean deactivateMember(String id) throws Exception {
        return (PlusApiResultBoolean) client.put(ApiPaths.backendPath("/organization-member/" + id + "/deactivate"), null);
    }

    /** Activate member */
    public PlusApiResultBoolean activateMember(String id) throws Exception {
        return (PlusApiResultBoolean) client.put(ApiPaths.backendPath("/organization-member/" + id + "/activate"), null);
    }

    /** Bind member to department */
    public PlusApiResultBoolean addToDepartment(String id, String departmentId, Map<String, Object> params) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/organization-member/" + id + "/departments/" + departmentId + ""), null, params);
    }

    /** Unbind member from department */
    public PlusApiResultBoolean removeFromDepartment(String id, String departmentId) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/organization-member/" + id + "/departments/" + departmentId + ""));
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

    /** Get member role ids */
    public PlusApiResultListLong getMemberRoleIds(String id) throws Exception {
        return (PlusApiResultListLong) client.get(ApiPaths.backendPath("/organization-member/" + id + "/roles"));
    }

    /** Get member positions */
    public PlusApiResultListPlusPositionVO getMemberPositions(String id) throws Exception {
        return (PlusApiResultListPlusPositionVO) client.get(ApiPaths.backendPath("/organization-member/" + id + "/positions"));
    }

    /** Get member departments */
    public PlusApiResultListPlusDepartmentVO getMemberDepartments(String id) throws Exception {
        return (PlusApiResultListPlusDepartmentVO) client.get(ApiPaths.backendPath("/organization-member/" + id + "/departments"));
    }
}
