package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VisitHistoryApi {
    private final HttpClient client;
    
    public VisitHistoryApi(HttpClient client) {
        this.client = client;
    }

    /** Update Visit History */
    public PlusApiResultPlusVisitHistoryVO update(PlusVisitHistoryForm body) throws Exception {
        return (PlusApiResultPlusVisitHistoryVO) client.put(ApiPaths.backendPath("/visit_history"), body);
    }

    /** Create Visit History */
    public PlusApiResultPlusVisitHistoryVO create(PlusVisitHistoryForm body) throws Exception {
        return (PlusApiResultPlusVisitHistoryVO) client.post(ApiPaths.backendPath("/visit_history"), body);
    }

    /** List Visit Histories by Page */
    public PlusApiResultPagePlusVisitHistoryVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVisitHistoryVO) client.post(ApiPaths.backendPath("/visit_history/list"), body, params);
    }

    /** List All Visit Histories */
    public PlusApiResultListPlusVisitHistoryVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVisitHistoryVO) client.post(ApiPaths.backendPath("/visit_history/list/all"), body);
    }

    /** Get Visit History by ID */
    public PlusApiResultPlusVisitHistoryVO getById(String id) throws Exception {
        return (PlusApiResultPlusVisitHistoryVO) client.get(ApiPaths.backendPath("/visit_history/" + id + ""));
    }

    /** Delete Visit History */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/visit_history/" + id + ""));
    }
}
