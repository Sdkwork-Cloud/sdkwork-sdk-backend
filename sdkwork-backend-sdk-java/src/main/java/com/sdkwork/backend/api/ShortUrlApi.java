package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ShortUrlApi {
    private final HttpClient client;
    
    public ShortUrlApi(HttpClient client) {
        this.client = client;
    }

    /** Update short URL */
    public PlusApiResultShortUrlVO update(ShortUrlForm body) throws Exception {
        return (PlusApiResultShortUrlVO) client.put(ApiPaths.backendPath("/short_url"), body);
    }

    /** Create short URL */
    public PlusApiResultShortUrlVO create(ShortUrlForm body) throws Exception {
        return (PlusApiResultShortUrlVO) client.post(ApiPaths.backendPath("/short_url"), body);
    }

    /** Get short URLs by page */
    public PlusApiResultPageShortUrlVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageShortUrlVO) client.post(ApiPaths.backendPath("/short_url/list"), body, params);
    }

    /** Get all short URLs */
    public PlusApiResultListShortUrlVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListShortUrlVO) client.post(ApiPaths.backendPath("/short_url/list/all"), body);
    }

    /** Get short URL details */
    public PlusApiResultShortUrlVO getById(String id) throws Exception {
        return (PlusApiResultShortUrlVO) client.get(ApiPaths.backendPath("/short_url/" + id + ""));
    }

    /** Delete short URL */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/short_url/" + id + ""));
    }
}
