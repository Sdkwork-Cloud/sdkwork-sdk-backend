package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AgentChatApi(private val client: HttpClient) {

    /** Create a chat completion with agent */
    suspend fun withContext(body: ChatCompletionCreateForm, params: Map<String, Any>? = null, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/agent/chat/with_context"), body, params, headers) as? ChatCompletionChunk
    }

    /** Stop a chat completion stream */
    suspend fun stop(params: Map<String, Any>? = null, headers: Map<String, String>? = null): PlusApiResult? {
        return client.post(ApiPaths.backendPath("/agent/chat/stop"), null, params, headers) as? PlusApiResult
    }

    /** Create a chat completion with agent */
    suspend fun resumeStream(body: ChatCompletionCreateForm, params: Map<String, Any>? = null, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/agent/chat/resume_stream"), body, params, headers) as? ChatCompletionChunk
    }

    /** Create a chat completion with agent */
    suspend fun create(body: ChatCompletionCreateForm, params: Map<String, Any>? = null, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/agent/chat/completions"), body, params, headers) as? ChatCompletionChunk
    }
}
