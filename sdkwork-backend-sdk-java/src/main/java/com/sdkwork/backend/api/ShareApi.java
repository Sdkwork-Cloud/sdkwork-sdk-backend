package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ShareApi {
    private final HttpClient client;
    
    public ShareApi(HttpClient client) {
        this.client = client;
    }

    /** 更新分享 */
    public PlusApiResultPlusShareVO update(PlusShareForm body) throws Exception {
        return (PlusApiResultPlusShareVO) client.put(ApiPaths.backendPath("/share"), body);
    }

    /** 创建分享 */
    public PlusApiResultPlusShareVO create(PlusShareForm body) throws Exception {
        return (PlusApiResultPlusShareVO) client.post(ApiPaths.backendPath("/share"), body);
    }

    /** Update visit record */
    public PlusApiResultPlusShareVisitRecordVO updateVisitRecord(PlusShareVisitRecordForm body) throws Exception {
        return (PlusApiResultPlusShareVisitRecordVO) client.put(ApiPaths.backendPath("/share/visit_record"), body);
    }

    /** Create visit record */
    public PlusApiResultPlusShareVisitRecordVO createVisitRecord(PlusShareVisitRecordForm body) throws Exception {
        return (PlusApiResultPlusShareVisitRecordVO) client.post(ApiPaths.backendPath("/share/visit_record"), body);
    }

    /** Get visit records by page */
    public PlusApiResultPagePlusShareVisitRecordVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusShareVisitRecordVO) client.post(ApiPaths.backendPath("/share/visit_record/list"), body, params);
    }

    /** Get all visit records */
    public PlusApiResultListPlusShareVisitRecordVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusShareVisitRecordVO) client.post(ApiPaths.backendPath("/share/visit_record/list/all"), body);
    }

    /** 分页获取分享 */
    public PlusApiResultPagePlusShareVO createListByPageShare(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusShareVO) client.post(ApiPaths.backendPath("/share/list"), body, params);
    }

    /** 获取所有分享 */
    public PlusApiResultListPlusShareVO createListAllEntitiesShare(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusShareVO) client.post(ApiPaths.backendPath("/share/list/all"), body);
    }

    /** 获取分享详情 */
    public PlusApiResultPlusShareVO getById(String id) throws Exception {
        return (PlusApiResultPlusShareVO) client.get(ApiPaths.backendPath("/share/" + id + ""));
    }

    /** 删除分享 */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/share/" + id + ""));
    }

    /** Get visit record by ID */
    public PlusApiResultPlusShareVisitRecordVO getByIdVisitRecord(String id) throws Exception {
        return (PlusApiResultPlusShareVisitRecordVO) client.get(ApiPaths.backendPath("/share/visit_record/" + id + ""));
    }

    /** Delete visit record */
    public PlusApiResultBoolean deleteVisitRecord(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/share/visit_record/" + id + ""));
    }
}
