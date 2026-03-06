package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ImMessageApi(private val client: HttpClient) {

    /** Mark conversation messages as read */
    suspend fun markRead(body: PlusImMessageMarkReadForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/im/message/mark_read"), body) as? PlusApiResultBoolean
    }

    /** Get messages by page */
    suspend fun listByPage(body: PlusImMessageQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusMessage? {
        return client.post(ApiPaths.backendPath("/im/message/list"), body, params) as? PlusApiResultPagePlusMessage
    }
}
