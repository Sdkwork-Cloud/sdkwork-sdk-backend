package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class FeedbackApi {
    private final HttpClient client;
    
    public FeedbackApi(HttpClient client) {
        this.client = client;
    }

    /** Update feedback */
    public PlusApiResultPlusFeedbackVO update(PlusFeedbackForm body) throws Exception {
        return (PlusApiResultPlusFeedbackVO) client.put(ApiPaths.backendPath("/feedback"), body);
    }

    /** Create new feedback */
    public PlusApiResultPlusFeedbackVO create(PlusFeedbackForm body) throws Exception {
        return (PlusApiResultPlusFeedbackVO) client.post(ApiPaths.backendPath("/feedback"), body);
    }

    /** Get feedback by page */
    public PlusApiResultPagePlusFeedbackVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusFeedbackVO) client.post(ApiPaths.backendPath("/feedback/list"), body, params);
    }

    /** Get all feedback records */
    public PlusApiResultListPlusFeedbackVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusFeedbackVO) client.post(ApiPaths.backendPath("/feedback/list/all"), body);
    }

    /** Get feedback by ID */
    public PlusApiResultPlusFeedbackVO getById(String id) throws Exception {
        return (PlusApiResultPlusFeedbackVO) client.get(ApiPaths.backendPath("/feedback/" + id + ""));
    }

    /** Delete feedback */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/feedback/" + id + ""));
    }
}
