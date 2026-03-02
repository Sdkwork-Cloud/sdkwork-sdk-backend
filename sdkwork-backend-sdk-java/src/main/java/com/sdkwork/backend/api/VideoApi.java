package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VideoApi {
    private final HttpClient client;
    
    public VideoApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing video */
    public PlusApiResultPlusVideoVO update(PlusVideoForm body) throws Exception {
        return (PlusApiResultPlusVideoVO) client.put(ApiPaths.backendPath("/video"), body);
    }

    /** Create a new video */
    public PlusApiResultPlusVideoVO create(PlusVideoForm body) throws Exception {
        return (PlusApiResultPlusVideoVO) client.post(ApiPaths.backendPath("/video"), body);
    }

    /** Get videos by page */
    public PlusApiResultPagePlusVideoVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVideoVO) client.post(ApiPaths.backendPath("/video/list"), body, params);
    }

    /** Get all videos */
    public PlusApiResultListPlusVideoVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVideoVO) client.post(ApiPaths.backendPath("/video/list/all"), body);
    }

    /** Get a video by ID */
    public PlusApiResultPlusVideoVO getById(String id) throws Exception {
        return (PlusApiResultPlusVideoVO) client.get(ApiPaths.backendPath("/video/" + id + ""));
    }

    /** Delete a video */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/video/" + id + ""));
    }
}
