package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class DatabaseTableApi {
    private final HttpClient client;
    
    public DatabaseTableApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing database table */
    public PlusApiResultPlusTableVO update(PlusTableForm body) throws Exception {
        return (PlusApiResultPlusTableVO) client.put(ApiPaths.backendPath("/table"), body);
    }

    /** Create a new database table */
    public PlusApiResultPlusTableVO create(PlusTableForm body) throws Exception {
        return (PlusApiResultPlusTableVO) client.post(ApiPaths.backendPath("/table"), body);
    }

    /** Get database tables by page */
    public PlusApiResultPagePlusTableVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusTableVO) client.post(ApiPaths.backendPath("/table/list"), body, params);
    }

    /** Get all database tables */
    public PlusApiResultListPlusTableVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusTableVO) client.post(ApiPaths.backendPath("/table/list/all"), body);
    }

    /** Get a database table by ID */
    public PlusApiResultPlusTableVO getById(String id) throws Exception {
        return (PlusApiResultPlusTableVO) client.get(ApiPaths.backendPath("/table/" + id + ""));
    }

    /** Delete a database table */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/table/" + id + ""));
    }
}
