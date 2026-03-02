package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class FavoriteApi {
    private final HttpClient client;
    
    public FavoriteApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing favorite */
    public PlusApiResultPlusFavoriteVO update(PlusFavoriteForm body) throws Exception {
        return (PlusApiResultPlusFavoriteVO) client.put(ApiPaths.backendPath("/favorite"), body);
    }

    /** Create a new favorite */
    public PlusApiResultPlusFavoriteVO create(PlusFavoriteForm body) throws Exception {
        return (PlusApiResultPlusFavoriteVO) client.post(ApiPaths.backendPath("/favorite"), body);
    }

    /** Get favorites by page */
    public PlusApiResultPagePlusFavoriteVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusFavoriteVO) client.post(ApiPaths.backendPath("/favorite/list"), body, params);
    }

    /** Get all favorites */
    public PlusApiResultListPlusFavoriteVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusFavoriteVO) client.post(ApiPaths.backendPath("/favorite/list/all"), body);
    }

    /** Get a favorite by ID */
    public PlusApiResultPlusFavoriteVO getById(String id) throws Exception {
        return (PlusApiResultPlusFavoriteVO) client.get(ApiPaths.backendPath("/favorite/" + id + ""));
    }

    /** Delete a favorite */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/favorite/" + id + ""));
    }
}
