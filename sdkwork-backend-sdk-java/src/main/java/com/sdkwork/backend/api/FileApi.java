package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class FileApi {
    private final HttpClient client;
    
    public FileApi(HttpClient client) {
        this.client = client;
    }

    /** Update existing file metadata */
    public PlusApiResultPlusFileVO update(PlusFileForm body) throws Exception {
        return (PlusApiResultPlusFileVO) client.put(ApiPaths.backendPath("/file"), body);
    }

    /** Create a new file metadata */
    public PlusApiResultPlusFileVO create(PlusFileForm body) throws Exception {
        return (PlusApiResultPlusFileVO) client.post(ApiPaths.backendPath("/file"), body);
    }

    /** Update an existing file part */
    public PlusApiResultPlusFilePartVO updatePart(PlusFilePartForm body) throws Exception {
        return (PlusApiResultPlusFilePartVO) client.put(ApiPaths.backendPath("/file/part"), body);
    }

    /** Create a new file part */
    public PlusApiResultPlusFilePartVO createPart(PlusFilePartForm body) throws Exception {
        return (PlusApiResultPlusFilePartVO) client.post(ApiPaths.backendPath("/file/part"), body);
    }

    /** Update file content */
    public PlusApiResultPlusFileContentVO updateContent(PlusFileContentForm body) throws Exception {
        return (PlusApiResultPlusFileContentVO) client.put(ApiPaths.backendPath("/file/content"), body);
    }

    /** Create file content */
    public PlusApiResultPlusFileContentVO createContent(PlusFileContentForm body) throws Exception {
        return (PlusApiResultPlusFileContentVO) client.post(ApiPaths.backendPath("/file/content"), body);
    }

    /** Get file parts by page */
    public PlusApiResultPagePlusFilePartVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusFilePartVO) client.post(ApiPaths.backendPath("/file/part/list"), body, params);
    }

    /** Get all file parts */
    public PlusApiResultListPlusFilePartVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusFilePartVO) client.post(ApiPaths.backendPath("/file/part/list/all"), body);
    }

    /** Get file metadata by page */
    public PlusApiResultPagePlusFileVO createListByPageFile(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusFileVO) client.post(ApiPaths.backendPath("/file/list"), body, params);
    }

    /** Get all file metadata */
    public PlusApiResultListPlusFileVO createListAllEntitiesFile(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusFileVO) client.post(ApiPaths.backendPath("/file/list/all"), body);
    }

    /** Get Tree */
    public PlusApiResultSetPlusTreeNodePlusFileVO getTree(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultSetPlusTreeNodePlusFileVO) client.post(ApiPaths.backendPath("/file/get_tree"), body, params);
    }

    /** Get file contents by page */
    public PlusApiResultPagePlusFileContentVO createListByPageContent(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusFileContentVO) client.post(ApiPaths.backendPath("/file/content/list"), body, params);
    }

    /** Get all file contents */
    public PlusApiResultListPlusFileContentVO createListAllEntitiesContent(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusFileContentVO) client.post(ApiPaths.backendPath("/file/content/list/all"), body);
    }

    /** Get file metadata by ID */
    public PlusApiResultPlusFileVO getById(String id) throws Exception {
        return (PlusApiResultPlusFileVO) client.get(ApiPaths.backendPath("/file/" + id + ""));
    }

    /** Delete file metadata */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/file/" + id + ""));
    }

    /** Get a file part by ID */
    public PlusApiResultPlusFilePartVO getByIdPart(String id) throws Exception {
        return (PlusApiResultPlusFilePartVO) client.get(ApiPaths.backendPath("/file/part/" + id + ""));
    }

    /** Delete a file part */
    public PlusApiResultBoolean deletePart(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/file/part/" + id + ""));
    }

    /** Get file content by ID */
    public PlusApiResultPlusFileContentVO getByIdContent(String id) throws Exception {
        return (PlusApiResultPlusFileContentVO) client.get(ApiPaths.backendPath("/file/content/" + id + ""));
    }

    /** Delete file content */
    public PlusApiResultBoolean deleteContent(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/file/content/" + id + ""));
    }
}
