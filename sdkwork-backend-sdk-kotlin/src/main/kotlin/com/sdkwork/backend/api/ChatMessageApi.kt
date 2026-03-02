package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ChatMessageApi(private val client: HttpClient) {

    /** Update an existing chat message */
    suspend fun update(body: PlusChatMessageContentForm): PlusApiResultPlusChatMessageContentVO? {
        return client.put(ApiPaths.backendPath("/message"), body) as? PlusApiResultPlusChatMessageContentVO
    }

    /** Create a new chat message */
    suspend fun create(body: PlusChatMessageContentForm): PlusApiResultPlusChatMessageContentVO? {
        return client.post(ApiPaths.backendPath("/message"), body) as? PlusApiResultPlusChatMessageContentVO
    }

    /** Update an existing chat message */
    suspend fun updateMessage(body: PlusChatMessageForm): PlusApiResultPlusChatMessageVO? {
        return client.put(ApiPaths.backendPath("/chat/message"), body) as? PlusApiResultPlusChatMessageVO
    }

    /** Create a new chat message */
    suspend fun createMessage(body: PlusChatMessageForm): PlusApiResultPlusChatMessageVO? {
        return client.post(ApiPaths.backendPath("/chat/message"), body) as? PlusApiResultPlusChatMessageVO
    }

    /** Get chat messages by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusChatMessageContentVO? {
        return client.post(ApiPaths.backendPath("/message/list"), body, params) as? PlusApiResultPagePlusChatMessageContentVO
    }

    /** Get all chat messages */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusChatMessageContentVO? {
        return client.post(ApiPaths.backendPath("/message/list/all"), body) as? PlusApiResultListPlusChatMessageContentVO
    }

    /** Get chat messages by page */
    suspend fun loadMore(body: ChatMessageQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusChatMessageVO? {
        return client.post(ApiPaths.backendPath("/chat/message/load_more"), body, params) as? PlusApiResultPagePlusChatMessageVO
    }

    /** Get chat messages by page */
    suspend fun createListByPage(body: ChatMessageQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusChatMessageVO? {
        return client.post(ApiPaths.backendPath("/chat/message/list"), body, params) as? PlusApiResultPagePlusChatMessageVO
    }

    /** Get all chat messages */
    suspend fun createListAllEntities(body: ChatMessageQueryListForm? = null): PlusApiResultListPlusChatMessageVO? {
        return client.post(ApiPaths.backendPath("/chat/message/list/all"), body) as? PlusApiResultListPlusChatMessageVO
    }

    /** Get chat message by ID */
    suspend fun getById(id: String): PlusApiResultPlusChatMessageContentVO? {
        return client.get(ApiPaths.backendPath("/message/$id")) as? PlusApiResultPlusChatMessageContentVO
    }

    /** Delete a chat message */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/message/$id")) as? PlusApiResultBoolean
    }

    /** Get a chat message by ID */
    suspend fun getByIdMessage(id: String): PlusApiResultPlusChatMessageVO? {
        return client.get(ApiPaths.backendPath("/chat/message/$id")) as? PlusApiResultPlusChatMessageVO
    }

    /** Delete a chat message */
    suspend fun deleteMessage(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/chat/message/$id")) as? PlusApiResultBoolean
    }
}
