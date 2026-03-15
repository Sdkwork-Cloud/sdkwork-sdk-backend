package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ModelApi(private val client: HttpClient) {

    /** Update existing AI model information */
    suspend fun update(body: PlusAiModelInfoForm): PlusApiResultPlusAiModelInfoVO? {
        return client.put(ApiPaths.backendPath("/model"), body) as? PlusApiResultPlusAiModelInfoVO
    }

    /** Create a new AI model information */
    suspend fun create(body: PlusAiModelInfoForm): PlusApiResultPlusAiModelInfoVO? {
        return client.post(ApiPaths.backendPath("/model"), body) as? PlusApiResultPlusAiModelInfoVO
    }

    /** Update an existing AI model price */
    suspend fun updatePrice(body: PlusAiModelPriceForm): PlusApiResultPlusAiModelPriceVO? {
        return client.put(ApiPaths.backendPath("/model/price"), body) as? PlusApiResultPlusAiModelPriceVO
    }

    /** Create a new AI model price */
    suspend fun createPrice(body: PlusAiModelPriceForm): PlusApiResultPlusAiModelPriceVO? {
        return client.post(ApiPaths.backendPath("/model/price"), body) as? PlusApiResultPlusAiModelPriceVO
    }

    /** Get AI model prices by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiModelPriceVO? {
        return client.post(ApiPaths.backendPath("/model/price/list"), body, params) as? PlusApiResultPagePlusAiModelPriceVO
    }

    /** Get all AI model prices */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAiModelPriceVO? {
        return client.post(ApiPaths.backendPath("/model/price/list/all"), body) as? PlusApiResultListPlusAiModelPriceVO
    }

    /** Get AI model information by page */
    suspend fun createListByPageModel(body: PlusAiModelInfoQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiModelInfoVO? {
        return client.post(ApiPaths.backendPath("/model/list"), body, params) as? PlusApiResultPagePlusAiModelInfoVO
    }

    /** Get all AI model information */
    suspend fun createListAllEntitiesModel(body: PlusAiModelInfoQueryListForm? = null): PlusApiResultListPlusAiModelInfoVO? {
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

    /** Get an AI model price by ID */
    suspend fun getByIdPrice(id: String): PlusApiResultPlusAiModelPriceVO? {
        return client.get(ApiPaths.backendPath("/model/price/$id")) as? PlusApiResultPlusAiModelPriceVO
    }

    /** Delete an AI model price */
    suspend fun deletePrice(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/model/price/$id")) as? PlusApiResultBoolean
    }
}
