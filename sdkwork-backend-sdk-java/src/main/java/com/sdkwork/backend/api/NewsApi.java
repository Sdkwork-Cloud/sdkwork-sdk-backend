package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class NewsApi {
    private final HttpClient client;
    
    public NewsApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing news */
    public PlusApiResultPlusNewsVO update(PlusNewsForm body) throws Exception {
        return (PlusApiResultPlusNewsVO) client.put(ApiPaths.backendPath("/news"), body);
    }

    /** Create a new news */
    public PlusApiResultPlusNewsVO create(PlusNewsForm body) throws Exception {
        return (PlusApiResultPlusNewsVO) client.post(ApiPaths.backendPath("/news"), body);
    }

    /** Get news by page */
    public PlusApiResultPagePlusNewsVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusNewsVO) client.post(ApiPaths.backendPath("/news/list"), body, params);
    }

    /** Get all news */
    public PlusApiResultListPlusNewsVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusNewsVO) client.post(ApiPaths.backendPath("/news/list/all"), body);
    }

    /** Get a news by ID */
    public PlusApiResultPlusNewsVO getById(String id) throws Exception {
        return (PlusApiResultPlusNewsVO) client.get(ApiPaths.backendPath("/news/" + id + ""));
    }

    /** Delete a news */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/news/" + id + ""));
    }
}
