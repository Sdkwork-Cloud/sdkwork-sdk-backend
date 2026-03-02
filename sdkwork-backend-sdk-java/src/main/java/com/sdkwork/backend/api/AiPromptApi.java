package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AiPromptApi {
    private final HttpClient client;
    
    public AiPromptApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing AI prompt */
    public PlusApiResultPlusAiPromptVO update(PlusAiPromptForm body) throws Exception {
        return (PlusApiResultPlusAiPromptVO) client.put(ApiPaths.backendPath("/prompt"), body);
    }

    /** Create a new AI prompt */
    public PlusApiResultPlusAiPromptVO create(PlusAiPromptForm body) throws Exception {
        return (PlusApiResultPlusAiPromptVO) client.post(ApiPaths.backendPath("/prompt"), body);
    }

    /** Get AI prompts by page */
    public PlusApiResultPagePlusAiPromptVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiPromptVO) client.post(ApiPaths.backendPath("/prompt/list"), body, params);
    }

    /** Get all AI prompts */
    public PlusApiResultListPlusAiPromptVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiPromptVO) client.post(ApiPaths.backendPath("/prompt/list/all"), body);
    }

    /** Get an AI prompt by ID */
    public PlusApiResultPlusAiPromptVO getById(String id) throws Exception {
        return (PlusApiResultPlusAiPromptVO) client.get(ApiPaths.backendPath("/prompt/" + id + ""));
    }

    /** Delete an AI prompt */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/prompt/" + id + ""));
    }
}
