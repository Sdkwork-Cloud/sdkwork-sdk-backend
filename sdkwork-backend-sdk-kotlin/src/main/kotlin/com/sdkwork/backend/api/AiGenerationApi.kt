package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AiGenerationApi(private val client: HttpClient) {

    /** Update an existing AI generation record */
    suspend fun update(body: PlusAiGenerationForm): PlusApiResultPlusAiGenerationVO? {
        return client.put(ApiPaths.backendPath("/generation"), body) as? PlusApiResultPlusAiGenerationVO
    }

    /** Create a new AI generation record */
    suspend fun create(body: PlusAiGenerationForm): PlusApiResultPlusAiGenerationVO? {
        return client.post(ApiPaths.backendPath("/generation"), body) as? PlusApiResultPlusAiGenerationVO
    }

    /** Get AI generation records by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiGenerationVO? {
        return client.post(ApiPaths.backendPath("/generation/list"), body, params) as? PlusApiResultPagePlusAiGenerationVO
    }

    /** Get all AI generation records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAiGenerationVO? {
        return client.post(ApiPaths.backendPath("/generation/list/all"), body) as? PlusApiResultListPlusAiGenerationVO
    }

    /** Get an AI generation record by ID */
    suspend fun getById(id: String): PlusApiResultPlusAiGenerationVO? {
        return client.get(ApiPaths.backendPath("/generation/$id")) as? PlusApiResultPlusAiGenerationVO
    }

    /** Delete an AI generation record */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/generation/$id")) as? PlusApiResultBoolean
    }
}
