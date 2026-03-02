package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class FeedbackApi(private val client: HttpClient) {

    /** Update feedback */
    suspend fun update(body: PlusFeedbackForm): PlusApiResultPlusFeedbackVO? {
        return client.put(ApiPaths.backendPath("/feedback"), body) as? PlusApiResultPlusFeedbackVO
    }

    /** Create new feedback */
    suspend fun create(body: PlusFeedbackForm): PlusApiResultPlusFeedbackVO? {
        return client.post(ApiPaths.backendPath("/feedback"), body) as? PlusApiResultPlusFeedbackVO
    }

    /** Get feedback by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusFeedbackVO? {
        return client.post(ApiPaths.backendPath("/feedback/list"), body, params) as? PlusApiResultPagePlusFeedbackVO
    }

    /** Get all feedback records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusFeedbackVO? {
        return client.post(ApiPaths.backendPath("/feedback/list/all"), body) as? PlusApiResultListPlusFeedbackVO
    }

    /** Get feedback by ID */
    suspend fun getById(id: String): PlusApiResultPlusFeedbackVO? {
        return client.get(ApiPaths.backendPath("/feedback/$id")) as? PlusApiResultPlusFeedbackVO
    }

    /** Delete feedback */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/feedback/$id")) as? PlusApiResultBoolean
    }
}
