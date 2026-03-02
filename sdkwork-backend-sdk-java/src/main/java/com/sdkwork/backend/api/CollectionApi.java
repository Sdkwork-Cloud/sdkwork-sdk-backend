package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class CollectionApi {
    private final HttpClient client;
    
    public CollectionApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing collection */
    public PlusApiResultPlusCollectionVO update(PlusCollectionForm body) throws Exception {
        return (PlusApiResultPlusCollectionVO) client.put(ApiPaths.backendPath("/collection"), body);
    }

    /** Create a new collection */
    public PlusApiResultPlusCollectionVO create(PlusCollectionForm body) throws Exception {
        return (PlusApiResultPlusCollectionVO) client.post(ApiPaths.backendPath("/collection"), body);
    }

    /** Get collections by page */
    public PlusApiResultPagePlusCollectionVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusCollectionVO) client.post(ApiPaths.backendPath("/collection/list"), body, params);
    }

    /** Get all collections */
    public PlusApiResultListPlusCollectionVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusCollectionVO) client.post(ApiPaths.backendPath("/collection/list/all"), body);
    }

    /** Get a collection by ID */
    public PlusApiResultPlusCollectionVO getById(String id) throws Exception {
        return (PlusApiResultPlusCollectionVO) client.get(ApiPaths.backendPath("/collection/" + id + ""));
    }

    /** Delete a collection */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/collection/" + id + ""));
    }
}
