package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class OssBucketApi {
    private final HttpClient client;
    
    public OssBucketApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing OSS bucket */
    public PlusApiResultPlusOssBucketVO update(PlusOssBucketForm body) throws Exception {
        return (PlusApiResultPlusOssBucketVO) client.put(ApiPaths.backendPath("/oss/bucket"), body);
    }

    /** Create a new OSS bucket */
    public PlusApiResultPlusOssBucketVO create(PlusOssBucketForm body) throws Exception {
        return (PlusApiResultPlusOssBucketVO) client.post(ApiPaths.backendPath("/oss/bucket"), body);
    }

    /** Get OSS buckets by page */
    public PlusApiResultPagePlusOssBucketVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusOssBucketVO) client.post(ApiPaths.backendPath("/oss/bucket/list"), body, params);
    }

    /** Get all OSS buckets */
    public PlusApiResultListPlusOssBucketVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusOssBucketVO) client.post(ApiPaths.backendPath("/oss/bucket/list/all"), body);
    }

    /** Get an OSS bucket by ID */
    public PlusApiResultPlusOssBucketVO getById(String id) throws Exception {
        return (PlusApiResultPlusOssBucketVO) client.get(ApiPaths.backendPath("/oss/bucket/" + id + ""));
    }

    /** Delete an OSS bucket */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/oss/bucket/" + id + ""));
    }
}
