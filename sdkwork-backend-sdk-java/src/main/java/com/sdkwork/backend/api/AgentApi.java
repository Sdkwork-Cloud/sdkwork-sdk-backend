package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AgentApi {
    private final HttpClient client;
    
    public AgentApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing AI agent */
    public PlusApiResultPlusAiAgentVO update(PlusAiAgentForm body) throws Exception {
        return (PlusApiResultPlusAiAgentVO) client.put(ApiPaths.backendPath("/agent"), body);
    }

    /** Create a new AI agent */
    public PlusApiResultPlusAiAgentVO create(PlusAiAgentForm body) throws Exception {
        return (PlusApiResultPlusAiAgentVO) client.post(ApiPaths.backendPath("/agent"), body);
    }

    /** Get public AI agents by page */
    public PlusApiResultPagePlusAiAgentVO listPublic(PlusAiAgentQueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiAgentVO) client.post(ApiPaths.backendPath("/agent/list_public"), body, params);
    }

    /** Get AI agents by page */
    public PlusApiResultPagePlusAiAgentVO listByPage(PlusAiAgentQueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiAgentVO) client.post(ApiPaths.backendPath("/agent/list"), body, params);
    }

    /** Get all AI agents */
    public PlusApiResultListPlusAiAgentVO listAllEntities(PlusAiAgentQueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiAgentVO) client.post(ApiPaths.backendPath("/agent/list/all"), body);
    }

    /** Get an AI agent by ID */
    public PlusApiResultPlusAiAgentVO getById(String id) throws Exception {
        return (PlusApiResultPlusAiAgentVO) client.get(ApiPaths.backendPath("/agent/" + id + ""));
    }

    /** Delete an AI agent */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/agent/" + id + ""));
    }
}
