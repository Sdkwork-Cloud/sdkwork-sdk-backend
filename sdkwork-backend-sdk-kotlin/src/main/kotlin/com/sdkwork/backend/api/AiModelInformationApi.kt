package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AiModelInformationApi(private val client: HttpClient) {

    /** Update existing AI model information */
    suspend fun update(body: PlusAiModelInfoForm): PlusApiResultPlusAiModelInfoVO? {
        return client.put(ApiPaths.backendPath("/model"), body) as? PlusApiResultPlusAiModelInfoVO
    }

    /** Create a new AI model information */
    suspend fun create(body: PlusAiModelInfoForm): PlusApiResultPlusAiModelInfoVO? {
        return client.post(ApiPaths.backendPath("/model"), body) as? PlusApiResultPlusAiModelInfoVO
    }

    /** Get AI model information by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiModelInfoVO? {
        return client.post(ApiPaths.backendPath("/model/list"), body, params) as? PlusApiResultPagePlusAiModelInfoVO
    }

    /** Get all AI model information */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAiModelInfoVO? {
        return client.post(ApiPaths.backendPath("/model/list/all"), body) as? PlusApiResultListPlusAiModelInfoVO
    }

    /** Get AI model information by ID */
    suspend fun getById(id: String): PlusApiResultPlusAiModelInfoVO? {
        return client.get(ApiPaths.backendPath("/model/$id")) as? PlusApiResultPlusAiModelInfoVO
    }

    /** Delete AI model information */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/model/$id")) as? PlusApiResultBoolean
    }
}
