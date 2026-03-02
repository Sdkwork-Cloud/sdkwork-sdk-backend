package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class DiskMemberApi {
    private final HttpClient client;
    
    public DiskMemberApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing disk member */
    public PlusApiResultPlusDiskMemberVO update(PlusDiskMemberForm body) throws Exception {
        return (PlusApiResultPlusDiskMemberVO) client.put(ApiPaths.backendPath("/disk/member"), body);
    }

    /** Create a new disk member */
    public PlusApiResultPlusDiskMemberVO create(PlusDiskMemberForm body) throws Exception {
        return (PlusApiResultPlusDiskMemberVO) client.post(ApiPaths.backendPath("/disk/member"), body);
    }

    /** Get disk members by page */
    public PlusApiResultPagePlusDiskMemberVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusDiskMemberVO) client.post(ApiPaths.backendPath("/disk/member/list"), body, params);
    }

    /** Get all disk members */
    public PlusApiResultListPlusDiskMemberVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusDiskMemberVO) client.post(ApiPaths.backendPath("/disk/member/list/all"), body);
    }

    /** Get a disk member by ID */
    public PlusApiResultPlusDiskMemberVO getById(String id) throws Exception {
        return (PlusApiResultPlusDiskMemberVO) client.get(ApiPaths.backendPath("/disk/member/" + id + ""));
    }

    /** Delete a disk member */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/disk/member/" + id + ""));
    }
}
