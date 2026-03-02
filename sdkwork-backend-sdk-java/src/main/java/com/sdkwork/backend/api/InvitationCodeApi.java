package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class InvitationCodeApi {
    private final HttpClient client;
    
    public InvitationCodeApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing invitation code */
    public PlusApiResultInvitationCodeVO update(InvitationCodeForm body) throws Exception {
        return (PlusApiResultInvitationCodeVO) client.put(ApiPaths.backendPath("/invitation/code"), body);
    }

    /** Create a new invitation code */
    public PlusApiResultInvitationCodeVO create(InvitationCodeForm body) throws Exception {
        return (PlusApiResultInvitationCodeVO) client.post(ApiPaths.backendPath("/invitation/code"), body);
    }

    /** Get invitation codes by page */
    public PlusApiResultPageInvitationCodeVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageInvitationCodeVO) client.post(ApiPaths.backendPath("/invitation/code/list"), body, params);
    }

    /** Get all invitation codes */
    public PlusApiResultListInvitationCodeVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListInvitationCodeVO) client.post(ApiPaths.backendPath("/invitation/code/list/all"), body);
    }

    /** Get an invitation code by ID */
    public PlusApiResultInvitationCodeVO getById(String id) throws Exception {
        return (PlusApiResultInvitationCodeVO) client.get(ApiPaths.backendPath("/invitation/code/" + id + ""));
    }

    /** Delete an invitation code */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/invitation/code/" + id + ""));
    }
}
