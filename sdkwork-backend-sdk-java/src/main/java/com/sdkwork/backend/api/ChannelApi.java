package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ChannelApi {
    private final HttpClient client;
    
    public ChannelApi(HttpClient client) {
        this.client = client;
    }

    /** Update channel */
    public PlusApiResultPlusChannelVO update(PlusChannelForm body) throws Exception {
        return (PlusApiResultPlusChannelVO) client.put(ApiPaths.backendPath("/channel"), body);
    }

    /** Create channel */
    public PlusApiResultPlusChannelVO create(PlusChannelForm body) throws Exception {
        return (PlusApiResultPlusChannelVO) client.post(ApiPaths.backendPath("/channel"), body);
    }

    /** List channels by page */
    public PlusApiResultPagePlusChannelVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusChannelVO) client.post(ApiPaths.backendPath("/channel/list"), body, params);
    }

    /** List all channels */
    public PlusApiResultListPlusChannelVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusChannelVO) client.post(ApiPaths.backendPath("/channel/list/all"), body);
    }

    /** Get channel by ID */
    public PlusApiResultPlusChannelVO getById(String id) throws Exception {
        return (PlusApiResultPlusChannelVO) client.get(ApiPaths.backendPath("/channel/" + id + ""));
    }

    /** Delete channel */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/channel/" + id + ""));
    }
}
