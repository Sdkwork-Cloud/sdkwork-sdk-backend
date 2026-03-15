package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class MemberApi {
    private final HttpClient client;
    
    public MemberApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing member level */
    public PlusApiResultPlusMemberLevelVO update(PlusMemberLevelForm body) throws Exception {
        return (PlusApiResultPlusMemberLevelVO) client.put(ApiPaths.backendPath("/member/level"), body);
    }

    /** Create a new member level */
    public PlusApiResultPlusMemberLevelVO create(PlusMemberLevelForm body) throws Exception {
        return (PlusApiResultPlusMemberLevelVO) client.post(ApiPaths.backendPath("/member/level"), body);
    }

    /** Update an existing member card */
    public PlusApiResultPlusMemberCardVO updateCard(PlusMemberCardForm body) throws Exception {
        return (PlusApiResultPlusMemberCardVO) client.put(ApiPaths.backendPath("/member/card"), body);
    }

    /** Create a new member card */
    public PlusApiResultPlusMemberCardVO createCard(PlusMemberCardForm body) throws Exception {
        return (PlusApiResultPlusMemberCardVO) client.post(ApiPaths.backendPath("/member/card"), body);
    }

    /** Get member levels by page */
    public PlusApiResultPagePlusMemberLevelVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusMemberLevelVO) client.post(ApiPaths.backendPath("/member/level/list"), body, params);
    }

    /** Get all member levels */
    public PlusApiResultListPlusMemberLevelVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusMemberLevelVO) client.post(ApiPaths.backendPath("/member/level/list/all"), body);
    }

    /** Get member cards by page */
    public PlusApiResultPagePlusMemberCardVO createListByPageCard(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusMemberCardVO) client.post(ApiPaths.backendPath("/member/card/list"), body, params);
    }

    /** Get all member cards */
    public PlusApiResultListPlusMemberCardVO createListAllEntitiesCard(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusMemberCardVO) client.post(ApiPaths.backendPath("/member/card/list/all"), body);
    }

    /** Get a member level by ID */
    public PlusApiResultPlusMemberLevelVO getById(String id) throws Exception {
        return (PlusApiResultPlusMemberLevelVO) client.get(ApiPaths.backendPath("/member/level/" + id + ""));
    }

    /** Delete a member level */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/member/level/" + id + ""));
    }

    /** Get a member card by ID */
    public PlusApiResultPlusMemberCardVO getByIdCard(String id) throws Exception {
        return (PlusApiResultPlusMemberCardVO) client.get(ApiPaths.backendPath("/member/card/" + id + ""));
    }

    /** Delete a member card */
    public PlusApiResultBoolean deleteCard(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/member/card/" + id + ""));
    }
}
