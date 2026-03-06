package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ModelPriceApi {
    private final HttpClient client;
    
    public ModelPriceApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing AI model price */
    public PlusApiResultPlusAiModelPriceVO update(PlusAiModelPriceForm body) throws Exception {
        return (PlusApiResultPlusAiModelPriceVO) client.put(ApiPaths.backendPath("/model/price"), body);
    }

    /** Create a new AI model price */
    public PlusApiResultPlusAiModelPriceVO create(PlusAiModelPriceForm body) throws Exception {
        return (PlusApiResultPlusAiModelPriceVO) client.post(ApiPaths.backendPath("/model/price"), body);
    }

    /** Get AI model prices by page */
    public PlusApiResultPagePlusAiModelPriceVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiModelPriceVO) client.post(ApiPaths.backendPath("/model/price/list"), body, params);
    }

    /** Get all AI model prices */
    public PlusApiResultListPlusAiModelPriceVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiModelPriceVO) client.post(ApiPaths.backendPath("/model/price/list/all"), body);
    }

    /** Get an AI model price by ID */
    public PlusApiResultPlusAiModelPriceVO getById(String id) throws Exception {
        return (PlusApiResultPlusAiModelPriceVO) client.get(ApiPaths.backendPath("/model/price/" + id + ""));
    }

    /** Delete an AI model price */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/model/price/" + id + ""));
    }
}
