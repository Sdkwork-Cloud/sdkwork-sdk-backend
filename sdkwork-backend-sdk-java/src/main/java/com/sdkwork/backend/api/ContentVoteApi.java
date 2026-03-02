package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ContentVoteApi {
    private final HttpClient client;
    
    public ContentVoteApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing content vote */
    public PlusApiResultContentVoteVO update(ContentVoteForm body) throws Exception {
        return (PlusApiResultContentVoteVO) client.put(ApiPaths.backendPath("/vote"), body);
    }

    /** Create a new content vote */
    public PlusApiResultContentVoteVO create(ContentVoteForm body) throws Exception {
        return (PlusApiResultContentVoteVO) client.post(ApiPaths.backendPath("/vote"), body);
    }

    /** Get content votes by page */
    public PlusApiResultPageContentVoteVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageContentVoteVO) client.post(ApiPaths.backendPath("/vote/list"), body, params);
    }

    /** Get all content votes */
    public PlusApiResultListContentVoteVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListContentVoteVO) client.post(ApiPaths.backendPath("/vote/list/all"), body);
    }

    /** Get a content vote by ID */
    public PlusApiResultContentVoteVO getById(String id) throws Exception {
        return (PlusApiResultContentVoteVO) client.get(ApiPaths.backendPath("/vote/" + id + ""));
    }

    /** Delete a content vote */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vote/" + id + ""));
    }
}
