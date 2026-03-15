package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class KnowledgeBaseApi {
    private final HttpClient client;
    
    public KnowledgeBaseApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing knowledge base */
    public PlusApiResultPlusKnowledgeBaseVO update(PlusKnowledgeBaseForm body) throws Exception {
        return (PlusApiResultPlusKnowledgeBaseVO) client.put(ApiPaths.backendPath("/knowledge_base"), body);
    }

    /** Create a new knowledge base */
    public PlusApiResultPlusKnowledgeBaseVO create(PlusKnowledgeBaseForm body) throws Exception {
        return (PlusApiResultPlusKnowledgeBaseVO) client.post(ApiPaths.backendPath("/knowledge_base"), body);
    }

    /** Get knowledge bases by page */
    public PlusApiResultPagePlusKnowledgeBaseVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusKnowledgeBaseVO) client.post(ApiPaths.backendPath("/knowledge_base/list"), body, params);
    }

    /** Get all knowledge bases */
    public PlusApiResultListPlusKnowledgeBaseVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusKnowledgeBaseVO) client.post(ApiPaths.backendPath("/knowledge_base/list/all"), body);
    }

    /** Get a knowledge base detail by ID */
    public PlusApiResultPlusKnowledgeBaseVO getDetail(Map<String, Object> params) throws Exception {
        return (PlusApiResultPlusKnowledgeBaseVO) client.post(ApiPaths.backendPath("/knowledge_base/get_detail"), null, params);
    }

    /** List files */
    public PlusApiResultFileListVO listFiles(Map<String, Object> params) throws Exception {
        return (PlusApiResultFileListVO) client.get(ApiPaths.backendPath("/knowledge_base/files"), params);
    }

    /** Upload file */
    public PlusApiResultFileItemVO uploadFile(UploadFilePostRequest body, Map<String, Object> params) throws Exception {
        return (PlusApiResultFileItemVO) client.post(ApiPaths.backendPath("/knowledge_base/files"), body, params, null, "multipart/form-data");
    }

    public PlusApiResultBoolean stop(Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/knowledge_base/chat/stop"), null, params, headers);
    }

    /** Create a chat completion with Knowledge base */
    public ChatCompletionChunk createCompletions(ChatCompletionCreateForm body, Map<String, Object> params, Map<String, String> headers) throws Exception {
        return (ChatCompletionChunk) client.post(ApiPaths.backendPath("/knowledge_base/chat/completions"), body, params, headers);
    }

    /** Get a knowledge base by ID */
    public PlusApiResultPlusKnowledgeBaseVO getById(String id) throws Exception {
        return (PlusApiResultPlusKnowledgeBaseVO) client.get(ApiPaths.backendPath("/knowledge_base/" + id + ""));
    }

    /** Delete a knowledge base */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/knowledge_base/" + id + ""));
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
}
