package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VoteApi(private val client: HttpClient) {

    /** Update an existing content vote */
    suspend fun update(body: ContentVoteForm): PlusApiResultContentVoteVO? {
        return client.put(ApiPaths.backendPath("/vote"), body) as? PlusApiResultContentVoteVO
    }

    /** Create a new content vote */
    suspend fun create(body: ContentVoteForm): PlusApiResultContentVoteVO? {
        return client.post(ApiPaths.backendPath("/vote"), body) as? PlusApiResultContentVoteVO
    }

    /** Get content votes by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPageContentVoteVO? {
        return client.post(ApiPaths.backendPath("/vote/list"), body, params) as? PlusApiResultPageContentVoteVO
    }

    /** Get all content votes */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListContentVoteVO? {
        return client.post(ApiPaths.backendPath("/vote/list/all"), body) as? PlusApiResultListContentVoteVO
    }

    /** Get a content vote by ID */
    suspend fun getById(id: String): PlusApiResultContentVoteVO? {
        return client.get(ApiPaths.backendPath("/vote/$id")) as? PlusApiResultContentVoteVO
    }

    /** Delete a content vote */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vote/$id")) as? PlusApiResultBoolean
    }
}
