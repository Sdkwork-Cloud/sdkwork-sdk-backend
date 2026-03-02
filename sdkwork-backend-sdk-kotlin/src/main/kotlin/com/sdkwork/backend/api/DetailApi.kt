package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class DetailApi(private val client: HttpClient) {

    /** Update existing detail content */
    suspend fun update(body: PlusDetailForm): PlusApiResultPlusDetailVO? {
        return client.put(ApiPaths.backendPath("/detail"), body) as? PlusApiResultPlusDetailVO
    }

    /** Create new detail content */
    suspend fun create(body: PlusDetailForm): PlusApiResultPlusDetailVO? {
        return client.post(ApiPaths.backendPath("/detail"), body) as? PlusApiResultPlusDetailVO
    }

    /** Get detail contents by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusDetailVO? {
        return client.post(ApiPaths.backendPath("/detail/list"), body, params) as? PlusApiResultPagePlusDetailVO
    }

    /** Get all detail contents */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusDetailVO? {
        return client.post(ApiPaths.backendPath("/detail/list/all"), body) as? PlusApiResultListPlusDetailVO
    }

    /** Get detail content by ID */
    suspend fun getById(id: String): PlusApiResultPlusDetailVO? {
        return client.get(ApiPaths.backendPath("/detail/$id")) as? PlusApiResultPlusDetailVO
    }

    /** Delete detail content */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/detail/$id")) as? PlusApiResultBoolean
    }
}
