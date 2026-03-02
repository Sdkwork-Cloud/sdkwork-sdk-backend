package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class FileDiskApi {
    private final HttpClient client;
    
    public FileDiskApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing file disk */
    public PlusApiResultPlusDiskVO update(PlusDiskForm body) throws Exception {
        return (PlusApiResultPlusDiskVO) client.put(ApiPaths.backendPath("/disk"), body);
    }

    /** Create a new file disk */
    public PlusApiResultPlusDiskVO create(PlusDiskForm body) throws Exception {
        return (PlusApiResultPlusDiskVO) client.post(ApiPaths.backendPath("/disk"), body);
    }

    /** Get file disks by page */
    public PlusApiResultPagePlusDiskVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusDiskVO) client.post(ApiPaths.backendPath("/disk/list"), body, params);
    }

    /** Get all file disks */
    public PlusApiResultListPlusDiskVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusDiskVO) client.post(ApiPaths.backendPath("/disk/list/all"), body);
    }

    /** Get a file disk by ID */
    public PlusApiResultPlusDiskVO getById(String id) throws Exception {
        return (PlusApiResultPlusDiskVO) client.get(ApiPaths.backendPath("/disk/" + id + ""));
    }

    /** Delete a file disk */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/disk/" + id + ""));
    }
}
