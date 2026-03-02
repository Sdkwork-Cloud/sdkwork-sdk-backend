package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AiVoiceSpeakerGenerationApi {
    private final HttpClient client;
    
    public AiVoiceSpeakerGenerationApi(HttpClient client) {
        this.client = client;
    }

    /** Create voice speaker generation task */
    public PlusApiResultGenerateVoiceSpeakerVO create(GenerateVoiceSpeakerForm body) throws Exception {
        return (PlusApiResultGenerateVoiceSpeakerVO) client.post(ApiPaths.backendPath("/generation/voice-speaker/create"), body);
    }

    /** Get voice speaker generation result */
    public PlusApiResultGenerateVoiceSpeakerVO getResultByTaskId(String taskId) throws Exception {
        return (PlusApiResultGenerateVoiceSpeakerVO) client.get(ApiPaths.backendPath("/generation/voice-speaker/result/" + taskId + ""));
    }
}
