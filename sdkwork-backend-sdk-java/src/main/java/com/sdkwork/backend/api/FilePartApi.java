package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class FilePartApi {
    private final HttpClient client;
    
    public FilePartApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing file part */
    public PlusApiResultPlusFilePartVO update(PlusFilePartForm body) throws Exception {
        return (PlusApiResultPlusFilePartVO) client.put(ApiPaths.backendPath("/file/part"), body);
    }

    /** Create a new file part */
    public PlusApiResultPlusFilePartVO create(PlusFilePartForm body) throws Exception {
        return (PlusApiResultPlusFilePartVO) client.post(ApiPaths.backendPath("/file/part"), body);
    }

    /** Get file parts by page */
    public PlusApiResultPagePlusFilePartVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusFilePartVO) client.post(ApiPaths.backendPath("/file/part/list"), body, params);
    }

    /** Get all file parts */
    public PlusApiResultListPlusFilePartVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusFilePartVO) client.post(ApiPaths.backendPath("/file/part/list/all"), body);
    }

    /** Get a file part by ID */
    public PlusApiResultPlusFilePartVO getById(String id) throws Exception {
        return (PlusApiResultPlusFilePartVO) client.get(ApiPaths.backendPath("/file/part/" + id + ""));
    }

    /** Delete a file part */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/file/part/" + id + ""));
    }
}
