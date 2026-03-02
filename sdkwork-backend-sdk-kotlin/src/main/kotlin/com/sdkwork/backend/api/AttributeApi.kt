package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AttributeApi(private val client: HttpClient) {

    /** Update attribute */
    suspend fun update(body: PlusAttributeForm): PlusApiResultPlusAttributeVO? {
        return client.put(ApiPaths.backendPath("/attribute"), body) as? PlusApiResultPlusAttributeVO
    }

    /** Create attribute */
    suspend fun create(body: PlusAttributeForm): PlusApiResultPlusAttributeVO? {
        return client.post(ApiPaths.backendPath("/attribute"), body) as? PlusApiResultPlusAttributeVO
    }

    /** Get attributes by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAttributeVO? {
        return client.post(ApiPaths.backendPath("/attribute/list"), body, params) as? PlusApiResultPagePlusAttributeVO
    }

    /** Get all attributes */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAttributeVO? {
        return client.post(ApiPaths.backendPath("/attribute/list/all"), body) as? PlusApiResultListPlusAttributeVO
    }

    /** Get attribute by ID */
    suspend fun getById(id: String): PlusApiResultPlusAttributeVO? {
        return client.get(ApiPaths.backendPath("/attribute/$id")) as? PlusApiResultPlusAttributeVO
    }

    /** Delete attribute */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/attribute/$id")) as? PlusApiResultBoolean
    }
}
