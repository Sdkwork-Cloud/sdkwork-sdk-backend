package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ImageApi {
    private final HttpClient client;
    
    public ImageApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing image */
    public PlusApiResultPlusImageVO update(PlusImageForm body) throws Exception {
        return (PlusApiResultPlusImageVO) client.put(ApiPaths.backendPath("/image"), body);
    }

    /** Create a new image */
    public PlusApiResultPlusImageVO create(PlusImageForm body) throws Exception {
        return (PlusApiResultPlusImageVO) client.post(ApiPaths.backendPath("/image"), body);
    }

    /** Get images by page */
    public PlusApiResultPagePlusImageVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusImageVO) client.post(ApiPaths.backendPath("/image/list"), body, params);
    }

    /** Get all images */
    public PlusApiResultListPlusImageVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusImageVO) client.post(ApiPaths.backendPath("/image/list/all"), body);
    }

    /** Get an image by ID */
    public PlusApiResultPlusImageVO getById(String id) throws Exception {
        return (PlusApiResultPlusImageVO) client.get(ApiPaths.backendPath("/image/" + id + ""));
    }

    /** Delete an image */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/image/" + id + ""));
    }
}
