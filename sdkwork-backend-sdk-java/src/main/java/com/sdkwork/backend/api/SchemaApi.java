package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class SchemaApi {
    private final HttpClient client;
    
    public SchemaApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing database schema */
    public PlusApiResultPlusSchemaVO update(PlusSchemaForm body) throws Exception {
        return (PlusApiResultPlusSchemaVO) client.put(ApiPaths.backendPath("/schema"), body);
    }

    /** Create a new database schema */
    public PlusApiResultPlusSchemaVO create(PlusSchemaForm body) throws Exception {
        return (PlusApiResultPlusSchemaVO) client.post(ApiPaths.backendPath("/schema"), body);
    }

    /** Get database schemas by page */
    public PlusApiResultPagePlusSchemaVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusSchemaVO) client.post(ApiPaths.backendPath("/schema/list"), body, params);
    }

    /** Get all database schemas */
    public PlusApiResultListPlusSchemaVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusSchemaVO) client.post(ApiPaths.backendPath("/schema/list/all"), body);
    }

    /** Get a database schema by ID */
    public PlusApiResultPlusSchemaVO getById(String id) throws Exception {
        return (PlusApiResultPlusSchemaVO) client.get(ApiPaths.backendPath("/schema/" + id + ""));
    }

    /** Delete a database schema */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/schema/" + id + ""));
    }
}
