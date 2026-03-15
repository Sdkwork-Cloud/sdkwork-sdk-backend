package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class SearchApi(private val client: HttpClient) {

    suspend fun stop(params: Map<String, Any>? = null, headers: Map<String, String>? = null): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/search/chat/stop"), null, params, headers) as? PlusApiResultBoolean
    }

    /** Create a chat completion with Search */
    suspend fun create(body: ChatCompletionCreateForm, params: Map<String, Any>? = null, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/search/chat/completions"), body, params, headers) as? ChatCompletionChunk
    }
}
