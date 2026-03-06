package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VoiceSpeakerGenerationApi(private val client: HttpClient) {

    /** Create voice speaker generation task */
    suspend fun create(body: GenerateVoiceSpeakerForm): PlusApiResultGenerateVoiceSpeakerVO? {
        return client.post(ApiPaths.backendPath("/generation/voice-speaker/create"), body) as? PlusApiResultGenerateVoiceSpeakerVO
    }

    /** Get voice speaker generation result */
    suspend fun getResultByTaskId(taskId: String): PlusApiResultGenerateVoiceSpeakerVO? {
        return client.get(ApiPaths.backendPath("/generation/voice-speaker/result/$taskId")) as? PlusApiResultGenerateVoiceSpeakerVO
    }
}
