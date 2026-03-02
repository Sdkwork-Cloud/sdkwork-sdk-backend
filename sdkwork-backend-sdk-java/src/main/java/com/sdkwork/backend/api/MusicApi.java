package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class MusicApi {
    private final HttpClient client;
    
    public MusicApi(HttpClient client) {
        this.client = client;
    }

    /** Update music */
    public PlusApiResultPlusMusicVO update(PlusMusicForm body) throws Exception {
        return (PlusApiResultPlusMusicVO) client.put(ApiPaths.backendPath("/music"), body);
    }

    /** Create new music */
    public PlusApiResultPlusMusicVO create(PlusMusicForm body) throws Exception {
        return (PlusApiResultPlusMusicVO) client.post(ApiPaths.backendPath("/music"), body);
    }

    /** Get music records by page */
    public PlusApiResultPagePlusMusicVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusMusicVO) client.post(ApiPaths.backendPath("/music/list"), body, params);
    }

    /** Get all music records */
    public PlusApiResultListPlusMusicVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusMusicVO) client.post(ApiPaths.backendPath("/music/list/all"), body);
    }

    /** Get music by ID */
    public PlusApiResultPlusMusicVO getById(String id) throws Exception {
        return (PlusApiResultPlusMusicVO) client.get(ApiPaths.backendPath("/music/" + id + ""));
    }

    /** Delete music */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/music/" + id + ""));
    }
}
