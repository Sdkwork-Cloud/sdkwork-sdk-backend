package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class PositionApi {
    private final HttpClient client;
    
    public PositionApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing position */
    public PlusApiResultPlusPositionVO update(PlusPositionForm body) throws Exception {
        return (PlusApiResultPlusPositionVO) client.put(ApiPaths.backendPath("/organization/position"), body);
    }

    /** Create a new position */
    public PlusApiResultPlusPositionVO create(PlusPositionForm body) throws Exception {
        return (PlusApiResultPlusPositionVO) client.post(ApiPaths.backendPath("/organization/position"), body);
    }

    /** Get positions by page */
    public PlusApiResultPagePlusPositionVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusPositionVO) client.post(ApiPaths.backendPath("/organization/position/list"), body, params);
    }

    /** Get all positions */
    public PlusApiResultListPlusPositionVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusPositionVO) client.post(ApiPaths.backendPath("/organization/position/list/all"), body);
    }

    /** Get a position by ID */
    public PlusApiResultPlusPositionVO getById(String id) throws Exception {
        return (PlusApiResultPlusPositionVO) client.get(ApiPaths.backendPath("/organization/position/" + id + ""));
    }

    /** Delete a position */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/organization/position/" + id + ""));
    }
}
