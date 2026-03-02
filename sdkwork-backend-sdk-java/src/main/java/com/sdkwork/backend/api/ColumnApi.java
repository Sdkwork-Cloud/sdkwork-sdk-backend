package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ColumnApi {
    private final HttpClient client;
    
    public ColumnApi(HttpClient client) {
        this.client = client;
    }

    /** Update column */
    public PlusApiResultPlusColumnVO update(PlusColumnForm body) throws Exception {
        return (PlusApiResultPlusColumnVO) client.put(ApiPaths.backendPath("/column"), body);
    }

    /** Create column */
    public PlusApiResultPlusColumnVO create(PlusColumnForm body) throws Exception {
        return (PlusApiResultPlusColumnVO) client.post(ApiPaths.backendPath("/column"), body);
    }

    /** Get columns by page */
    public PlusApiResultPagePlusColumnVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusColumnVO) client.post(ApiPaths.backendPath("/column/list"), body, params);
    }

    /** Get all columns */
    public PlusApiResultListPlusColumnVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusColumnVO) client.post(ApiPaths.backendPath("/column/list/all"), body);
    }

    /** Get column by ID */
    public PlusApiResultPlusColumnVO getById(String id) throws Exception {
        return (PlusApiResultPlusColumnVO) client.get(ApiPaths.backendPath("/column/" + id + ""));
    }

    /** Delete column */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/column/" + id + ""));
    }
}
