package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ConversationApi(private val client: HttpClient) {

    /** Update an existing conversation */
    suspend fun update(body: PlusConversationForm): PlusApiResultPlusConversationVO? {
        return client.put(ApiPaths.backendPath("/conversation"), body) as? PlusApiResultPlusConversationVO
    }

    /** Create a new conversation */
    suspend fun create(body: PlusConversationForm): PlusApiResultPlusConversationVO? {
        return client.post(ApiPaths.backendPath("/conversation"), body) as? PlusApiResultPlusConversationVO
    }

    /** Pin/Unpin a conversation */
    suspend fun pin(id: String, params: Map<String, Any>? = null): PlusApiResultPlusConversationVO? {
        return client.post(ApiPaths.backendPath("/conversation/$id/pin"), null, params) as? PlusApiResultPlusConversationVO
    }

    /** Get all open conversations */
    suspend fun open(body: PlusConversationOpenForm? = null): PlusApiResultPlusConversationVO? {
        return client.post(ApiPaths.backendPath("/conversation/open"), body) as? PlusApiResultPlusConversationVO
    }

    /** Update an existing conversation */
    suspend fun messageFeedback(body: PlusMessageFeedbackForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/conversation/message_feedback"), body) as? PlusApiResultBoolean
    }

    /** Get conversations by page */
    suspend fun listByPage(body: PlusConversationQueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusConversationVO? {
        return client.post(ApiPaths.backendPath("/conversation/list"), body, params) as? PlusApiResultPagePlusConversationVO
    }

    /** Get all conversations */
    suspend fun listAllEntities(body: PlusConversationQueryListForm? = null): PlusApiResultListPlusConversationVO? {
        return client.post(ApiPaths.backendPath("/conversation/list/all"), body) as? PlusApiResultListPlusConversationVO
    }

    /** Get a conversation by ID */
    suspend fun getById(id: String): PlusApiResultPlusConversationVO? {
        return client.get(ApiPaths.backendPath("/conversation/$id")) as? PlusApiResultPlusConversationVO
    }

    /** Delete a conversation */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/conversation/$id")) as? PlusApiResultBoolean
    }
}
