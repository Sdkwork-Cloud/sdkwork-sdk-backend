package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AiPromptApi(private val client: HttpClient) {

    /** Update an existing AI prompt */
    suspend fun update(body: PlusAiPromptForm): PlusApiResultPlusAiPromptVO? {
        return client.put(ApiPaths.backendPath("/prompt"), body) as? PlusApiResultPlusAiPromptVO
    }

    /** Create a new AI prompt */
    suspend fun create(body: PlusAiPromptForm): PlusApiResultPlusAiPromptVO? {
        return client.post(ApiPaths.backendPath("/prompt"), body) as? PlusApiResultPlusAiPromptVO
    }

    /** Get AI prompts by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiPromptVO? {
        return client.post(ApiPaths.backendPath("/prompt/list"), body, params) as? PlusApiResultPagePlusAiPromptVO
    }

    /** Get all AI prompts */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAiPromptVO? {
        return client.post(ApiPaths.backendPath("/prompt/list/all"), body) as? PlusApiResultListPlusAiPromptVO
    }

    /** Get an AI prompt by ID */
    suspend fun getById(id: String): PlusApiResultPlusAiPromptVO? {
        return client.get(ApiPaths.backendPath("/prompt/$id")) as? PlusApiResultPlusAiPromptVO
    }

    /** Delete an AI prompt */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/prompt/$id")) as? PlusApiResultBoolean
    }
}
