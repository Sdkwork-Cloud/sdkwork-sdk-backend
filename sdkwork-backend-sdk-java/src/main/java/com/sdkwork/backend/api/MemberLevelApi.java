package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class MemberLevelApi {
    private final HttpClient client;
    
    public MemberLevelApi(HttpClient client) {
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

    /** Get member levels by page */
    public PlusApiResultPagePlusMemberLevelVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusMemberLevelVO) client.post(ApiPaths.backendPath("/member/level/list"), body, params);
    }

    /** Get all member levels */
    public PlusApiResultListPlusMemberLevelVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusMemberLevelVO) client.post(ApiPaths.backendPath("/member/level/list/all"), body);
    }

    /** Get a member level by ID */
    public PlusApiResultPlusMemberLevelVO getById(String id) throws Exception {
        return (PlusApiResultPlusMemberLevelVO) client.get(ApiPaths.backendPath("/member/level/" + id + ""));
    }

    /** Delete a member level */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/member/level/" + id + ""));
    }
}
