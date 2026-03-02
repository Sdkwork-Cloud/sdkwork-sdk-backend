package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class FileContentApi {
    private final HttpClient client;
    
    public FileContentApi(HttpClient client) {
        this.client = client;
    }

    /** Update file content */
    public PlusApiResultPlusFileContentVO update(PlusFileContentForm body) throws Exception {
        return (PlusApiResultPlusFileContentVO) client.put(ApiPaths.backendPath("/file/content"), body);
    }

    /** Create file content */
    public PlusApiResultPlusFileContentVO create(PlusFileContentForm body) throws Exception {
        return (PlusApiResultPlusFileContentVO) client.post(ApiPaths.backendPath("/file/content"), body);
    }

    /** Get file contents by page */
    public PlusApiResultPagePlusFileContentVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusFileContentVO) client.post(ApiPaths.backendPath("/file/content/list"), body, params);
    }

    /** Get all file contents */
    public PlusApiResultListPlusFileContentVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusFileContentVO) client.post(ApiPaths.backendPath("/file/content/list/all"), body);
    }

    /** Get file content by ID */
    public PlusApiResultPlusFileContentVO getById(String id) throws Exception {
        return (PlusApiResultPlusFileContentVO) client.get(ApiPaths.backendPath("/file/content/" + id + ""));
    }

    /** Delete file content */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/file/content/" + id + ""));
    }
}
