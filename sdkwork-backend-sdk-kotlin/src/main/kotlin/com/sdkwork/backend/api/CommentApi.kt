package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class CommentApi(private val client: HttpClient) {

    /** Update an existing comment */
    suspend fun update(body: PlusCommentsForm): PlusApiResultPlusCommentsVO? {
        return client.put(ApiPaths.backendPath("/comments"), body) as? PlusApiResultPlusCommentsVO
    }

    /** Create a new comment */
    suspend fun create(body: PlusCommentsForm): PlusApiResultPlusCommentsVO? {
        return client.post(ApiPaths.backendPath("/comments"), body) as? PlusApiResultPlusCommentsVO
    }

    /** Unlike a comment */
    suspend fun unlike(id: String): PlusApiResultPlusCommentsVO? {
        return client.post(ApiPaths.backendPath("/comments/$id/unlike"), null) as? PlusApiResultPlusCommentsVO
    }

    /** Reply to a comment */
    suspend fun reply(id: String, body: PlusCommentsReplyForm): PlusApiResultPlusCommentsVO? {
        return client.post(ApiPaths.backendPath("/comments/$id/reply"), body) as? PlusApiResultPlusCommentsVO
    }

    /** Like a comment */
    suspend fun like(id: String): PlusApiResultPlusCommentsVO? {
        return client.post(ApiPaths.backendPath("/comments/$id/like"), null) as? PlusApiResultPlusCommentsVO
    }

    /** Get comments by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCommentsVO? {
        return client.post(ApiPaths.backendPath("/comments/list"), body, params) as? PlusApiResultPagePlusCommentsVO
    }

    /** Get all comments */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusCommentsVO? {
        return client.post(ApiPaths.backendPath("/comments/list/all"), body) as? PlusApiResultListPlusCommentsVO
    }

    /** Get a comment by ID */
    suspend fun getById(id: String): PlusApiResultPlusCommentsVO? {
        return client.get(ApiPaths.backendPath("/comments/$id")) as? PlusApiResultPlusCommentsVO
    }

    /** Delete a comment */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/comments/$id")) as? PlusApiResultBoolean
    }
}
