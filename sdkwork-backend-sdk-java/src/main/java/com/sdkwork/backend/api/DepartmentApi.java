package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class DepartmentApi {
    private final HttpClient client;
    
    public DepartmentApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing department */
    public PlusApiResultPlusDepartmentVO update(PlusDepartmentForm body) throws Exception {
        return (PlusApiResultPlusDepartmentVO) client.put(ApiPaths.backendPath("/department"), body);
    }

    /** Create a new department */
    public PlusApiResultPlusDepartmentVO create(PlusDepartmentForm body) throws Exception {
        return (PlusApiResultPlusDepartmentVO) client.post(ApiPaths.backendPath("/department"), body);
    }

    /** Get departments by page */
    public PlusApiResultPagePlusDepartmentVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusDepartmentVO) client.post(ApiPaths.backendPath("/department/list"), body, params);
    }

    /** Get all departments */
    public PlusApiResultListPlusDepartmentVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusDepartmentVO) client.post(ApiPaths.backendPath("/department/list/all"), body);
    }

    /** Get a department by ID */
    public PlusApiResultPlusDepartmentVO getById(String id) throws Exception {
        return (PlusApiResultPlusDepartmentVO) client.get(ApiPaths.backendPath("/department/" + id + ""));
    }

    /** Delete a department */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/department/" + id + ""));
    }
}
