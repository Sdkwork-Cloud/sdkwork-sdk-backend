package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ImMessageApi(private val client: HttpClient) {

    /** Get messages by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusMessage? {
        return client.post(ApiPaths.backendPath("/im/message/list"), body, params) as? PlusApiResultPagePlusMessage
    }
}
