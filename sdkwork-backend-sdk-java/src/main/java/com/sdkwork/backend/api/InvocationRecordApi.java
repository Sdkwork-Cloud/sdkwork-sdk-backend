package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class InvocationRecordApi {
    private final HttpClient client;
    
    public InvocationRecordApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing invocation record */
    public PlusApiResultPlusInvokeRecordVO update(PlusInvokeRecordForm body) throws Exception {
        return (PlusApiResultPlusInvokeRecordVO) client.put(ApiPaths.backendPath("/record"), body);
    }

    /** Create a new invocation record */
    public PlusApiResultPlusInvokeRecordVO create(PlusInvokeRecordForm body) throws Exception {
        return (PlusApiResultPlusInvokeRecordVO) client.post(ApiPaths.backendPath("/record"), body);
    }

    /** Get invocation records by page */
    public PlusApiResultPagePlusInvokeRecordVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusInvokeRecordVO) client.post(ApiPaths.backendPath("/record/list"), body, params);
    }

    /** Get all invocation records */
    public PlusApiResultListPlusInvokeRecordVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusInvokeRecordVO) client.post(ApiPaths.backendPath("/record/list/all"), body);
    }

    /** Get an invocation record by ID */
    public PlusApiResultPlusInvokeRecordVO getById(String id) throws Exception {
        return (PlusApiResultPlusInvokeRecordVO) client.get(ApiPaths.backendPath("/record/" + id + ""));
    }

    /** Delete an invocation record */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/record/" + id + ""));
    }
}
