package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AiGenerationApi {
    private final HttpClient client;
    
    public AiGenerationApi(HttpClient client) {
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

    /** Get AI generation records by page */
    public PlusApiResultPagePlusAiGenerationVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiGenerationVO) client.post(ApiPaths.backendPath("/generation/list"), body, params);
    }

    /** Get all AI generation records */
    public PlusApiResultListPlusAiGenerationVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiGenerationVO) client.post(ApiPaths.backendPath("/generation/list/all"), body);
    }

    /** Get an AI generation record by ID */
    public PlusApiResultPlusAiGenerationVO getById(String id) throws Exception {
        return (PlusApiResultPlusAiGenerationVO) client.get(ApiPaths.backendPath("/generation/" + id + ""));
    }

    /** Delete an AI generation record */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/generation/" + id + ""));
    }
}
