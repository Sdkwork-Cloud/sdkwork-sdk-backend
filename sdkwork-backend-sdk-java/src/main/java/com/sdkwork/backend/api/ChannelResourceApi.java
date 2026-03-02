package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ChannelResourceApi {
    private final HttpClient client;
    
    public ChannelResourceApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing channel resource */
    public PlusApiResultPlusChannelResourceVO update(PlusChannelResourceForm body) throws Exception {
        return (PlusApiResultPlusChannelResourceVO) client.put(ApiPaths.backendPath("/channel/resource"), body);
    }

    /** Create a new channel resource */
    public PlusApiResultPlusChannelResourceVO create(PlusChannelResourceForm body) throws Exception {
        return (PlusApiResultPlusChannelResourceVO) client.post(ApiPaths.backendPath("/channel/resource"), body);
    }

    /** Get channel resources by page */
    public PlusApiResultPagePlusChannelResourceVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusChannelResourceVO) client.post(ApiPaths.backendPath("/channel/resource/list"), body, params);
    }

    /** Get all channel resources */
    public PlusApiResultListPlusChannelResourceVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusChannelResourceVO) client.post(ApiPaths.backendPath("/channel/resource/list/all"), body);
    }

    /** Get a channel resource by ID */
    public PlusApiResultPlusChannelResourceVO getById(String id) throws Exception {
        return (PlusApiResultPlusChannelResourceVO) client.get(ApiPaths.backendPath("/channel/resource/" + id + ""));
    }

    /** Delete a channel resource */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/channel/resource/" + id + ""));
    }
}
