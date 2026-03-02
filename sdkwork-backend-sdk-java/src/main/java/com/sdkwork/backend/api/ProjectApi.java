package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ProjectApi {
    private final HttpClient client;
    
    public ProjectApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing project */
    public PlusApiResultPlusProjectVO update(PlusProjectForm body) throws Exception {
        return (PlusApiResultPlusProjectVO) client.put(ApiPaths.backendPath("/project"), body);
    }

    /** Create a new project */
    public PlusApiResultPlusProjectVO create(PlusProjectForm body) throws Exception {
        return (PlusApiResultPlusProjectVO) client.post(ApiPaths.backendPath("/project"), body);
    }

    /** Get projects by page */
    public PlusApiResultPagePlusProjectVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusProjectVO) client.post(ApiPaths.backendPath("/project/list"), body, params);
    }

    /** Get all projects */
    public PlusApiResultListPlusProjectVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusProjectVO) client.post(ApiPaths.backendPath("/project/list/all"), body);
    }

    /** Get a project by ID */
    public PlusApiResultPlusProjectVO getById(String id) throws Exception {
        return (PlusApiResultPlusProjectVO) client.get(ApiPaths.backendPath("/project/" + id + ""));
    }

    /** Delete a project */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/project/" + id + ""));
    }
}
