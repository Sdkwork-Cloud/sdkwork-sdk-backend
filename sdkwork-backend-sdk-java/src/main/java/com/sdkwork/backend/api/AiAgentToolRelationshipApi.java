package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AiAgentToolRelationshipApi {
    private final HttpClient client;
    
    public AiAgentToolRelationshipApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing agent-tool relationship */
    public PlusApiResultPlusAiAgentToolVO update(PlusAiAgentToolForm body) throws Exception {
        return (PlusApiResultPlusAiAgentToolVO) client.put(ApiPaths.backendPath("/agent/tool"), body);
    }

    /** Create a new agent-tool relationship */
    public PlusApiResultPlusAiAgentToolVO create(PlusAiAgentToolForm body) throws Exception {
        return (PlusApiResultPlusAiAgentToolVO) client.post(ApiPaths.backendPath("/agent/tool"), body);
    }

    /** Get agent-tool relationships by page */
    public PlusApiResultPagePlusAiAgentToolVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiAgentToolVO) client.post(ApiPaths.backendPath("/agent/tool/list"), body, params);
    }

    /** Get all agent-tool relationships */
    public PlusApiResultListPlusAiAgentToolVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiAgentToolVO) client.post(ApiPaths.backendPath("/agent/tool/list/all"), body);
    }

    /** Get an agent-tool relationship by ID */
    public PlusApiResultPlusAiAgentToolVO getById(String id) throws Exception {
        return (PlusApiResultPlusAiAgentToolVO) client.get(ApiPaths.backendPath("/agent/tool/" + id + ""));
    }

    /** Delete an agent-tool relationship */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/agent/tool/" + id + ""));
    }
}
