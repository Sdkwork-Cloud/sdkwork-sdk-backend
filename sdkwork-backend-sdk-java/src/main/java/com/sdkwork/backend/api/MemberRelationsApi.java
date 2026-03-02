package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class MemberRelationsApi {
    private final HttpClient client;
    
    public MemberRelationsApi(HttpClient client) {
        this.client = client;
    }

    /** Update member relation */
    public PlusApiResultPlusMemberRelationsVO update(PlusMemberRelationsForm body) throws Exception {
        return (PlusApiResultPlusMemberRelationsVO) client.put(ApiPaths.backendPath("/organization/member-relations"), body);
    }

    /** Create member relation */
    public PlusApiResultPlusMemberRelationsVO create(PlusMemberRelationsForm body) throws Exception {
        return (PlusApiResultPlusMemberRelationsVO) client.post(ApiPaths.backendPath("/organization/member-relations"), body);
    }

    /** Get member relations by page */
    public PlusApiResultPagePlusMemberRelationsVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusMemberRelationsVO) client.post(ApiPaths.backendPath("/organization/member-relations/list"), body, params);
    }

    /** Get all member relations */
    public PlusApiResultListPlusMemberRelationsVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusMemberRelationsVO) client.post(ApiPaths.backendPath("/organization/member-relations/list/all"), body);
    }

    /** Get member relation by ID */
    public PlusApiResultPlusMemberRelationsVO getById(String id) throws Exception {
        return (PlusApiResultPlusMemberRelationsVO) client.get(ApiPaths.backendPath("/organization/member-relations/" + id + ""));
    }

    /** Delete member relation */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/organization/member-relations/" + id + ""));
    }
}
