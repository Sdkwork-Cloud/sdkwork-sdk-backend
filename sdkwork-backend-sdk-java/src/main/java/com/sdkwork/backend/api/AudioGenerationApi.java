package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AudioGenerationApi {
    private final HttpClient client;
    
    public AudioGenerationApi(HttpClient client) {
        this.client = client;
    }

    /** Create audio generation task */
    public PlusApiResultGenerateAudioVO create(GenerateAudioForm body) throws Exception {
        return (PlusApiResultGenerateAudioVO) client.post(ApiPaths.backendPath("/generation/audio/create"), body);
    }

    /** Get audio generation result */
    public PlusApiResultGenerateAudioVO getResult(String taskId) throws Exception {
        return (PlusApiResultGenerateAudioVO) client.get(ApiPaths.backendPath("/generation/audio/result/" + taskId + ""));
    }
}
