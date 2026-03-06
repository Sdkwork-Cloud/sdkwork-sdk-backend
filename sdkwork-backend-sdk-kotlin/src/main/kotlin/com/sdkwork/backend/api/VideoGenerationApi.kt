package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VideoGenerationApi(private val client: HttpClient) {

    /** Create video generation task */
    suspend fun create(body: GenerateVideoForm): PlusApiResultGenerateVideoVO? {
        return client.post(ApiPaths.backendPath("/generation/video/create"), body) as? PlusApiResultGenerateVideoVO
    }

    /** Get video generation result */
    suspend fun getResult(taskId: String): PlusApiResultGenerateVideoVO? {
        return client.get(ApiPaths.backendPath("/generation/video/result/$taskId")) as? PlusApiResultGenerateVideoVO
    }
}
