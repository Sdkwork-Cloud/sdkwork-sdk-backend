package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AiVideoGenerationApi {
    private final HttpClient client;
    
    public AiVideoGenerationApi(HttpClient client) {
        this.client = client;
    }

    /** Create video generation task */
    public PlusApiResultGenerateVideoVO create(GenerateVideoForm body) throws Exception {
        return (PlusApiResultGenerateVideoVO) client.post(ApiPaths.backendPath("/generation/video/create"), body);
    }

    /** Get video generation result */
    public PlusApiResultGenerateVideoVO getResult(String taskId) throws Exception {
        return (PlusApiResultGenerateVideoVO) client.get(ApiPaths.backendPath("/generation/video/result/" + taskId + ""));
    }
}
