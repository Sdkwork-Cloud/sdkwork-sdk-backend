package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class DepartmentApi {
    private final HttpClient client;
    
    public DepartmentApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing department */
    public PlusApiResultPlusDepartmentVO update(PlusDepartmentForm body) throws Exception {
        return (PlusApiResultPlusDepartmentVO) client.put(ApiPaths.backendPath("/department"), body);
    }

    /** Create a new department */
    public PlusApiResultPlusDepartmentVO create(PlusDepartmentForm body) throws Exception {
        return (PlusApiResultPlusDepartmentVO) client.post(ApiPaths.backendPath("/department"), body);
    }

    /** Move department */
    public PlusApiResultPlusDepartmentVO move(String id, Map<String, Object> params) throws Exception {
        return (PlusApiResultPlusDepartmentVO) client.put(ApiPaths.backendPath("/department/" + id + "/move"), null, params);
    }

    /** Set primary department */
    public PlusApiResultBoolean setPrimary(String id, String memberId) throws Exception {
        return (PlusApiResultBoolean) client.put(ApiPaths.backendPath("/department/" + id + "/members/" + memberId + "/primary"), null);
    }

    /** Add member to department */
    public PlusApiResultBoolean addMemberTo(String id, String memberId, Map<String, Object> params) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/department/" + id + "/members/" + memberId + ""), null, params);
    }

    /** Remove member from department */
    public PlusApiResultBoolean removeMemberFrom(String id, String memberId) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/department/" + id + "/members/" + memberId + ""));
    }

    /** Get departments by page */
    public PlusApiResultPagePlusDepartmentVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusDepartmentVO) client.post(ApiPaths.backendPath("/department/list"), body, params);
    }

    /** Get all departments */
    public PlusApiResultListPlusDepartmentVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusDepartmentVO) client.post(ApiPaths.backendPath("/department/list/all"), body);
    }

    /** Get a department by ID */
    public PlusApiResultPlusDepartmentVO getById(String id) throws Exception {
        return (PlusApiResultPlusDepartmentVO) client.get(ApiPaths.backendPath("/department/" + id + ""));
    }

    /** Delete a department */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/department/" + id + ""));
    }

    /** Get department members */
    public PlusApiResultListPlusOrganizationMemberVO getDepartmentMembers(String id, Map<String, Object> params) throws Exception {
        return (PlusApiResultListPlusOrganizationMemberVO) client.get(ApiPaths.backendPath("/department/" + id + "/members"), params);
    }
}
