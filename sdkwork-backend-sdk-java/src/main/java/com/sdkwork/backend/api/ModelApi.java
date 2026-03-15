package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ModelApi {
    private final HttpClient client;
    
    public ModelApi(HttpClient client) {
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

    /** Update an existing AI model price */
    public PlusApiResultPlusAiModelPriceVO updatePrice(PlusAiModelPriceForm body) throws Exception {
        return (PlusApiResultPlusAiModelPriceVO) client.put(ApiPaths.backendPath("/model/price"), body);
    }

    /** Create a new AI model price */
    public PlusApiResultPlusAiModelPriceVO createPrice(PlusAiModelPriceForm body) throws Exception {
        return (PlusApiResultPlusAiModelPriceVO) client.post(ApiPaths.backendPath("/model/price"), body);
    }

    /** Get AI model prices by page */
    public PlusApiResultPagePlusAiModelPriceVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiModelPriceVO) client.post(ApiPaths.backendPath("/model/price/list"), body, params);
    }

    /** Get all AI model prices */
    public PlusApiResultListPlusAiModelPriceVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiModelPriceVO) client.post(ApiPaths.backendPath("/model/price/list/all"), body);
    }

    /** Get AI model information by page */
    public PlusApiResultPagePlusAiModelInfoVO createListByPageModel(PlusAiModelInfoQueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiModelInfoVO) client.post(ApiPaths.backendPath("/model/list"), body, params);
    }

    /** Get all AI model information */
    public PlusApiResultListPlusAiModelInfoVO createListAllEntitiesModel(PlusAiModelInfoQueryListForm body) throws Exception {
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

    /** Get an AI model price by ID */
    public PlusApiResultPlusAiModelPriceVO getByIdPrice(String id) throws Exception {
        return (PlusApiResultPlusAiModelPriceVO) client.get(ApiPaths.backendPath("/model/price/" + id + ""));
    }

    /** Delete an AI model price */
    public PlusApiResultBoolean deletePrice(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/model/price/" + id + ""));
    }
}
