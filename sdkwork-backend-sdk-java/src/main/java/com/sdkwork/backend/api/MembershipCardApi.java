package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class MembershipCardApi {
    private final HttpClient client;
    
    public MembershipCardApi(HttpClient client) {
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

    /** Get membership cards by page */
    public PlusApiResultPagePlusCardVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusCardVO) client.post(ApiPaths.backendPath("/card/list"), body, params);
    }

    /** Get all membership cards */
    public PlusApiResultListPlusCardVO listAllEntities(QueryListForm body) throws Exception {
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
}
