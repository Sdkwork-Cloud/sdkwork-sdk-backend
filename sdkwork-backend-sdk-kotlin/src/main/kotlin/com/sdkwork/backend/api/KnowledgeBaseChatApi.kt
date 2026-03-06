package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class KnowledgeBaseChatApi(private val client: HttpClient) {

    suspend fun stop(params: Map<String, Any>? = null, headers: Map<String, String>? = null): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/knowledge_base/chat/stop"), null, params, headers) as? PlusApiResultBoolean
    }

    /** Create a chat completion with Knowledge base */
    suspend fun create(body: ChatCompletionCreateForm, params: Map<String, Any>? = null, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/knowledge_base/chat/completions"), body, params, headers) as? ChatCompletionChunk
    }
}
