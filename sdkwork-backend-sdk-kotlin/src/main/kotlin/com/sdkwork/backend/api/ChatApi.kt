package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ChatApi(private val client: HttpClient) {

    /** Update an existing chat message */
    suspend fun updateMessage(body: PlusChatMessageForm): PlusApiResultPlusChatMessageVO? {
        return client.put(ApiPaths.backendPath("/chat/message"), body) as? PlusApiResultPlusChatMessageVO
    }

    /** Create a new chat message */
    suspend fun createMessage(body: PlusChatMessageForm): PlusApiResultPlusChatMessageVO? {
        return client.post(ApiPaths.backendPath("/chat/message"), body) as? PlusApiResultPlusChatMessageVO
    }

    /** Stop a chat completion stream */
    suspend fun stop(params: Map<String, Any>? = null, headers: Map<String, String>? = null): PlusApiResult? {
        return client.post(ApiPaths.backendPath("/chat/stop"), null, params, headers) as? PlusApiResult
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

    /** Create a chat completion */
    suspend fun create(body: ChatCompletionCreateForm, params: Map<String, Any>? = null, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/chat/completions"), body, params, headers) as? ChatCompletionChunk
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
