package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AiImageGenerationApi {
    private final HttpClient client;
    
    public AiImageGenerationApi(HttpClient client) {
        this.client = client;
    }

    /** Create image generation task */
    public PlusApiResultGenerateImageVO create(GenerateImageForm body) throws Exception {
        return (PlusApiResultGenerateImageVO) client.post(ApiPaths.backendPath("/generation/image/create"), body);
    }

    /** Get image generation result */
    public PlusApiResultGenerateImageVO getResult(String taskId) throws Exception {
        return (PlusApiResultGenerateImageVO) client.get(ApiPaths.backendPath("/generation/image/result/" + taskId + ""));
    }
}
