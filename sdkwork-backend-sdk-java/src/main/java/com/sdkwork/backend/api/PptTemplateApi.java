package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class PptTemplateApi {
    private final HttpClient client;
    
    public PptTemplateApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing PPT template */
    public PlusApiResultPlusPptTemplateVO update(PlusPptTemplateForm body) throws Exception {
        return (PlusApiResultPlusPptTemplateVO) client.put(ApiPaths.backendPath("/ppt/template"), body);
    }

    /** Create a new PPT template */
    public PlusApiResultPlusPptTemplateVO create(PlusPptTemplateForm body) throws Exception {
        return (PlusApiResultPlusPptTemplateVO) client.post(ApiPaths.backendPath("/ppt/template"), body);
    }

    /** Get PPT templates by page */
    public PlusApiResultPagePlusPptTemplateVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusPptTemplateVO) client.post(ApiPaths.backendPath("/ppt/template/list"), body, params);
    }

    /** Get all PPT templates */
    public PlusApiResultListPlusPptTemplateVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusPptTemplateVO) client.post(ApiPaths.backendPath("/ppt/template/list/all"), body);
    }

    /** Get a PPT template by ID */
    public PlusApiResultPlusPptTemplateVO getById(String id) throws Exception {
        return (PlusApiResultPlusPptTemplateVO) client.get(ApiPaths.backendPath("/ppt/template/" + id + ""));
    }

    /** Delete a PPT template */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/ppt/template/" + id + ""));
    }
}
