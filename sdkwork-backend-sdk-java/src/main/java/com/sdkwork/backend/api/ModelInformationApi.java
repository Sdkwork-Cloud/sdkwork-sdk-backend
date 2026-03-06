package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ModelInformationApi {
    private final HttpClient client;
    
    public ModelInformationApi(HttpClient client) {
        this.client = client;
    }

    /** Update existing AI model information */
    public PlusApiResultPlusAiModelInfoVO update(PlusAiModelInfoForm body) throws Exception {
        return (PlusApiResultPlusAiModelInfoVO) client.put(ApiPaths.backendPath("/model"), body);
    }

    /** Create a new AI model information */
    public PlusApiResultPlusAiModelInfoVO create(PlusAiModelInfoForm body) throws Exception {
        return (PlusApiResultPlusAiModelInfoVO) client.post(ApiPaths.backendPath("/model"), body);
    }

    /** Get AI model information by page */
    public PlusApiResultPagePlusAiModelInfoVO listByPage(PlusAiModelInfoQueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiModelInfoVO) client.post(ApiPaths.backendPath("/model/list"), body, params);
    }

    /** Get all AI model information */
    public PlusApiResultListPlusAiModelInfoVO listAllEntities(PlusAiModelInfoQueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiModelInfoVO) client.post(ApiPaths.backendPath("/model/list/all"), body);
    }

    /** Get AI model information by ID */
    public PlusApiResultPlusAiModelInfoVO getById(String id) throws Exception {
        return (PlusApiResultPlusAiModelInfoVO) client.get(ApiPaths.backendPath("/model/" + id + ""));
    }

    /** Delete AI model information */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/model/" + id + ""));
    }
}
