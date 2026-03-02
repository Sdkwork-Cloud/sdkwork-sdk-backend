package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class CollectionItemApi {
    private final HttpClient client;
    
    public CollectionItemApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing collection item */
    public PlusApiResultPlusCollectionItemVO update(PlusCollectionItemForm body) throws Exception {
        return (PlusApiResultPlusCollectionItemVO) client.put(ApiPaths.backendPath("/collection-item"), body);
    }

    /** Create a new collection item */
    public PlusApiResultPlusCollectionItemVO create(PlusCollectionItemForm body) throws Exception {
        return (PlusApiResultPlusCollectionItemVO) client.post(ApiPaths.backendPath("/collection-item"), body);
    }

    /** Get collection items by page */
    public PlusApiResultPagePlusCollectionItemVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusCollectionItemVO) client.post(ApiPaths.backendPath("/collection-item/list"), body, params);
    }

    /** Get all collection items */
    public PlusApiResultListPlusCollectionItemVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusCollectionItemVO) client.post(ApiPaths.backendPath("/collection-item/list/all"), body);
    }

    /** Get a collection item by ID */
    public PlusApiResultPlusCollectionItemVO getById(String id) throws Exception {
        return (PlusApiResultPlusCollectionItemVO) client.get(ApiPaths.backendPath("/collection-item/" + id + ""));
    }

    /** Delete a collection item */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/collection-item/" + id + ""));
    }
}
