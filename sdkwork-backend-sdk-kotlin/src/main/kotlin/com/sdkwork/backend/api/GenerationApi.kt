package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class GenerationApi(private val client: HttpClient) {

    /** Update an existing AI generation record */
    suspend fun update(body: PlusAiGenerationForm): PlusApiResultPlusAiGenerationVO? {
        return client.put(ApiPaths.backendPath("/generation"), body) as? PlusApiResultPlusAiGenerationVO
    }

    /** Create a new AI generation record */
    suspend fun create(body: PlusAiGenerationForm): PlusApiResultPlusAiGenerationVO? {
        return client.post(ApiPaths.backendPath("/generation"), body) as? PlusApiResultPlusAiGenerationVO
    }

    /** Update AI generated content */
    suspend fun updateContent(body: PlusAiGenerationContentForm): PlusApiResultPlusAiGenerationContentVO? {
        return client.put(ApiPaths.backendPath("/generation/content"), body) as? PlusApiResultPlusAiGenerationContentVO
    }

    /** Create new AI generated content */
    suspend fun createContent(body: PlusAiGenerationContentForm): PlusApiResultPlusAiGenerationContentVO? {
        return client.post(ApiPaths.backendPath("/generation/content"), body) as? PlusApiResultPlusAiGenerationContentVO
    }

    /** Create voice speaker generation task */
    suspend fun createVoiceSpeaker(body: GenerateVoiceSpeakerForm): PlusApiResultGenerateVoiceSpeakerVO? {
        return client.post(ApiPaths.backendPath("/generation/voice-speaker/create"), body) as? PlusApiResultGenerateVoiceSpeakerVO
    }

    /** Create video generation task */
    suspend fun createVideo(body: GenerateVideoForm): PlusApiResultGenerateVideoVO? {
        return client.post(ApiPaths.backendPath("/generation/video/create"), body) as? PlusApiResultGenerateVideoVO
    }

    /** Create music generation task */
    suspend fun createMusic(body: GenerateMusicForm): PlusApiResultGenerateMusicVO? {
        return client.post(ApiPaths.backendPath("/generation/music/create"), body) as? PlusApiResultGenerateMusicVO
    }

    /** Get AI generation records by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiGenerationVO? {
        return client.post(ApiPaths.backendPath("/generation/list"), body, params) as? PlusApiResultPagePlusAiGenerationVO
    }

    /** Get all AI generation records */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAiGenerationVO? {
        return client.post(ApiPaths.backendPath("/generation/list/all"), body) as? PlusApiResultListPlusAiGenerationVO
    }

    /** Create image generation task */
    suspend fun createImage(body: GenerateImageForm): PlusApiResultGenerateImageVO? {
        return client.post(ApiPaths.backendPath("/generation/image/create"), body) as? PlusApiResultGenerateImageVO
    }

    /** Get AI generated content by page */
    suspend fun createListByPageContent(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAiGenerationContentVO? {
        return client.post(ApiPaths.backendPath("/generation/content/list"), body, params) as? PlusApiResultPagePlusAiGenerationContentVO
    }

    /** Get all AI generated content */
    suspend fun createListAllEntitiesContent(body: QueryListForm? = null): PlusApiResultListPlusAiGenerationContentVO? {
        return client.post(ApiPaths.backendPath("/generation/content/list/all"), body) as? PlusApiResultListPlusAiGenerationContentVO
    }

    /** Create character generation task */
    suspend fun createCharacter(body: GenerateCharacterForm): PlusApiResultGenerateCharacterVO? {
        return client.post(ApiPaths.backendPath("/generation/character/create"), body) as? PlusApiResultGenerateCharacterVO
    }

    /** Create audio generation task */
    suspend fun createAudio(body: GenerateAudioForm): PlusApiResultGenerateAudioVO? {
        return client.post(ApiPaths.backendPath("/generation/audio/create"), body) as? PlusApiResultGenerateAudioVO
    }

    /** Create audio effect generation task */
    suspend fun createAudioEffect(body: GenerateAudioEffectForm): PlusApiResultGenerateAudioEffectVO? {
        return client.post(ApiPaths.backendPath("/generation/audio-effect/create"), body) as? PlusApiResultGenerateAudioEffectVO
    }

    /** Get an AI generation record by ID */
    suspend fun getById(id: String): PlusApiResultPlusAiGenerationVO? {
        return client.get(ApiPaths.backendPath("/generation/$id")) as? PlusApiResultPlusAiGenerationVO
    }

    /** Delete an AI generation record */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/generation/$id")) as? PlusApiResultBoolean
    }

    /** Get voice speaker generation result */
    suspend fun getResultByTaskId(taskId: String): PlusApiResultGenerateVoiceSpeakerVO? {
        return client.get(ApiPaths.backendPath("/generation/voice-speaker/result/$taskId")) as? PlusApiResultGenerateVoiceSpeakerVO
    }

    /** Get video generation result */
    suspend fun getResult(taskId: String): PlusApiResultGenerateVideoVO? {
        return client.get(ApiPaths.backendPath("/generation/video/result/$taskId")) as? PlusApiResultGenerateVideoVO
    }

    /** Get music generation result */
    suspend fun getResultMusic(taskId: String): PlusApiResultGenerateMusicVO? {
        return client.get(ApiPaths.backendPath("/generation/music/result/$taskId")) as? PlusApiResultGenerateMusicVO
    }

    /** Get image generation result */
    suspend fun getResultImage(taskId: String): PlusApiResultGenerateImageVO? {
        return client.get(ApiPaths.backendPath("/generation/image/result/$taskId")) as? PlusApiResultGenerateImageVO
    }

    /** Get AI generated content by ID */
    suspend fun getByIdContent(id: String): PlusApiResultPlusAiGenerationContentVO? {
        return client.get(ApiPaths.backendPath("/generation/content/$id")) as? PlusApiResultPlusAiGenerationContentVO
    }

    /** Delete AI generated content */
    suspend fun deleteContent(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/generation/content/$id")) as? PlusApiResultBoolean
    }

    /** Get character generation result */
    suspend fun getResultCharacter(taskId: String): PlusApiResultGenerateCharacterVO? {
        return client.get(ApiPaths.backendPath("/generation/character/result/$taskId")) as? PlusApiResultGenerateCharacterVO
    }

    /** Get audio generation result */
    suspend fun getResultAudio(taskId: String): PlusApiResultGenerateAudioVO? {
        return client.get(ApiPaths.backendPath("/generation/audio/result/$taskId")) as? PlusApiResultGenerateAudioVO
    }

    /** Get audio effect generation result */
    suspend fun getResultAudioEffect(taskId: String): PlusApiResultGenerateAudioEffectVO? {
        return client.get(ApiPaths.backendPath("/generation/audio-effect/result/$taskId")) as? PlusApiResultGenerateAudioEffectVO
    }
}
