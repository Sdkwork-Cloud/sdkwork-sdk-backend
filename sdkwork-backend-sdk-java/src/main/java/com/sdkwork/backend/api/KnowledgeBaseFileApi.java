package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class KnowledgeBaseFileApi {
    private final HttpClient client;
    
    public KnowledgeBaseFileApi(HttpClient client) {
        this.client = client;
    }

    /** List files */
    public PlusApiResultFileListVO listFiles(Map<String, Object> params) throws Exception {
        return (PlusApiResultFileListVO) client.get(ApiPaths.backendPath("/knowledge_base/files"), params);
    }

    /** Upload file */
    public PlusApiResultFileItemVO uploadFile(UploadFilePostRequest body, Map<String, Object> params) throws Exception {
        return (PlusApiResultFileItemVO) client.post(ApiPaths.backendPath("/knowledge_base/files"), body, params, null, "multipart/form-data");
    }

    /** List files */
    public PlusApiResultFileListVO getListFiles(Map<String, Object> params) throws Exception {
        return (PlusApiResultFileListVO) client.get(ApiPaths.backendPath("/disk/files"), params);
    }

    /** Upload file */
    public PlusApiResultFileItemVO createUploadFile(CreateUploadFileRequest body, Map<String, Object> params) throws Exception {
        return (PlusApiResultFileItemVO) client.post(ApiPaths.backendPath("/disk/files"), body, params, null, "multipart/form-data");
    }

    /** Get file */
    public PlusApiResultFileItemVO getFile(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.get(ApiPaths.backendPath("/knowledge_base/files/" + fileId + ""));
    }

    /** Delete file */
    public PlusApiResultFileItemVO deleteFile(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.delete(ApiPaths.backendPath("/knowledge_base/files/" + fileId + ""));
    }

    /** Get file content */
    public String getFileContent(String fileId) throws Exception {
        return (String) client.get(ApiPaths.backendPath("/knowledge_base/files/" + fileId + "/content"));
    }

    /** Get file */
    public PlusApiResultFileItemVO getFileDisk(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.get(ApiPaths.backendPath("/disk/files/" + fileId + ""));
    }

    /** Delete file */
    public PlusApiResultFileItemVO deleteFileDisk(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.delete(ApiPaths.backendPath("/disk/files/" + fileId + ""));
    }

    /** Get file content */
    public String getFileContentDisk(String fileId) throws Exception {
        return (String) client.get(ApiPaths.backendPath("/disk/files/" + fileId + "/content"));
    }
}
