package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class CommentApi {
    private final HttpClient client;
    
    public CommentApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing comment */
    public PlusApiResultPlusCommentsVO update(PlusCommentsForm body) throws Exception {
        return (PlusApiResultPlusCommentsVO) client.put(ApiPaths.backendPath("/comments"), body);
    }

    /** Create a new comment */
    public PlusApiResultPlusCommentsVO create(PlusCommentsForm body) throws Exception {
        return (PlusApiResultPlusCommentsVO) client.post(ApiPaths.backendPath("/comments"), body);
    }

    /** Unlike a comment */
    public PlusApiResultPlusCommentsVO unlike(String id) throws Exception {
        return (PlusApiResultPlusCommentsVO) client.post(ApiPaths.backendPath("/comments/" + id + "/unlike"), null);
    }

    /** Reply to a comment */
    public PlusApiResultPlusCommentsVO reply(String id, PlusCommentsReplyForm body) throws Exception {
        return (PlusApiResultPlusCommentsVO) client.post(ApiPaths.backendPath("/comments/" + id + "/reply"), body);
    }

    /** Like a comment */
    public PlusApiResultPlusCommentsVO like(String id) throws Exception {
        return (PlusApiResultPlusCommentsVO) client.post(ApiPaths.backendPath("/comments/" + id + "/like"), null);
    }

    /** Get comments by page */
    public PlusApiResultPagePlusCommentsVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusCommentsVO) client.post(ApiPaths.backendPath("/comments/list"), body, params);
    }

    /** Get all comments */
    public PlusApiResultListPlusCommentsVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusCommentsVO) client.post(ApiPaths.backendPath("/comments/list/all"), body);
    }

    /** Get a comment by ID */
    public PlusApiResultPlusCommentsVO getById(String id) throws Exception {
        return (PlusApiResultPlusCommentsVO) client.get(ApiPaths.backendPath("/comments/" + id + ""));
    }

    /** Delete a comment */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/comments/" + id + ""));
    }
}
