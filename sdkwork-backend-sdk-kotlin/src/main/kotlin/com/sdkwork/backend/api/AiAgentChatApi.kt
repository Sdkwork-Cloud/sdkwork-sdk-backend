package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AiAgentChatApi(private val client: HttpClient) {

    /** Create a chat completion with agent */
    suspend fun withContext(body: ChatCompletionCreateForm, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/agent/chat/with_context"), body, null, headers) as? ChatCompletionChunk
    }

    /** Stop a chat completion stream */
    suspend fun stop(headers: Map<String, String>? = null): PlusApiResult? {
        return client.post(ApiPaths.backendPath("/agent/chat/stop"), null, null, headers) as? PlusApiResult
    }

    /** Create a chat completion with agent */
    suspend fun resumeStream(body: ChatCompletionCreateForm, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/agent/chat/resume_stream"), body, null, headers) as? ChatCompletionChunk
    }

    /** Create a chat completion with agent */
    suspend fun create(body: ChatCompletionCreateForm, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/agent/chat/completions"), body, null, headers) as? ChatCompletionChunk
    }
}
