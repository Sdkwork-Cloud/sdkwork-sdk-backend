package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ApiSecurityPolicyApi {
    private final HttpClient client;
    
    public ApiSecurityPolicyApi(HttpClient client) {
        this.client = client;
    }

    public PlusApiResultPlusApiSecurityPolicyVO update(PlusApiSecurityPolicyForm body) throws Exception {
        return (PlusApiResultPlusApiSecurityPolicyVO) client.put(ApiPaths.backendPath("/security/policy"), body);
    }

    public PlusApiResultPlusApiSecurityPolicyVO create(PlusApiSecurityPolicyForm body) throws Exception {
        return (PlusApiResultPlusApiSecurityPolicyVO) client.post(ApiPaths.backendPath("/security/policy"), body);
    }

    /** List policies by page */
    public PlusApiResultPagePlusApiSecurityPolicyVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusApiSecurityPolicyVO) client.post(ApiPaths.backendPath("/security/policy/list"), body, params);
    }

    /** List all policies */
    public PlusApiResultListPlusApiSecurityPolicyVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusApiSecurityPolicyVO) client.post(ApiPaths.backendPath("/security/policy/list/all"), body);
    }

    public PlusApiResultPlusApiSecurityPolicyVO getById(String id) throws Exception {
        return (PlusApiResultPlusApiSecurityPolicyVO) client.get(ApiPaths.backendPath("/security/policy/" + id + ""));
    }

    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/security/policy/" + id + ""));
    }
}
