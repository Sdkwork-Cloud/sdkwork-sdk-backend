package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class PptTemplateRenderingApi(private val client: HttpClient) {

    /** Render PPT template */
    suspend fun render(body: PlusPptTemplateRenderForm): PlusApiResult? {
        return client.post(ApiPaths.backendPath("/ppt/template/render"), body) as? PlusApiResult
    }
}
