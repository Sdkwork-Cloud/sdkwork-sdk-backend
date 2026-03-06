package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class MusicGenerationApi(private val client: HttpClient) {

    /** Create music generation task */
    suspend fun create(body: GenerateMusicForm): PlusApiResultGenerateMusicVO? {
        return client.post(ApiPaths.backendPath("/generation/music/create"), body) as? PlusApiResultGenerateMusicVO
    }

    /** Get music generation result */
    suspend fun getResult(taskId: String): PlusApiResultGenerateMusicVO? {
        return client.get(ApiPaths.backendPath("/generation/music/result/$taskId")) as? PlusApiResultGenerateMusicVO
    }
}
