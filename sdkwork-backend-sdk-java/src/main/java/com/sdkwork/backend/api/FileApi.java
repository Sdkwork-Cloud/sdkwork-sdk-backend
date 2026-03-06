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

    /** List files */
    public PlusApiResultFileListVO listFiles(Map<String, Object> params) throws Exception {
        return (PlusApiResultFileListVO) client.get(ApiPaths.backendPath("/oss/files"), params);
    }

    /** Upload file */
    public PlusApiResultFileItemVO upload(UploadFileRequest body, Map<String, Object> params) throws Exception {
        return (PlusApiResultFileItemVO) client.post(ApiPaths.backendPath("/oss/files"), body, params, null, "multipart/form-data");
    }

    /** Get upload temporary session */
    public PlusApiResultPlusTempSessionVO getTempSession(PlusGetTempSessionForm body) throws Exception {
        return (PlusApiResultPlusTempSessionVO) client.post(ApiPaths.backendPath("/oss/files/temp_session"), body);
    }

    /** Generate presigned URL */
    public PlusApiResultGetUrlResult getPresignedUrl(PlusGetPresignedUrlForm body) throws Exception {
        return (PlusApiResultGetUrlResult) client.post(ApiPaths.backendPath("/oss/files/get_presigned_url"), body);
    }

    /** Upload file */
    public PlusApiResultPlusFileVO createFiles(PlusUploadForm body) throws Exception {
        return (PlusApiResultPlusFileVO) client.post(ApiPaths.backendPath("/oss/files/create"), body);
    }

    /** Get file metadata by page */
    public PlusApiResultPagePlusFileVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusFileVO) client.post(ApiPaths.backendPath("/file/list"), body, params);
    }

    /** Get all file metadata */
    public PlusApiResultListPlusFileVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusFileVO) client.post(ApiPaths.backendPath("/file/list/all"), body);
    }

    /** Get Tree */
    public PlusApiResultSetPlusTreeNodePlusFileVO getTree(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultSetPlusTreeNodePlusFileVO) client.post(ApiPaths.backendPath("/file/get_tree"), body, params);
    }

    /** Get file */
    public PlusApiResultFileItemVO getFile(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.get(ApiPaths.backendPath("/oss/files/" + fileId + ""));
    }

    /** Delete file */
    public PlusApiResultFileItemVO deleteFile(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.delete(ApiPaths.backendPath("/oss/files/" + fileId + ""));
    }

    /** Get file content */
    public String getFileContent(String fileId) throws Exception {
        return (String) client.get(ApiPaths.backendPath("/oss/files/" + fileId + "/content"));
    }

    /** Get file metadata by ID */
    public PlusApiResultPlusFileVO getById(String id) throws Exception {
        return (PlusApiResultPlusFileVO) client.get(ApiPaths.backendPath("/file/" + id + ""));
    }

    /** Delete file metadata */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/file/" + id + ""));
    }
}
