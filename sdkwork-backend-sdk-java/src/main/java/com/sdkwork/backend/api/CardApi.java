package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class CardApi {
    private final HttpClient client;
    
    public CardApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing membership card */
    public PlusApiResultPlusCardVO update(PlusCardForm body) throws Exception {
        return (PlusApiResultPlusCardVO) client.put(ApiPaths.backendPath("/card"), body);
    }

    /** Create a new membership card */
    public PlusApiResultPlusCardVO create(PlusCardForm body) throws Exception {
        return (PlusApiResultPlusCardVO) client.post(ApiPaths.backendPath("/card"), body);
    }

    /** Update an existing card template */
    public PlusApiResultPlusCardTemplateVO updateTemplate(PlusCardTemplateForm body) throws Exception {
        return (PlusApiResultPlusCardTemplateVO) client.put(ApiPaths.backendPath("/card/template"), body);
    }

    /** Create a new card template */
    public PlusApiResultPlusCardTemplateVO createTemplate(PlusCardTemplateForm body) throws Exception {
        return (PlusApiResultPlusCardTemplateVO) client.post(ApiPaths.backendPath("/card/template"), body);
    }

    /** Get card templates by page */
    public PlusApiResultPagePlusCardTemplateVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusCardTemplateVO) client.post(ApiPaths.backendPath("/card/template/list"), body, params);
    }

    /** Get all card templates */
    public PlusApiResultListPlusCardTemplateVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusCardTemplateVO) client.post(ApiPaths.backendPath("/card/template/list/all"), body);
    }

    /** Get membership cards by page */
    public PlusApiResultPagePlusCardVO createListByPageCard(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusCardVO) client.post(ApiPaths.backendPath("/card/list"), body, params);
    }

    /** Get all membership cards */
    public PlusApiResultListPlusCardVO createListAllEntitiesCard(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusCardVO) client.post(ApiPaths.backendPath("/card/list/all"), body);
    }

    /** Get a membership card by ID */
    public PlusApiResultPlusCardVO getById(String id) throws Exception {
        return (PlusApiResultPlusCardVO) client.get(ApiPaths.backendPath("/card/" + id + ""));
    }

    /** Delete a membership card */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/card/" + id + ""));
    }

    /** Get a card template by ID */
    public PlusApiResultPlusCardTemplateVO getByIdTemplate(String id) throws Exception {
        return (PlusApiResultPlusCardTemplateVO) client.get(ApiPaths.backendPath("/card/template/" + id + ""));
    }

    /** Delete a card template */
    public PlusApiResultBoolean deleteTemplate(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/card/template/" + id + ""));
    }
}
