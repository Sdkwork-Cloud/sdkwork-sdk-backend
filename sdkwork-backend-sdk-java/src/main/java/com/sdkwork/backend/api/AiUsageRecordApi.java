package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AiUsageRecordApi {
    private final HttpClient client;
    
    public AiUsageRecordApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing usage record */
    public PlusApiResultUsageRecordVO update(UsageRecordForm body) throws Exception {
        return (PlusApiResultUsageRecordVO) client.put(ApiPaths.backendPath("/usage/record"), body);
    }

    /** Create a new usage record */
    public PlusApiResultUsageRecordVO create(UsageRecordForm body) throws Exception {
        return (PlusApiResultUsageRecordVO) client.post(ApiPaths.backendPath("/usage/record"), body);
    }

    /** Get usage records by page */
    public PlusApiResultPageUsageRecordVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageUsageRecordVO) client.post(ApiPaths.backendPath("/usage/record/list"), body, params);
    }

    /** Get all usage records */
    public PlusApiResultListUsageRecordVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListUsageRecordVO) client.post(ApiPaths.backendPath("/usage/record/list/all"), body);
    }

    /** Get a usage record by ID */
    public PlusApiResultUsageRecordVO getById(String id) throws Exception {
        return (PlusApiResultUsageRecordVO) client.get(ApiPaths.backendPath("/usage/record/" + id + ""));
    }

    /** Delete a usage record */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/usage/record/" + id + ""));
    }
}
