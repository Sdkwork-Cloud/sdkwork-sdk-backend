package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ChannelProxyApi {
    private final HttpClient client;
    
    public ChannelProxyApi(HttpClient client) {
        this.client = client;
    }

    /** Update channel proxy */
    public PlusApiResultPlusChannelProxyVO update(PlusChannelProxyForm body) throws Exception {
        return (PlusApiResultPlusChannelProxyVO) client.put(ApiPaths.backendPath("/channel/proxy"), body);
    }

    /** Create channel proxy */
    public PlusApiResultPlusChannelProxyVO create(PlusChannelProxyForm body) throws Exception {
        return (PlusApiResultPlusChannelProxyVO) client.post(ApiPaths.backendPath("/channel/proxy"), body);
    }

    /** List channel proxies by page */
    public PlusApiResultPagePlusChannelProxyVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusChannelProxyVO) client.post(ApiPaths.backendPath("/channel/proxy/list"), body, params);
    }

    /** List all channel proxies */
    public PlusApiResultListPlusChannelProxyVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusChannelProxyVO) client.post(ApiPaths.backendPath("/channel/proxy/list/all"), body);
    }

    /** Get channel proxy by ID */
    public PlusApiResultPlusChannelProxyVO getById(String id) throws Exception {
        return (PlusApiResultPlusChannelProxyVO) client.get(ApiPaths.backendPath("/channel/proxy/" + id + ""));
    }

    /** Delete channel proxy */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/channel/proxy/" + id + ""));
    }
}
