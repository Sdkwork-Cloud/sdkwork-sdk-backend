package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class MessageApi(private val client: HttpClient) {

    /** Update an existing chat message */
    suspend fun update(body: PlusChatMessageContentForm): PlusApiResultPlusChatMessageContentVO? {
        return client.put(ApiPaths.backendPath("/message"), body) as? PlusApiResultPlusChatMessageContentVO
    }

    /** Create a new chat message */
    suspend fun create(body: PlusChatMessageContentForm): PlusApiResultPlusChatMessageContentVO? {
        return client.post(ApiPaths.backendPath("/message"), body) as? PlusApiResultPlusChatMessageContentVO
    }

    /** Get chat messages by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusChatMessageContentVO? {
        return client.post(ApiPaths.backendPath("/message/list"), body, params) as? PlusApiResultPagePlusChatMessageContentVO
    }

    /** Get all chat messages */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusChatMessageContentVO? {
        return client.post(ApiPaths.backendPath("/message/list/all"), body) as? PlusApiResultListPlusChatMessageContentVO
    }

    /** Get chat message by ID */
    suspend fun getById(id: String): PlusApiResultPlusChatMessageContentVO? {
        return client.get(ApiPaths.backendPath("/message/$id")) as? PlusApiResultPlusChatMessageContentVO
    }

    /** Delete a chat message */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/message/$id")) as? PlusApiResultBoolean
    }
}
