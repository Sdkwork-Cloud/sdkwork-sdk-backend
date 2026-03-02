package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class NewsApi(private val client: HttpClient) {

    /** Update an existing news */
    suspend fun update(body: PlusNewsForm): PlusApiResultPlusNewsVO? {
        return client.put(ApiPaths.backendPath("/news"), body) as? PlusApiResultPlusNewsVO
    }

    /** Create a new news */
    suspend fun create(body: PlusNewsForm): PlusApiResultPlusNewsVO? {
        return client.post(ApiPaths.backendPath("/news"), body) as? PlusApiResultPlusNewsVO
    }

    /** Get news by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusNewsVO? {
        return client.post(ApiPaths.backendPath("/news/list"), body, params) as? PlusApiResultPagePlusNewsVO
    }

    /** Get all news */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusNewsVO? {
        return client.post(ApiPaths.backendPath("/news/list/all"), body) as? PlusApiResultListPlusNewsVO
    }

    /** Get a news by ID */
    suspend fun getById(id: String): PlusApiResultPlusNewsVO? {
        return client.get(ApiPaths.backendPath("/news/$id")) as? PlusApiResultPlusNewsVO
    }

    /** Delete a news */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/news/$id")) as? PlusApiResultBoolean
    }
}
