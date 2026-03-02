package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class WorkspaceApi {
    private final HttpClient client;
    
    public WorkspaceApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing workspace */
    public PlusApiResultPlusWorkspaceVO update(PlusWorkspaceForm body) throws Exception {
        return (PlusApiResultPlusWorkspaceVO) client.put(ApiPaths.backendPath("/workspace"), body);
    }

    /** Create a new workspace */
    public PlusApiResultPlusWorkspaceVO create(PlusWorkspaceForm body) throws Exception {
        return (PlusApiResultPlusWorkspaceVO) client.post(ApiPaths.backendPath("/workspace"), body);
    }

    /** Get workspaces by page */
    public PlusApiResultPagePlusWorkspaceVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusWorkspaceVO) client.post(ApiPaths.backendPath("/workspace/list"), body, params);
    }

    /** Get all workspaces */
    public PlusApiResultListPlusWorkspaceVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusWorkspaceVO) client.post(ApiPaths.backendPath("/workspace/list/all"), body);
    }

    /** Get a workspace by ID */
    public PlusApiResultPlusWorkspaceVO getById(String id) throws Exception {
        return (PlusApiResultPlusWorkspaceVO) client.get(ApiPaths.backendPath("/workspace/" + id + ""));
    }

    /** Delete a workspace */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/workspace/" + id + ""));
    }
}
