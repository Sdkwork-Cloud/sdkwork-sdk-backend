package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AiChatApi(private val client: HttpClient) {

    /** Stop a chat completion stream */
    suspend fun stop(headers: Map<String, String>? = null): PlusApiResult? {
        return client.post(ApiPaths.backendPath("/chat/stop"), null, null, headers) as? PlusApiResult
    }

    /** Create a chat completion */
    suspend fun create(body: ChatCompletionCreateForm, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/chat/completions"), body, null, headers) as? ChatCompletionChunk
    }
}
