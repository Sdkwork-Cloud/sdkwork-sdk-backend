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

    /** Get public AI agents by page */
    suspend fun listPublic(body: PlusAiAgentQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiAgentVO? {
        return client.post(ApiPaths.backendPath("/agent/list_public"), body, params) as? PlusApiResultPagePlusAiAgentVO
    }

    /** Get AI agents by page */
    suspend fun listByPage(body: PlusAiAgentQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiAgentVO? {
        return client.post(ApiPaths.backendPath("/agent/list"), body, params) as? PlusApiResultPagePlusAiAgentVO
    }

    /** Get all AI agents */
    suspend fun listAllEntities(body: PlusAiAgentQueryListForm? = null): PlusApiResultListPlusAiAgentVO? {
        return client.post(ApiPaths.backendPath("/agent/list/all"), body) as? PlusApiResultListPlusAiAgentVO
    }

    /** Get an AI agent by ID */
    suspend fun getById(id: String): PlusApiResultPlusAiAgentVO? {
        return client.get(ApiPaths.backendPath("/agent/$id")) as? PlusApiResultPlusAiAgentVO
    }

    /** Delete an AI agent */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/agent/$id")) as? PlusApiResultBoolean
    }
}
