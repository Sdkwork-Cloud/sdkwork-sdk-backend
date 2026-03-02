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

    /** 获取文件列表 */
    public PlusApiResultFileListVO listFiles(Map<String, Object> params) throws Exception {
        return (PlusApiResultFileListVO) client.get(ApiPaths.backendPath("/knowledge_base/files"), params);
    }

    /** 上传文件 */
    public PlusApiResultFileItemVO uploadFile(UploadFilePostRequest body, Map<String, Object> params) throws Exception {
        return (PlusApiResultFileItemVO) client.post(ApiPaths.backendPath("/knowledge_base/files"), body, params, null, "multipart/form-data");
    }

    /** 获取文件列表 */
    public PlusApiResultFileListVO getListFiles(Map<String, Object> params) throws Exception {
        return (PlusApiResultFileListVO) client.get(ApiPaths.backendPath("/disk/files"), params);
    }

    /** 上传文件 */
    public PlusApiResultFileItemVO createUploadFile(CreateUploadFileRequest body, Map<String, Object> params) throws Exception {
        return (PlusApiResultFileItemVO) client.post(ApiPaths.backendPath("/disk/files"), body, params, null, "multipart/form-data");
    }

    /** 获取单个文件信息 */
    public PlusApiResultFileItemVO getFile(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.get(ApiPaths.backendPath("/knowledge_base/files/" + fileId + ""));
    }

    /** 删除文件 */
    public PlusApiResultFileItemVO deleteFile(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.delete(ApiPaths.backendPath("/knowledge_base/files/" + fileId + ""));
    }

    /** 获取文件内容 */
    public String getFileContent(String fileId) throws Exception {
        return (String) client.get(ApiPaths.backendPath("/knowledge_base/files/" + fileId + "/content"));
    }

    /** 获取单个文件信息 */
    public PlusApiResultFileItemVO getFileDisk(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.get(ApiPaths.backendPath("/disk/files/" + fileId + ""));
    }

    /** 删除文件 */
    public PlusApiResultFileItemVO deleteFileDisk(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.delete(ApiPaths.backendPath("/disk/files/" + fileId + ""));
    }

    /** 获取文件内容 */
    public String getFileContentDisk(String fileId) throws Exception {
        return (String) client.get(ApiPaths.backendPath("/disk/files/" + fileId + "/content"));
    }
}
