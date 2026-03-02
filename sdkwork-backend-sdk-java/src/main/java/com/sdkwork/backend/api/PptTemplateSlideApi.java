package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class PptTemplateSlideApi {
    private final HttpClient client;
    
    public PptTemplateSlideApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing PPT template slide */
    public PlusApiResultPlusPptTemplateSlideVO update(PlusPptTemplateSlideForm body) throws Exception {
        return (PlusApiResultPlusPptTemplateSlideVO) client.put(ApiPaths.backendPath("/ppt/template/slide"), body);
    }

    /** Create a new PPT template slide */
    public PlusApiResultPlusPptTemplateSlideVO create(PlusPptTemplateSlideForm body) throws Exception {
        return (PlusApiResultPlusPptTemplateSlideVO) client.post(ApiPaths.backendPath("/ppt/template/slide"), body);
    }

    /** Get PPT template slides by page */
    public PlusApiResultPagePlusPptTemplateSlideVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusPptTemplateSlideVO) client.post(ApiPaths.backendPath("/ppt/template/slide/list"), body, params);
    }

    /** Get all PPT template slides */
    public PlusApiResultListPlusPptTemplateSlideVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusPptTemplateSlideVO) client.post(ApiPaths.backendPath("/ppt/template/slide/list/all"), body);
    }

    /** Get a PPT template slide by ID */
    public PlusApiResultPlusPptTemplateSlideVO getById(String id) throws Exception {
        return (PlusApiResultPlusPptTemplateSlideVO) client.get(ApiPaths.backendPath("/ppt/template/slide/" + id + ""));
    }

    /** Delete a PPT template slide */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/ppt/template/slide/" + id + ""));
    }
}
