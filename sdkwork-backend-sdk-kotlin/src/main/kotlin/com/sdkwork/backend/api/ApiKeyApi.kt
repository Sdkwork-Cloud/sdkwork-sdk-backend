package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ApiKeyApi(private val client: HttpClient) {

    /** Update an existing API key */
    suspend fun update(body: PlusApiKeyForm): PlusApiResultPlusApiKeyVO? {
        return client.put(ApiPaths.backendPath("/apikey"), body) as? PlusApiResultPlusApiKeyVO
    }

    /** Create a new API key */
    suspend fun create(body: PlusApiKeyForm): PlusApiResultPlusApiKeyVO? {
        return client.post(ApiPaths.backendPath("/apikey"), body) as? PlusApiResultPlusApiKeyVO
    }

    /** Get API key detail for current user */
    suspend fun getMy(id: String): PlusApiResultPlusApiKeyVO? {
        return client.get(ApiPaths.backendPath("/apikey/my/$id")) as? PlusApiResultPlusApiKeyVO
    }

    /** Update API key for current user */
    suspend fun updateMy(id: String, body: PlusApiKeySelfUpdateForm): PlusApiResultPlusApiKeyVO? {
        return client.put(ApiPaths.backendPath("/apikey/my/$id"), body) as? PlusApiResultPlusApiKeyVO
    }

    /** Delete API key for current user */
    suspend fun deleteMy(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/apikey/my/$id")) as? PlusApiResultBoolean
    }

    /** Create API key for current user */
    suspend fun createMy(body: PlusApiKeySelfCreateForm): PlusApiResultPlusApiKeyVO? {
        return client.post(ApiPaths.backendPath("/apikey/my"), body) as? PlusApiResultPlusApiKeyVO
    }

    /** Rotate API key for current user */
    suspend fun rotateMy(id: String): PlusApiResultPlusApiKeyVO? {
        return client.post(ApiPaths.backendPath("/apikey/my/$id/rotate"), null) as? PlusApiResultPlusApiKeyVO
    }

    /** Enable API key for current user */
    suspend fun enableMy(id: String): PlusApiResultPlusApiKeyVO? {
        return client.post(ApiPaths.backendPath("/apikey/my/$id/enable"), null) as? PlusApiResultPlusApiKeyVO
    }

    /** Disable API key for current user */
    suspend fun disableMy(id: String): PlusApiResultPlusApiKeyVO? {
        return client.post(ApiPaths.backendPath("/apikey/my/$id/disable"), null) as? PlusApiResultPlusApiKeyVO
    }

    /** Get API keys by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusApiKeyVO? {
        return client.post(ApiPaths.backendPath("/apikey/list"), body, params) as? PlusApiResultPagePlusApiKeyVO
    }

    /** Get all API keys */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusApiKeyVO? {
        return client.post(ApiPaths.backendPath("/apikey/list/all"), body) as? PlusApiResultListPlusApiKeyVO
    }

    /** Get an API key by ID */
    suspend fun getById(id: String): PlusApiResultPlusApiKeyVO? {
        return client.get(ApiPaths.backendPath("/apikey/$id")) as? PlusApiResultPlusApiKeyVO
    }

    /** Delete an API key */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/apikey/$id")) as? PlusApiResultBoolean
    }

    /** List API keys for current user */
    suspend fun listMyApiKeys(): PlusApiResultListPlusApiKeyVO? {
        return client.get(ApiPaths.backendPath("/apikey/my/list")) as? PlusApiResultListPlusApiKeyVO
    }
}
