package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AiArticleApi(private val client: HttpClient) {

    /** Update an existing AI article */
    suspend fun update(body: PlusArticleForm): PlusApiResultPlusArticleVO? {
        return client.put(ApiPaths.backendPath("/article"), body) as? PlusApiResultPlusArticleVO
    }

    /** Create a new AI article */
    suspend fun create(body: PlusArticleForm): PlusApiResultPlusArticleVO? {
        return client.post(ApiPaths.backendPath("/article"), body) as? PlusApiResultPlusArticleVO
    }

    /** Get AI articles by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusArticleVO? {
        return client.post(ApiPaths.backendPath("/article/list"), body, params) as? PlusApiResultPagePlusArticleVO
    }

    /** Get all AI articles */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusArticleVO? {
        return client.post(ApiPaths.backendPath("/article/list/all"), body) as? PlusApiResultListPlusArticleVO
    }

    /** Get an AI article by ID */
    suspend fun getById(id: String): PlusApiResultPlusArticleVO? {
        return client.get(ApiPaths.backendPath("/article/$id")) as? PlusApiResultPlusArticleVO
    }

    /** Delete an AI article */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/article/$id")) as? PlusApiResultBoolean
    }
}
