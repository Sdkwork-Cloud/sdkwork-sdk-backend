package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class GenerationApi {
    private final HttpClient client;
    
    public GenerationApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing AI generation record */
    public PlusApiResultPlusAiGenerationVO update(PlusAiGenerationForm body) throws Exception {
        return (PlusApiResultPlusAiGenerationVO) client.put(ApiPaths.backendPath("/generation"), body);
    }

    /** Create a new AI generation record */
    public PlusApiResultPlusAiGenerationVO create(PlusAiGenerationForm body) throws Exception {
        return (PlusApiResultPlusAiGenerationVO) client.post(ApiPaths.backendPath("/generation"), body);
    }

    /** Update AI generated content */
    public PlusApiResultPlusAiGenerationContentVO updateContent(PlusAiGenerationContentForm body) throws Exception {
        return (PlusApiResultPlusAiGenerationContentVO) client.put(ApiPaths.backendPath("/generation/content"), body);
    }

    /** Create new AI generated content */
    public PlusApiResultPlusAiGenerationContentVO createContent(PlusAiGenerationContentForm body) throws Exception {
        return (PlusApiResultPlusAiGenerationContentVO) client.post(ApiPaths.backendPath("/generation/content"), body);
    }

    /** Create voice speaker generation task */
    public PlusApiResultGenerateVoiceSpeakerVO createVoiceSpeaker(GenerateVoiceSpeakerForm body) throws Exception {
        return (PlusApiResultGenerateVoiceSpeakerVO) client.post(ApiPaths.backendPath("/generation/voice-speaker/create"), body);
    }

    /** Create video generation task */
    public PlusApiResultGenerateVideoVO createVideo(GenerateVideoForm body) throws Exception {
        return (PlusApiResultGenerateVideoVO) client.post(ApiPaths.backendPath("/generation/video/create"), body);
    }

    /** Create music generation task */
    public PlusApiResultGenerateMusicVO createMusic(GenerateMusicForm body) throws Exception {
        return (PlusApiResultGenerateMusicVO) client.post(ApiPaths.backendPath("/generation/music/create"), body);
    }

    /** Get AI generation records by page */
    public PlusApiResultPagePlusAiGenerationVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiGenerationVO) client.post(ApiPaths.backendPath("/generation/list"), body, params);
    }

    /** Get all AI generation records */
    public PlusApiResultListPlusAiGenerationVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiGenerationVO) client.post(ApiPaths.backendPath("/generation/list/all"), body);
    }

    /** Create image generation task */
    public PlusApiResultGenerateImageVO createImage(GenerateImageForm body) throws Exception {
        return (PlusApiResultGenerateImageVO) client.post(ApiPaths.backendPath("/generation/image/create"), body);
    }

    /** Get AI generated content by page */
    public PlusApiResultPagePlusAiGenerationContentVO createListByPageContent(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiGenerationContentVO) client.post(ApiPaths.backendPath("/generation/content/list"), body, params);
    }

    /** Get all AI generated content */
    public PlusApiResultListPlusAiGenerationContentVO createListAllEntitiesContent(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiGenerationContentVO) client.post(ApiPaths.backendPath("/generation/content/list/all"), body);
    }

    /** Create character generation task */
    public PlusApiResultGenerateCharacterVO createCharacter(GenerateCharacterForm body) throws Exception {
        return (PlusApiResultGenerateCharacterVO) client.post(ApiPaths.backendPath("/generation/character/create"), body);
    }

    /** Create audio generation task */
    public PlusApiResultGenerateAudioVO createAudio(GenerateAudioForm body) throws Exception {
        return (PlusApiResultGenerateAudioVO) client.post(ApiPaths.backendPath("/generation/audio/create"), body);
    }

    /** Create audio effect generation task */
    public PlusApiResultGenerateAudioEffectVO createAudioEffect(GenerateAudioEffectForm body) throws Exception {
        return (PlusApiResultGenerateAudioEffectVO) client.post(ApiPaths.backendPath("/generation/audio-effect/create"), body);
    }

    /** Get an AI generation record by ID */
    public PlusApiResultPlusAiGenerationVO getById(String id) throws Exception {
        return (PlusApiResultPlusAiGenerationVO) client.get(ApiPaths.backendPath("/generation/" + id + ""));
    }

    /** Delete an AI generation record */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/generation/" + id + ""));
    }

    /** Get voice speaker generation result */
    public PlusApiResultGenerateVoiceSpeakerVO getResultByTaskId(String taskId) throws Exception {
        return (PlusApiResultGenerateVoiceSpeakerVO) client.get(ApiPaths.backendPath("/generation/voice-speaker/result/" + taskId + ""));
    }

    /** Get video generation result */
    public PlusApiResultGenerateVideoVO getResult(String taskId) throws Exception {
        return (PlusApiResultGenerateVideoVO) client.get(ApiPaths.backendPath("/generation/video/result/" + taskId + ""));
    }

    /** Get music generation result */
    public PlusApiResultGenerateMusicVO getResultMusic(String taskId) throws Exception {
        return (PlusApiResultGenerateMusicVO) client.get(ApiPaths.backendPath("/generation/music/result/" + taskId + ""));
    }

    /** Get image generation result */
    public PlusApiResultGenerateImageVO getResultImage(String taskId) throws Exception {
        return (PlusApiResultGenerateImageVO) client.get(ApiPaths.backendPath("/generation/image/result/" + taskId + ""));
    }

    /** Get AI generated content by ID */
    public PlusApiResultPlusAiGenerationContentVO getByIdContent(String id) throws Exception {
        return (PlusApiResultPlusAiGenerationContentVO) client.get(ApiPaths.backendPath("/generation/content/" + id + ""));
    }

    /** Delete AI generated content */
    public PlusApiResultBoolean deleteContent(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/generation/content/" + id + ""));
    }

    /** Get character generation result */
    public PlusApiResultGenerateCharacterVO getResultCharacter(String taskId) throws Exception {
        return (PlusApiResultGenerateCharacterVO) client.get(ApiPaths.backendPath("/generation/character/result/" + taskId + ""));
    }

    /** Get audio generation result */
    public PlusApiResultGenerateAudioVO getResultAudio(String taskId) throws Exception {
        return (PlusApiResultGenerateAudioVO) client.get(ApiPaths.backendPath("/generation/audio/result/" + taskId + ""));
    }

    /** Get audio effect generation result */
    public PlusApiResultGenerateAudioEffectVO getResultAudioEffect(String taskId) throws Exception {
        return (PlusApiResultGenerateAudioEffectVO) client.get(ApiPaths.backendPath("/generation/audio-effect/result/" + taskId + ""));
    }
}
