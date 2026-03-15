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

    /** Update an existing agent-tool relationship */
    public PlusApiResultPlusAiAgentToolVO updateTool(PlusAiAgentToolForm body) throws Exception {
        return (PlusApiResultPlusAiAgentToolVO) client.put(ApiPaths.backendPath("/agent/tool"), body);
    }

    /** Create a new agent-tool relationship */
    public PlusApiResultPlusAiAgentToolVO createTool(PlusAiAgentToolForm body) throws Exception {
        return (PlusApiResultPlusAiAgentToolVO) client.post(ApiPaths.backendPath("/agent/tool"), body);
    }

    /** Get agent-tool relationships by page */
    public PlusApiResultPagePlusAiAgentToolVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiAgentToolVO) client.post(ApiPaths.backendPath("/agent/tool/list"), body, params);
    }

    /** Get all agent-tool relationships */
    public PlusApiResultListPlusAiAgentToolVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiAgentToolVO) client.post(ApiPaths.backendPath("/agent/tool/list/all"), body);
    }

    /** Get public AI agents by page */
    public PlusApiResultPagePlusAiAgentVO listPublic(PlusAiAgentQueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiAgentVO) client.post(ApiPaths.backendPath("/agent/list_public"), body, params);
    }

    /** Get AI agents by page */
    public PlusApiResultPagePlusAiAgentVO createListByPageAgent(PlusAiAgentQueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiAgentVO) client.post(ApiPaths.backendPath("/agent/list"), body, params);
    }

    /** Get all AI agents */
    public PlusApiResultListPlusAiAgentVO createListAllEntitiesAgent(PlusAiAgentQueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiAgentVO) client.post(ApiPaths.backendPath("/agent/list/all"), body);
    }

    /** Create a chat completion with agent */
    public ChatCompletionChunk withContext(ChatCompletionCreateForm body, Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/agent/chat/with_context"), body, params, headers);
    }

    /** Stop a chat completion stream */
    public PlusApiResult stop(Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (PlusApiResult) client.post(ApiPaths.backendPath("/agent/chat/stop"), null, params, headers);
    }

    /** Create a chat completion with agent */
    public ChatCompletionChunk resumeStream(ChatCompletionCreateForm body, Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/agent/chat/resume_stream"), body, params, headers);
    }

    /** Create a chat completion with agent */
    public ChatCompletionChunk createCompletions(ChatCompletionCreateForm body, Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/agent/chat/completions"), body, params, headers);
    }

    /** Get an AI agent by ID */
    public PlusApiResultPlusAiAgentVO getById(String id) throws Exception {
        return (PlusApiResultPlusAiAgentVO) client.get(ApiPaths.backendPath("/agent/" + id + ""));
    }

    /** Delete an AI agent */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/agent/" + id + ""));
    }

    /** Get an agent-tool relationship by ID */
    public PlusApiResultPlusAiAgentToolVO getByIdTool(String id) throws Exception {
        return (PlusApiResultPlusAiAgentToolVO) client.get(ApiPaths.backendPath("/agent/tool/" + id + ""));
    }

    /** Delete an agent-tool relationship */
    public PlusApiResultBoolean deleteTool(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/agent/tool/" + id + ""));
    }
}
