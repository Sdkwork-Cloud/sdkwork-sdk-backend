package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ShardingKeyApi {
    private final HttpClient client;
    
    public ShardingKeyApi(HttpClient client) {
        this.client = client;
    }

    /** Update Sharding Key */
    public PlusApiResultPlusShardingKeyVO update(PlusShardingKeyForm body) throws Exception {
        return (PlusApiResultPlusShardingKeyVO) client.put(ApiPaths.backendPath("/sharding/key"), body);
    }

    /** Create Sharding Key */
    public PlusApiResultPlusShardingKeyVO create(PlusShardingKeyForm body) throws Exception {
        return (PlusApiResultPlusShardingKeyVO) client.post(ApiPaths.backendPath("/sharding/key"), body);
    }

    /** List Sharding Keys by Page */
    public PlusApiResultPagePlusShardingKeyVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusShardingKeyVO) client.post(ApiPaths.backendPath("/sharding/key/list"), body, params);
    }

    /** List All Sharding Keys */
    public PlusApiResultListPlusShardingKeyVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusShardingKeyVO) client.post(ApiPaths.backendPath("/sharding/key/list/all"), body);
    }

    /** Get Sharding Key by ID */
    public PlusApiResultPlusShardingKeyVO getById(String id) throws Exception {
        return (PlusApiResultPlusShardingKeyVO) client.get(ApiPaths.backendPath("/sharding/key/" + id + ""));
    }

    /** Delete Sharding Key */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/sharding/key/" + id + ""));
    }
}
