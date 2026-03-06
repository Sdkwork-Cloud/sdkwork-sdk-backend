package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class SkillPackageApi {
    private final HttpClient client;
    
    public SkillPackageApi(HttpClient client) {
        this.client = client;
    }

    /** Get skill package detail */
    public PlusApiResultPlusAgentSkillPackageVO getById(String id) throws Exception {
        return (PlusApiResultPlusAgentSkillPackageVO) client.get(ApiPaths.backendPath("/skill/package/" + id + ""));
    }

    /** Update skill package */
    public PlusApiResultPlusAgentSkillPackageVO update(String id, PlusAgentSkillPackageForm body) throws Exception {
        return (PlusApiResultPlusAgentSkillPackageVO) client.put(ApiPaths.backendPath("/skill/package/" + id + ""), body);
    }

    /** Delete skill package */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/skill/package/" + id + ""));
    }

    /** Create skill package */
    public PlusApiResultPlusAgentSkillPackageVO create(PlusAgentSkillPackageForm body) throws Exception {
        return (PlusApiResultPlusAgentSkillPackageVO) client.post(ApiPaths.backendPath("/skill/package"), body);
    }

    /** Enable skill package */
    public PlusApiResultPlusAgentSkillPackageVO enable(String id) throws Exception {
        return (PlusApiResultPlusAgentSkillPackageVO) client.post(ApiPaths.backendPath("/skill/package/" + id + "/enable"), null);
    }

    /** Disable skill package */
    public PlusApiResultPlusAgentSkillPackageVO disable(String id) throws Exception {
        return (PlusApiResultPlusAgentSkillPackageVO) client.post(ApiPaths.backendPath("/skill/package/" + id + "/disable"), null);
    }

    /** Query skill package list by page */
    public PlusApiResultPagePlusAgentSkillPackageVO listByPage(PlusAgentSkillPackageQueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAgentSkillPackageVO) client.post(ApiPaths.backendPath("/skill/package/list"), body, params);
    }

    /** Query all skill packages */
    public PlusApiResultListPlusAgentSkillPackageVO listAll(PlusAgentSkillPackageQueryListForm body) throws Exception {
        return (PlusApiResultListPlusAgentSkillPackageVO) client.post(ApiPaths.backendPath("/skill/package/list/all"), body);
    }
}
