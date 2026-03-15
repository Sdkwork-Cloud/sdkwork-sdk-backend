package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AgentApi(private val client: HttpClient) {

    /** Update an existing AI agent */
    suspend fun update(body: PlusAiAgentForm): PlusApiResultPlusAiAgentVO? {
        return client.put(ApiPaths.backendPath("/agent"), body) as? PlusApiResultPlusAiAgentVO
    }

    /** Create a new AI agent */
    suspend fun create(body: PlusAiAgentForm): PlusApiResultPlusAiAgentVO? {
        return client.post(ApiPaths.backendPath("/agent"), body) as? PlusApiResultPlusAiAgentVO
    }

    /** Update an existing agent-tool relationship */
    suspend fun updateTool(body: PlusAiAgentToolForm): PlusApiResultPlusAiAgentToolVO? {
        return client.put(ApiPaths.backendPath("/agent/tool"), body) as? PlusApiResultPlusAiAgentToolVO
    }

    /** Create a new agent-tool relationship */
    suspend fun createTool(body: PlusAiAgentToolForm): PlusApiResultPlusAiAgentToolVO? {
        return client.post(ApiPaths.backendPath("/agent/tool"), body) as? PlusApiResultPlusAiAgentToolVO
    }

    /** Get agent-tool relationships by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiAgentToolVO? {
        return client.post(ApiPaths.backendPath("/agent/tool/list"), body, params) as? PlusApiResultPagePlusAiAgentToolVO
    }

    /** Get all agent-tool relationships */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAiAgentToolVO? {
        return client.post(ApiPaths.backendPath("/agent/tool/list/all"), body) as? PlusApiResultListPlusAiAgentToolVO
    }

    /** Get public AI agents by page */
    suspend fun listPublic(body: PlusAiAgentQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiAgentVO? {
        return client.post(ApiPaths.backendPath("/agent/list_public"), body, params) as? PlusApiResultPagePlusAiAgentVO
    }

    /** Get AI agents by page */
    suspend fun createListByPageAgent(body: PlusAiAgentQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiAgentVO? {
        return client.post(ApiPaths.backendPath("/agent/list"), body, params) as? PlusApiResultPagePlusAiAgentVO
    }

    /** Get all AI agents */
    suspend fun createListAllEntitiesAgent(body: PlusAiAgentQueryListForm? = null): PlusApiResultListPlusAiAgentVO? {
        return client.post(ApiPaths.backendPath("/agent/list/all"), body) as? PlusApiResultListPlusAiAgentVO
    }

    /** Create a chat completion with agent */
    suspend fun withContext(body: ChatCompletionCreateForm, params: Map<String, Any>? = null, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/agent/chat/with_context"), body, params, headers) as? ChatCompletionChunk
    }

    /** Stop a chat completion stream */
    suspend fun stop(params: Map<String, Any>? = null, headers: Map<String, String>? = null): PlusApiResult? {
        return client.post(ApiPaths.backendPath("/agent/chat/stop"), null, params, headers) as? PlusApiResult
    }

    /** Create a chat completion with agent */
    suspend fun resumeStream(body: ChatCompletionCreateForm, params: Map<String, Any>? = null, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/agent/chat/resume_stream"), body, params, headers) as? ChatCompletionChunk
    }

    /** Create a chat completion with agent */
    suspend fun createCompletions(body: ChatCompletionCreateForm, params: Map<String, Any>? = null, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/agent/chat/completions"), body, params, headers) as? ChatCompletionChunk
    }

    /** Get an AI agent by ID */
    suspend fun getById(id: String): PlusApiResultPlusAiAgentVO? {
        return client.get(ApiPaths.backendPath("/agent/$id")) as? PlusApiResultPlusAiAgentVO
    }

    /** Delete an AI agent */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/agent/$id")) as? PlusApiResultBoolean
    }

    /** Get an agent-tool relationship by ID */
    suspend fun getByIdTool(id: String): PlusApiResultPlusAiAgentToolVO? {
        return client.get(ApiPaths.backendPath("/agent/tool/$id")) as? PlusApiResultPlusAiAgentToolVO
    }

    /** Delete an agent-tool relationship */
    suspend fun deleteTool(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/agent/tool/$id")) as? PlusApiResultBoolean
    }
}
