package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AudioEffectGenerationApi {
    private final HttpClient client;
    
    public AudioEffectGenerationApi(HttpClient client) {
        this.client = client;
    }

    /** Create audio effect generation task */
    public PlusApiResultGenerateAudioEffectVO create(GenerateAudioEffectForm body) throws Exception {
        return (PlusApiResultGenerateAudioEffectVO) client.post(ApiPaths.backendPath("/generation/audio-effect/create"), body);
    }

    /** Get audio effect generation result */
    public PlusApiResultGenerateAudioEffectVO getResult(String taskId) throws Exception {
        return (PlusApiResultGenerateAudioEffectVO) client.get(ApiPaths.backendPath("/generation/audio-effect/result/" + taskId + ""));
    }
}
