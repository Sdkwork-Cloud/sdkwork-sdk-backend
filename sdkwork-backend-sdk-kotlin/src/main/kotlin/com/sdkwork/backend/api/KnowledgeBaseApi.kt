package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class KnowledgeBaseApi(private val client: HttpClient) {

    /** Update an existing knowledge base */
    suspend fun update(body: PlusKnowledgeBaseForm): PlusApiResultPlusKnowledgeBaseVO? {
        return client.put(ApiPaths.backendPath("/knowledge_base"), body) as? PlusApiResultPlusKnowledgeBaseVO
    }

    /** Create a new knowledge base */
    suspend fun create(body: PlusKnowledgeBaseForm): PlusApiResultPlusKnowledgeBaseVO? {
        return client.post(ApiPaths.backendPath("/knowledge_base"), body) as? PlusApiResultPlusKnowledgeBaseVO
    }

    /** Get knowledge bases by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusKnowledgeBaseVO? {
        return client.post(ApiPaths.backendPath("/knowledge_base/list"), body, params) as? PlusApiResultPagePlusKnowledgeBaseVO
    }

    /** Get all knowledge bases */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusKnowledgeBaseVO? {
        return client.post(ApiPaths.backendPath("/knowledge_base/list/all"), body) as? PlusApiResultListPlusKnowledgeBaseVO
    }

    /** Get a knowledge base detail by ID */
    suspend fun getDetail(params: Map<String, Any>? = null): PlusApiResultPlusKnowledgeBaseVO? {
        return client.post(ApiPaths.backendPath("/knowledge_base/get_detail"), null, params) as? PlusApiResultPlusKnowledgeBaseVO
    }

    /** List files */
    suspend fun listFiles(params: Map<String, Any>? = null): PlusApiResultFileListVO? {
        return client.get(ApiPaths.backendPath("/knowledge_base/files"), params) as? PlusApiResultFileListVO
    }

    /** Upload file */
    suspend fun uploadFile(body: UploadFilePostRequest? = null, params: Map<String, Any>? = null): PlusApiResultFileItemVO? {
        return client.post(ApiPaths.backendPath("/knowledge_base/files"), body, params, null, "multipart/form-data") as? PlusApiResultFileItemVO
    }

    suspend fun stop(params: Map<String, Any>? = null, headers: Map<String, String>? = null): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/knowledge_base/chat/stop"), null, params, headers) as? PlusApiResultBoolean
    }

    /** Create a chat completion with Knowledge base */
    suspend fun createCompletions(body: ChatCompletionCreateForm, params: Map<String, Any>? = null, headers: Map<String, String>? = null): ChatCompletionChunk? {
        return client.post(ApiPaths.backendPath("/knowledge_base/chat/completions"), body, params, headers) as? ChatCompletionChunk
    }

    /** Get a knowledge base by ID */
    suspend fun getById(id: String): PlusApiResultPlusKnowledgeBaseVO? {
        return client.get(ApiPaths.backendPath("/knowledge_base/$id")) as? PlusApiResultPlusKnowledgeBaseVO
    }

    /** Delete a knowledge base */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/knowledge_base/$id")) as? PlusApiResultBoolean
    }

    /** Get file */
    suspend fun getFile(fileId: String): PlusApiResultFileItemVO? {
        return client.get(ApiPaths.backendPath("/knowledge_base/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** Delete file */
    suspend fun deleteFile(fileId: String): PlusApiResultFileItemVO? {
        return client.delete(ApiPaths.backendPath("/knowledge_base/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** Get file content */
    suspend fun getFileContent(fileId: String): String? {
        return client.get(ApiPaths.backendPath("/knowledge_base/files/$fileId/content")) as? String
    }
}
