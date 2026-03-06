package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ApiKeyApi {
    private final HttpClient client;
    
    public ApiKeyApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing API key */
    public PlusApiResultPlusApiKeyVO update(PlusApiKeyForm body) throws Exception {
        return (PlusApiResultPlusApiKeyVO) client.put(ApiPaths.backendPath("/apikey"), body);
    }

    /** Create a new API key */
    public PlusApiResultPlusApiKeyVO create(PlusApiKeyForm body) throws Exception {
        return (PlusApiResultPlusApiKeyVO) client.post(ApiPaths.backendPath("/apikey"), body);
    }

    /** Get API key detail for current user */
    public PlusApiResultPlusApiKeyVO getMy(String id) throws Exception {
        return (PlusApiResultPlusApiKeyVO) client.get(ApiPaths.backendPath("/apikey/my/" + id + ""));
    }

    /** Update API key for current user */
    public PlusApiResultPlusApiKeyVO updateMy(String id, PlusApiKeySelfUpdateForm body) throws Exception {
        return (PlusApiResultPlusApiKeyVO) client.put(ApiPaths.backendPath("/apikey/my/" + id + ""), body);
    }

    /** Delete API key for current user */
    public PlusApiResultBoolean deleteMy(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/apikey/my/" + id + ""));
    }

    /** Create API key for current user */
    public PlusApiResultPlusApiKeyVO createMy(PlusApiKeySelfCreateForm body) throws Exception {
        return (PlusApiResultPlusApiKeyVO) client.post(ApiPaths.backendPath("/apikey/my"), body);
    }

    /** Rotate API key for current user */
    public PlusApiResultPlusApiKeyVO rotateMy(String id) throws Exception {
        return (PlusApiResultPlusApiKeyVO) client.post(ApiPaths.backendPath("/apikey/my/" + id + "/rotate"), null);
    }

    /** Enable API key for current user */
    public PlusApiResultPlusApiKeyVO enableMy(String id) throws Exception {
        return (PlusApiResultPlusApiKeyVO) client.post(ApiPaths.backendPath("/apikey/my/" + id + "/enable"), null);
    }

    /** Disable API key for current user */
    public PlusApiResultPlusApiKeyVO disableMy(String id) throws Exception {
        return (PlusApiResultPlusApiKeyVO) client.post(ApiPaths.backendPath("/apikey/my/" + id + "/disable"), null);
    }

    /** Get API keys by page */
    public PlusApiResultPagePlusApiKeyVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusApiKeyVO) client.post(ApiPaths.backendPath("/apikey/list"), body, params);
    }

    /** Get all API keys */
    public PlusApiResultListPlusApiKeyVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusApiKeyVO) client.post(ApiPaths.backendPath("/apikey/list/all"), body);
    }

    /** Get an API key by ID */
    public PlusApiResultPlusApiKeyVO getById(String id) throws Exception {
        return (PlusApiResultPlusApiKeyVO) client.get(ApiPaths.backendPath("/apikey/" + id + ""));
    }

    /** Delete an API key */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/apikey/" + id + ""));
    }

    /** List API keys for current user */
    public PlusApiResultListPlusApiKeyVO listMyApiKeys() throws Exception {
        return (PlusApiResultListPlusApiKeyVO) client.get(ApiPaths.backendPath("/apikey/my/list"));
    }
}
