package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class InvitationRelationApi {
    private final HttpClient client;
    
    public InvitationRelationApi(HttpClient client) {
        this.client = client;
    }

    /** Update an invitation relation */
    public PlusApiResultInvitationRelationVO update(InvitationRelationForm body) throws Exception {
        return (PlusApiResultInvitationRelationVO) client.put(ApiPaths.backendPath("/invitation/relation"), body);
    }

    /** Create a new invitation relation */
    public PlusApiResultInvitationRelationVO create(InvitationRelationForm body) throws Exception {
        return (PlusApiResultInvitationRelationVO) client.post(ApiPaths.backendPath("/invitation/relation"), body);
    }

    /** Get invitation relations by page */
    public PlusApiResultPageInvitationRelationVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageInvitationRelationVO) client.post(ApiPaths.backendPath("/invitation/relation/list"), body, params);
    }

    /** Get all invitation relations */
    public PlusApiResultListInvitationRelationVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListInvitationRelationVO) client.post(ApiPaths.backendPath("/invitation/relation/list/all"), body);
    }

    /** Get an invitation relation by ID */
    public PlusApiResultInvitationRelationVO getById(String id) throws Exception {
        return (PlusApiResultInvitationRelationVO) client.get(ApiPaths.backendPath("/invitation/relation/" + id + ""));
    }

    /** Delete an invitation relation */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/invitation/relation/" + id + ""));
    }
}
