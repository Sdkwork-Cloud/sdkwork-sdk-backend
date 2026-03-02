package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AiModelPriceApi(private val client: HttpClient) {

    /** Update an existing AI model price */
    suspend fun update(body: PlusAiModelPriceForm): PlusApiResultPlusAiModelPriceVO? {
        return client.put(ApiPaths.backendPath("/model/price"), body) as? PlusApiResultPlusAiModelPriceVO
    }

    /** Create a new AI model price */
    suspend fun create(body: PlusAiModelPriceForm): PlusApiResultPlusAiModelPriceVO? {
        return client.post(ApiPaths.backendPath("/model/price"), body) as? PlusApiResultPlusAiModelPriceVO
    }

    /** Get AI model prices by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiModelPriceVO? {
        return client.post(ApiPaths.backendPath("/model/price/list"), body, params) as? PlusApiResultPagePlusAiModelPriceVO
    }

    /** Get all AI model prices */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAiModelPriceVO? {
        return client.post(ApiPaths.backendPath("/model/price/list/all"), body) as? PlusApiResultListPlusAiModelPriceVO
    }

    /** Get an AI model price by ID */
    suspend fun getById(id: String): PlusApiResultPlusAiModelPriceVO? {
        return client.get(ApiPaths.backendPath("/model/price/$id")) as? PlusApiResultPlusAiModelPriceVO
    }

    /** Delete an AI model price */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/model/price/$id")) as? PlusApiResultBoolean
    }
}
