package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AudioEffectGenerationApi(private val client: HttpClient) {

    /** Create audio effect generation task */
    suspend fun create(body: GenerateAudioEffectForm): PlusApiResultGenerateAudioEffectVO? {
        return client.post(ApiPaths.backendPath("/generation/audio-effect/create"), body) as? PlusApiResultGenerateAudioEffectVO
    }

    /** Get audio effect generation result */
    suspend fun getResult(taskId: String): PlusApiResultGenerateAudioEffectVO? {
        return client.get(ApiPaths.backendPath("/generation/audio-effect/result/$taskId")) as? PlusApiResultGenerateAudioEffectVO
    }
}
