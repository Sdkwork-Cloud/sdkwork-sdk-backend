package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class DetailApi {
    private final HttpClient client;
    
    public DetailApi(HttpClient client) {
        this.client = client;
    }

    /** Update existing detail content */
    public PlusApiResultPlusDetailVO update(PlusDetailForm body) throws Exception {
        return (PlusApiResultPlusDetailVO) client.put(ApiPaths.backendPath("/detail"), body);
    }

    /** Create new detail content */
    public PlusApiResultPlusDetailVO create(PlusDetailForm body) throws Exception {
        return (PlusApiResultPlusDetailVO) client.post(ApiPaths.backendPath("/detail"), body);
    }

    /** Get detail contents by page */
    public PlusApiResultPagePlusDetailVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusDetailVO) client.post(ApiPaths.backendPath("/detail/list"), body, params);
    }

    /** Get all detail contents */
    public PlusApiResultListPlusDetailVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusDetailVO) client.post(ApiPaths.backendPath("/detail/list/all"), body);
    }

    /** Get detail content by ID */
    public PlusApiResultPlusDetailVO getById(String id) throws Exception {
        return (PlusApiResultPlusDetailVO) client.get(ApiPaths.backendPath("/detail/" + id + ""));
    }

    /** Delete detail content */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/detail/" + id + ""));
    }
}
