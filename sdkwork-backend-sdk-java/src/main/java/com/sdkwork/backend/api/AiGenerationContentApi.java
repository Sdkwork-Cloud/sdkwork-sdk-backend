package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AiGenerationContentApi {
    private final HttpClient client;
    
    public AiGenerationContentApi(HttpClient client) {
        this.client = client;
    }

    /** Update AI generated content */
    public PlusApiResultPlusAiGenerationContentVO update(PlusAiGenerationContentForm body) throws Exception {
        return (PlusApiResultPlusAiGenerationContentVO) client.put(ApiPaths.backendPath("/generation/content"), body);
    }

    /** Create new AI generated content */
    public PlusApiResultPlusAiGenerationContentVO create(PlusAiGenerationContentForm body) throws Exception {
        return (PlusApiResultPlusAiGenerationContentVO) client.post(ApiPaths.backendPath("/generation/content"), body);
    }

    /** Get AI generated content by page */
    public PlusApiResultPagePlusAiGenerationContentVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiGenerationContentVO) client.post(ApiPaths.backendPath("/generation/content/list"), body, params);
    }

    /** Get all AI generated content */
    public PlusApiResultListPlusAiGenerationContentVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiGenerationContentVO) client.post(ApiPaths.backendPath("/generation/content/list/all"), body);
    }

    /** Get AI generated content by ID */
    public PlusApiResultPlusAiGenerationContentVO getById(String id) throws Exception {
        return (PlusApiResultPlusAiGenerationContentVO) client.get(ApiPaths.backendPath("/generation/content/" + id + ""));
    }

    /** Delete AI generated content */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/generation/content/" + id + ""));
    }
}
