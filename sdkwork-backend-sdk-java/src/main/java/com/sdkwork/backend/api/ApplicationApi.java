package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ApplicationApi {
    private final HttpClient client;
    
    public ApplicationApi(HttpClient client) {
        this.client = client;
    }

    /** Update application */
    public PlusApiResultPlusAppVO update(PlusAppForm body) throws Exception {
        return (PlusApiResultPlusAppVO) client.put(ApiPaths.backendPath("/app"), body);
    }

    /** Create application */
    public PlusApiResultPlusAppVO create(PlusAppForm body) throws Exception {
        return (PlusApiResultPlusAppVO) client.post(ApiPaths.backendPath("/app"), body);
    }

    /** Get applications by page */
    public PlusApiResultPagePlusAppVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusAppVO) client.post(ApiPaths.backendPath("/app/list"), body, params);
    }

    /** Get all applications */
    public PlusApiResultListPlusAppVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusAppVO) client.post(ApiPaths.backendPath("/app/list/all"), body);
    }

    /** Get application by ID */
    public PlusApiResultPlusAppVO getById(String id) throws Exception {
        return (PlusApiResultPlusAppVO) client.get(ApiPaths.backendPath("/app/" + id + ""));
    }

    /** Delete application */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/app/" + id + ""));
    }
}
