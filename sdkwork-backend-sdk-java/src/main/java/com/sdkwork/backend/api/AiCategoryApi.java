package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AiCategoryApi {
    private final HttpClient client;
    
    public AiCategoryApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing category */
    public PlusApiResultPlusCategoryVO update(PlusCategoryForm body) throws Exception {
        return (PlusApiResultPlusCategoryVO) client.put(ApiPaths.backendPath("/category"), body);
    }

    /** Create a new category */
    public PlusApiResultPlusCategoryVO create(PlusCategoryForm body) throws Exception {
        return (PlusApiResultPlusCategoryVO) client.post(ApiPaths.backendPath("/category"), body);
    }

    /** Get categories by page */
    public PlusApiResultPagePlusCategoryVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusCategoryVO) client.post(ApiPaths.backendPath("/category/list"), body, params);
    }

    /** Get all categories */
    public PlusApiResultListPlusCategoryVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusCategoryVO) client.post(ApiPaths.backendPath("/category/list/all"), body);
    }

    /** Get Tree */
    public PlusApiResultSetPlusTreeNodePlusCategoryVO getTree(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultSetPlusTreeNodePlusCategoryVO) client.post(ApiPaths.backendPath("/category/get_tree"), body, params);
    }

    /** Get a category by ID */
    public PlusApiResultPlusCategoryVO getById(String id) throws Exception {
        return (PlusApiResultPlusCategoryVO) client.get(ApiPaths.backendPath("/category/" + id + ""));
    }

    /** Delete a category */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/category/" + id + ""));
    }
}
