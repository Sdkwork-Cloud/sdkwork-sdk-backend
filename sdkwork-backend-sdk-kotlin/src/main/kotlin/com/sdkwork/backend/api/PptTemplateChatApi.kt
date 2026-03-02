package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class PptTemplateChatApi(private val client: HttpClient) {

    suspend fun stop(headers: Map<String, String>? = null): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/ppt/template/chat/stop"), null, null, headers) as? PlusApiResultBoolean
    }

    /** Create a chat completion with PPT template */
    suspend fun create(body: ChatCompletionCreateForm, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/ppt/template/chat/completions"), body, null, headers) as? ChatCompletionChunk
    }
}
