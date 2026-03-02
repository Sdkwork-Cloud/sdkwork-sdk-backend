package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class DatasourceApi {
    private final HttpClient client;
    
    public DatasourceApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing data source */
    public PlusApiResultPlusDatasourceVO update(PlusDatasourceForm body) throws Exception {
        return (PlusApiResultPlusDatasourceVO) client.put(ApiPaths.backendPath("/datasource"), body);
    }

    /** Create a new data source */
    public PlusApiResultPlusDatasourceVO create(PlusDatasourceForm body) throws Exception {
        return (PlusApiResultPlusDatasourceVO) client.post(ApiPaths.backendPath("/datasource"), body);
    }

    public PlusApiResultBoolean stop(Map<String, String> headers) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/datasource/stop"), null, null, headers);
    }

    /** Get data sources by page */
    public PlusApiResultPagePlusDatasourceVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusDatasourceVO) client.post(ApiPaths.backendPath("/datasource/list"), body, params);
    }

    /** Get all data sources */
    public PlusApiResultListPlusDatasourceVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusDatasourceVO) client.post(ApiPaths.backendPath("/datasource/list/all"), body);
    }

    /** Create a chat completion with Datasource */
    public ChatCompletionChunk createCompletions(ChatCompletionCreateForm body, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/datasource/chat/completions"), body, null, headers);
    }

    /** Get a data source by ID */
    public PlusApiResultPlusDatasourceVO getById(String id) throws Exception {
        return (PlusApiResultPlusDatasourceVO) client.get(ApiPaths.backendPath("/datasource/" + id + ""));
    }

    /** Delete a data source */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/datasource/" + id + ""));
    }
}
