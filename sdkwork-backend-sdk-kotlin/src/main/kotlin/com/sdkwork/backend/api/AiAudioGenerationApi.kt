package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AiAudioGenerationApi(private val client: HttpClient) {

    /** Create audio generation task */
    suspend fun create(body: GenerateAudioForm): PlusApiResultGenerateAudioVO? {
        return client.post(ApiPaths.backendPath("/generation/audio/create"), body) as? PlusApiResultGenerateAudioVO
    }

    /** Get audio generation result */
    suspend fun getResult(taskId: String): PlusApiResultGenerateAudioVO? {
        return client.get(ApiPaths.backendPath("/generation/audio/result/$taskId")) as? PlusApiResultGenerateAudioVO
    }
}
