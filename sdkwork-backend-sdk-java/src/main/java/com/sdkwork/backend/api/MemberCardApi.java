package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class MemberCardApi {
    private final HttpClient client;
    
    public MemberCardApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing member card */
    public PlusApiResultPlusMemberCardVO update(PlusMemberCardForm body) throws Exception {
        return (PlusApiResultPlusMemberCardVO) client.put(ApiPaths.backendPath("/member/card"), body);
    }

    /** Create a new member card */
    public PlusApiResultPlusMemberCardVO create(PlusMemberCardForm body) throws Exception {
        return (PlusApiResultPlusMemberCardVO) client.post(ApiPaths.backendPath("/member/card"), body);
    }

    /** Get member cards by page */
    public PlusApiResultPagePlusMemberCardVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusMemberCardVO) client.post(ApiPaths.backendPath("/member/card/list"), body, params);
    }

    /** Get all member cards */
    public PlusApiResultListPlusMemberCardVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusMemberCardVO) client.post(ApiPaths.backendPath("/member/card/list/all"), body);
    }

    /** Get a member card by ID */
    public PlusApiResultPlusMemberCardVO getById(String id) throws Exception {
        return (PlusApiResultPlusMemberCardVO) client.get(ApiPaths.backendPath("/member/card/" + id + ""));
    }

    /** Delete a member card */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/member/card/" + id + ""));
    }
}
