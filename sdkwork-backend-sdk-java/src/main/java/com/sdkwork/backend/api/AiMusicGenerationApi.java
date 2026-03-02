package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AiMusicGenerationApi {
    private final HttpClient client;
    
    public AiMusicGenerationApi(HttpClient client) {
        this.client = client;
    }

    /** Create music generation task */
    public PlusApiResultGenerateMusicVO create(GenerateMusicForm body) throws Exception {
        return (PlusApiResultGenerateMusicVO) client.post(ApiPaths.backendPath("/generation/music/create"), body);
    }

    /** Get music generation result */
    public PlusApiResultGenerateMusicVO getResult(String taskId) throws Exception {
        return (PlusApiResultGenerateMusicVO) client.get(ApiPaths.backendPath("/generation/music/result/" + taskId + ""));
    }
}
