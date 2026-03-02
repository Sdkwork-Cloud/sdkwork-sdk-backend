package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AiAgentToolRelationshipApi(private val client: HttpClient) {

    /** Update an existing agent-tool relationship */
    suspend fun update(body: PlusAiAgentToolForm): PlusApiResultPlusAiAgentToolVO? {
        return client.put(ApiPaths.backendPath("/agent/tool"), body) as? PlusApiResultPlusAiAgentToolVO
    }

    /** Create a new agent-tool relationship */
    suspend fun create(body: PlusAiAgentToolForm): PlusApiResultPlusAiAgentToolVO? {
        return client.post(ApiPaths.backendPath("/agent/tool"), body) as? PlusApiResultPlusAiAgentToolVO
    }

    /** Get agent-tool relationships by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiAgentToolVO? {
        return client.post(ApiPaths.backendPath("/agent/tool/list"), body, params) as? PlusApiResultPagePlusAiAgentToolVO
    }

    /** Get all agent-tool relationships */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAiAgentToolVO? {
        return client.post(ApiPaths.backendPath("/agent/tool/list/all"), body) as? PlusApiResultListPlusAiAgentToolVO
    }

    /** Get an agent-tool relationship by ID */
    suspend fun getById(id: String): PlusApiResultPlusAiAgentToolVO? {
        return client.get(ApiPaths.backendPath("/agent/tool/$id")) as? PlusApiResultPlusAiAgentToolVO
    }

    /** Delete an agent-tool relationship */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/agent/tool/$id")) as? PlusApiResultBoolean
    }
}
