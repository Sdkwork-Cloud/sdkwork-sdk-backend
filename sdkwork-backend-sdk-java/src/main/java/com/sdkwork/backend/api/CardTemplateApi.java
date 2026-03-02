package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class CardTemplateApi {
    private final HttpClient client;
    
    public CardTemplateApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing card template */
    public PlusApiResultPlusCardTemplateVO update(PlusCardTemplateForm body) throws Exception {
        return (PlusApiResultPlusCardTemplateVO) client.put(ApiPaths.backendPath("/card/template"), body);
    }

    /** Create a new card template */
    public PlusApiResultPlusCardTemplateVO create(PlusCardTemplateForm body) throws Exception {
        return (PlusApiResultPlusCardTemplateVO) client.post(ApiPaths.backendPath("/card/template"), body);
    }

    /** Get card templates by page */
    public PlusApiResultPagePlusCardTemplateVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusCardTemplateVO) client.post(ApiPaths.backendPath("/card/template/list"), body, params);
    }

    /** Get all card templates */
    public PlusApiResultListPlusCardTemplateVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusCardTemplateVO) client.post(ApiPaths.backendPath("/card/template/list/all"), body);
    }

    /** Get a card template by ID */
    public PlusApiResultPlusCardTemplateVO getById(String id) throws Exception {
        return (PlusApiResultPlusCardTemplateVO) client.get(ApiPaths.backendPath("/card/template/" + id + ""));
    }

    /** Delete a card template */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/card/template/" + id + ""));
    }
}
