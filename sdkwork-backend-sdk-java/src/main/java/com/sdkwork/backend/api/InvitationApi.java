package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class InvitationApi {
    private final HttpClient client;
    
    public InvitationApi(HttpClient client) {
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

    /** Update an existing invitation code */
    public PlusApiResultInvitationCodeVO updateCode(InvitationCodeForm body) throws Exception {
        return (PlusApiResultInvitationCodeVO) client.put(ApiPaths.backendPath("/invitation/code"), body);
    }

    /** Create a new invitation code */
    public PlusApiResultInvitationCodeVO createCode(InvitationCodeForm body) throws Exception {
        return (PlusApiResultInvitationCodeVO) client.post(ApiPaths.backendPath("/invitation/code"), body);
    }

    /** Get invitation relations by page */
    public PlusApiResultPageInvitationRelationVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageInvitationRelationVO) client.post(ApiPaths.backendPath("/invitation/relation/list"), body, params);
    }

    /** Get all invitation relations */
    public PlusApiResultListInvitationRelationVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListInvitationRelationVO) client.post(ApiPaths.backendPath("/invitation/relation/list/all"), body);
    }

    /** Get invitation codes by page */
    public PlusApiResultPageInvitationCodeVO createListByPageCode(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageInvitationCodeVO) client.post(ApiPaths.backendPath("/invitation/code/list"), body, params);
    }

    /** Get all invitation codes */
    public PlusApiResultListInvitationCodeVO createListAllEntitiesCode(QueryListForm body) throws Exception {
        return (PlusApiResultListInvitationCodeVO) client.post(ApiPaths.backendPath("/invitation/code/list/all"), body);
    }

    /** Get an invitation relation by ID */
    public PlusApiResultInvitationRelationVO getById(String id) throws Exception {
        return (PlusApiResultInvitationRelationVO) client.get(ApiPaths.backendPath("/invitation/relation/" + id + ""));
    }

    /** Delete an invitation relation */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/invitation/relation/" + id + ""));
    }

    /** Get an invitation code by ID */
    public PlusApiResultInvitationCodeVO getByIdCode(String id) throws Exception {
        return (PlusApiResultInvitationCodeVO) client.get(ApiPaths.backendPath("/invitation/code/" + id + ""));
    }

    /** Delete an invitation code */
    public PlusApiResultBoolean deleteCode(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/invitation/code/" + id + ""));
    }
}
