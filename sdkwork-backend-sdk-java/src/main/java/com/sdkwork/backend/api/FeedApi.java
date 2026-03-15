package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class FeedApi {
    private final HttpClient client;
    
    public FeedApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing feeds entry */
    public PlusApiResultPlusFeedsVO update(PlusFeedsForm body) throws Exception {
        return (PlusApiResultPlusFeedsVO) client.put(ApiPaths.backendPath("/feeds"), body);
    }

    /** Create a new feeds entry */
    public PlusApiResultPlusFeedsVO create(PlusFeedsForm body) throws Exception {
        return (PlusApiResultPlusFeedsVO) client.post(ApiPaths.backendPath("/feeds"), body);
    }

    /** Get feeds entries by page */
    public PlusApiResultPagePlusFeedsVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusFeedsVO) client.post(ApiPaths.backendPath("/feeds/list"), body, params);
    }

    /** Get all feeds entries */
    public PlusApiResultListPlusFeedsVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusFeedsVO) client.post(ApiPaths.backendPath("/feeds/list/all"), body);
    }

    /** Get a feeds entry by ID */
    public PlusApiResultPlusFeedsVO getById(String id) throws Exception {
        return (PlusApiResultPlusFeedsVO) client.get(ApiPaths.backendPath("/feeds/" + id + ""));
    }

    /** Delete a feeds entry */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/feeds/" + id + ""));
    }
}
