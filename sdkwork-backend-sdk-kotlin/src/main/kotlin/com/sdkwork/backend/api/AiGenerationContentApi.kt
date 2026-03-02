package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AiGenerationContentApi(private val client: HttpClient) {

    /** Update AI generated content */
    suspend fun update(body: PlusAiGenerationContentForm): PlusApiResultPlusAiGenerationContentVO? {
        return client.put(ApiPaths.backendPath("/generation/content"), body) as? PlusApiResultPlusAiGenerationContentVO
    }

    /** Create new AI generated content */
    suspend fun create(body: PlusAiGenerationContentForm): PlusApiResultPlusAiGenerationContentVO? {
        return client.post(ApiPaths.backendPath("/generation/content"), body) as? PlusApiResultPlusAiGenerationContentVO
    }

    /** Get AI generated content by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiGenerationContentVO? {
        return client.post(ApiPaths.backendPath("/generation/content/list"), body, params) as? PlusApiResultPagePlusAiGenerationContentVO
    }

    /** Get all AI generated content */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAiGenerationContentVO? {
        return client.post(ApiPaths.backendPath("/generation/content/list/all"), body) as? PlusApiResultListPlusAiGenerationContentVO
    }

    /** Get AI generated content by ID */
    suspend fun getById(id: String): PlusApiResultPlusAiGenerationContentVO? {
        return client.get(ApiPaths.backendPath("/generation/content/$id")) as? PlusApiResultPlusAiGenerationContentVO
    }

    /** Delete AI generated content */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/generation/content/$id")) as? PlusApiResultBoolean
    }
}
