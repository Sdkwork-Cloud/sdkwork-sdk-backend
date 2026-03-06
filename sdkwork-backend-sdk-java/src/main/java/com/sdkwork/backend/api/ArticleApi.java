package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ArticleApi {
    private final HttpClient client;
    
    public ArticleApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing AI article */
    public PlusApiResultPlusArticleVO update(PlusArticleForm body) throws Exception {
        return (PlusApiResultPlusArticleVO) client.put(ApiPaths.backendPath("/article"), body);
    }

    /** Create a new AI article */
    public PlusApiResultPlusArticleVO create(PlusArticleForm body) throws Exception {
        return (PlusApiResultPlusArticleVO) client.post(ApiPaths.backendPath("/article"), body);
    }

    /** Get AI articles by page */
    public PlusApiResultPagePlusArticleVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusArticleVO) client.post(ApiPaths.backendPath("/article/list"), body, params);
    }

    /** Get all AI articles */
    public PlusApiResultListPlusArticleVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusArticleVO) client.post(ApiPaths.backendPath("/article/list/all"), body);
    }

    /** Get an AI article by ID */
    public PlusApiResultPlusArticleVO getById(String id) throws Exception {
        return (PlusApiResultPlusArticleVO) client.get(ApiPaths.backendPath("/article/" + id + ""));
    }

    /** Delete an AI article */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/article/" + id + ""));
    }
}
