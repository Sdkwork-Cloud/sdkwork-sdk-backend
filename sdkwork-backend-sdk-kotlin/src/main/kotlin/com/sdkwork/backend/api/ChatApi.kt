package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ChatApi(private val client: HttpClient) {

    /** Stop a chat completion stream */
    suspend fun stop(params: Map<String, Any>? = null, headers: Map<String, String>? = null): PlusApiResult? {
        return client.post(ApiPaths.backendPath("/chat/stop"), null, params, headers) as? PlusApiResult
    }

    /** Create a chat completion */
    suspend fun create(body: ChatCompletionCreateForm, params: Map<String, Any>? = null, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/chat/completions"), body, params, headers) as? ChatCompletionChunk
    }
}
