package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class PptApi {
    private final HttpClient client;
    
    public PptApi(HttpClient client) {
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

    /** Update an existing PPT template slide */
    public PlusApiResultPlusPptTemplateSlideVO updateSlide(PlusPptTemplateSlideForm body) throws Exception {
        return (PlusApiResultPlusPptTemplateSlideVO) client.put(ApiPaths.backendPath("/ppt/template/slide"), body);
    }

    /** Create a new PPT template slide */
    public PlusApiResultPlusPptTemplateSlideVO createSlide(PlusPptTemplateSlideForm body) throws Exception {
        return (PlusApiResultPlusPptTemplateSlideVO) client.post(ApiPaths.backendPath("/ppt/template/slide"), body);
    }

    /** Get PPT template slides by page */
    public PlusApiResultPagePlusPptTemplateSlideVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusPptTemplateSlideVO) client.post(ApiPaths.backendPath("/ppt/template/slide/list"), body, params);
    }

    /** Get all PPT template slides */
    public PlusApiResultListPlusPptTemplateSlideVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusPptTemplateSlideVO) client.post(ApiPaths.backendPath("/ppt/template/slide/list/all"), body);
    }

    /** Render PPT template */
    public PlusApiResult render(PlusPptTemplateRenderForm body) throws Exception {
        return (PlusApiResult) client.post(ApiPaths.backendPath("/ppt/template/render"), body);
    }

    /** Get PPT templates by page */
    public PlusApiResultPagePlusPptTemplateVO createListByPageTemplate(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusPptTemplateVO) client.post(ApiPaths.backendPath("/ppt/template/list"), body, params);
    }

    /** Get all PPT templates */
    public PlusApiResultListPlusPptTemplateVO createListAllEntitiesTemplate(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusPptTemplateVO) client.post(ApiPaths.backendPath("/ppt/template/list/all"), body);
    }

    public PlusApiResultBoolean stop(Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/ppt/template/chat/stop"), null, params, headers);
    }

    /** Create a chat completion with PPT template */
    public ChatCompletionChunk createCompletions(ChatCompletionCreateForm body, Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/ppt/template/chat/completions"), body, params, headers);
    }

    /** Get a PPT template by ID */
    public PlusApiResultPlusPptTemplateVO getById(String id) throws Exception {
        return (PlusApiResultPlusPptTemplateVO) client.get(ApiPaths.backendPath("/ppt/template/" + id + ""));
    }

    /** Delete a PPT template */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/ppt/template/" + id + ""));
    }

    /** Get a PPT template slide by ID */
    public PlusApiResultPlusPptTemplateSlideVO getByIdSlide(String id) throws Exception {
        return (PlusApiResultPlusPptTemplateSlideVO) client.get(ApiPaths.backendPath("/ppt/template/slide/" + id + ""));
    }

    /** Delete a PPT template slide */
    public PlusApiResultBoolean deleteSlide(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/ppt/template/slide/" + id + ""));
    }
}
