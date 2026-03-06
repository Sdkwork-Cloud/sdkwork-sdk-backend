package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class CharacterGenerationApi {
    private final HttpClient client;
    
    public CharacterGenerationApi(HttpClient client) {
        this.client = client;
    }

    /** Create character generation task */
    public PlusApiResultGenerateCharacterVO create(GenerateCharacterForm body) throws Exception {
        return (PlusApiResultGenerateCharacterVO) client.post(ApiPaths.backendPath("/generation/character/create"), body);
    }

    /** Get character generation result */
    public PlusApiResultGenerateCharacterVO getResult(String taskId) throws Exception {
        return (PlusApiResultGenerateCharacterVO) client.get(ApiPaths.backendPath("/generation/character/result/" + taskId + ""));
    }
}
