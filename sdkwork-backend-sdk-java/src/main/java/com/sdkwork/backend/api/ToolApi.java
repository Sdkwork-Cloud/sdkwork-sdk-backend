package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ToolApi {
    private final HttpClient client;
    
    public ToolApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing AI tool */
    public PlusApiResultPlusAiToolVO update(PlusAiToolForm body) throws Exception {
        return (PlusApiResultPlusAiToolVO) client.put(ApiPaths.backendPath("/tool"), body);
    }

    /** Create a new AI tool */
    public PlusApiResultPlusAiToolVO create(PlusAiToolForm body) throws Exception {
        return (PlusApiResultPlusAiToolVO) client.post(ApiPaths.backendPath("/tool"), body);
    }

    /** Get AI tools by page */
    public PlusApiResultPagePlusAiToolVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAiToolVO) client.post(ApiPaths.backendPath("/tool/list"), body, params);
    }

    /** Get all AI tools */
    public PlusApiResultListPlusAiToolVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAiToolVO) client.post(ApiPaths.backendPath("/tool/list/all"), body);
    }

    /** Get an AI tool by ID */
    public PlusApiResultPlusAiToolVO getById(String id) throws Exception {
        return (PlusApiResultPlusAiToolVO) client.get(ApiPaths.backendPath("/tool/" + id + ""));
    }

    /** Delete an AI tool */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/tool/" + id + ""));
    }
}
