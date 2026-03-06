package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ImageGenerationApi(private val client: HttpClient) {

    /** Create image generation task */
    suspend fun create(body: GenerateImageForm): PlusApiResultGenerateImageVO? {
        return client.post(ApiPaths.backendPath("/generation/image/create"), body) as? PlusApiResultGenerateImageVO
    }

    /** Get image generation result */
    suspend fun getResult(taskId: String): PlusApiResultGenerateImageVO? {
        return client.get(ApiPaths.backendPath("/generation/image/result/$taskId")) as? PlusApiResultGenerateImageVO
    }
}
