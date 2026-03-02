package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ShareVisitRecordApi {
    private final HttpClient client;
    
    public ShareVisitRecordApi(HttpClient client) {
        this.client = client;
    }

    /** Update visit record */
    public PlusApiResultPlusShareVisitRecordVO update(PlusShareVisitRecordForm body) throws Exception {
        return (PlusApiResultPlusShareVisitRecordVO) client.put(ApiPaths.backendPath("/share/visit_record"), body);
    }

    /** Create visit record */
    public PlusApiResultPlusShareVisitRecordVO create(PlusShareVisitRecordForm body) throws Exception {
        return (PlusApiResultPlusShareVisitRecordVO) client.post(ApiPaths.backendPath("/share/visit_record"), body);
    }

    /** Get visit records by page */
    public PlusApiResultPagePlusShareVisitRecordVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusShareVisitRecordVO) client.post(ApiPaths.backendPath("/share/visit_record/list"), body, params);
    }

    /** Get all visit records */
    public PlusApiResultListPlusShareVisitRecordVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusShareVisitRecordVO) client.post(ApiPaths.backendPath("/share/visit_record/list/all"), body);
    }

    /** Get visit record by ID */
    public PlusApiResultPlusShareVisitRecordVO getById(String id) throws Exception {
        return (PlusApiResultPlusShareVisitRecordVO) client.get(ApiPaths.backendPath("/share/visit_record/" + id + ""));
    }

    /** Delete visit record */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/share/visit_record/" + id + ""));
    }
}
