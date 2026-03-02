package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class RefundApi {
    private final HttpClient client;
    
    public RefundApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing refund record */
    public PlusApiResultPlusRefundVO update(PlusRefundForm body) throws Exception {
        return (PlusApiResultPlusRefundVO) client.put(ApiPaths.backendPath("/trade/refund"), body);
    }

    /** Create a new refund record */
    public PlusApiResultPlusRefundVO create(PlusRefundForm body) throws Exception {
        return (PlusApiResultPlusRefundVO) client.post(ApiPaths.backendPath("/trade/refund"), body);
    }

    /** Get refund records by page */
    public PlusApiResultPagePlusRefundVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusRefundVO) client.post(ApiPaths.backendPath("/trade/refund/list"), body, params);
    }

    /** Get all refund records */
    public PlusApiResultListPlusRefundVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusRefundVO) client.post(ApiPaths.backendPath("/trade/refund/list/all"), body);
    }

    /** Get a refund record by ID */
    public PlusApiResultPlusRefundVO getById(String id) throws Exception {
        return (PlusApiResultPlusRefundVO) client.get(ApiPaths.backendPath("/trade/refund/" + id + ""));
    }

    /** Delete a refund record */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/refund/" + id + ""));
    }
}
