package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AiCharacterGenerationApi(private val client: HttpClient) {

    /** Create character generation task */
    suspend fun create(body: GenerateCharacterForm): PlusApiResultGenerateCharacterVO? {
        return client.post(ApiPaths.backendPath("/generation/character/create"), body) as? PlusApiResultGenerateCharacterVO
    }

    /** Get character generation result */
    suspend fun getResult(taskId: String): PlusApiResultGenerateCharacterVO? {
        return client.get(ApiPaths.backendPath("/generation/character/result/$taskId")) as? PlusApiResultGenerateCharacterVO
    }
}
