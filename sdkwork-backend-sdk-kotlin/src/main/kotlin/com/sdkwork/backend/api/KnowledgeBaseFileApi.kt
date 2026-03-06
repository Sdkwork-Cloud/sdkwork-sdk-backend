package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class KnowledgeBaseFileApi(private val client: HttpClient) {

    /** List files */
    suspend fun listFiles(params: Map<String, Any>? = null): PlusApiResultFileListVO? {
        return client.get(ApiPaths.backendPath("/knowledge_base/files"), params) as? PlusApiResultFileListVO
    }

    /** Upload file */
    suspend fun uploadFile(body: UploadFilePostRequest? = null, params: Map<String, Any>? = null): PlusApiResultFileItemVO? {
        return client.post(ApiPaths.backendPath("/knowledge_base/files"), body, params, null, "multipart/form-data") as? PlusApiResultFileItemVO
    }

    /** List files */
    suspend fun getListFiles(params: Map<String, Any>? = null): PlusApiResultFileListVO? {
        return client.get(ApiPaths.backendPath("/disk/files"), params) as? PlusApiResultFileListVO
    }

    /** Upload file */
    suspend fun createUploadFile(body: CreateUploadFileRequest? = null, params: Map<String, Any>? = null): PlusApiResultFileItemVO? {
        return client.post(ApiPaths.backendPath("/disk/files"), body, params, null, "multipart/form-data") as? PlusApiResultFileItemVO
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

    /** Get file */
    suspend fun getFileDisk(fileId: String): PlusApiResultFileItemVO? {
        return client.get(ApiPaths.backendPath("/disk/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** Delete file */
    suspend fun deleteFileDisk(fileId: String): PlusApiResultFileItemVO? {
        return client.delete(ApiPaths.backendPath("/disk/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** Get file content */
    suspend fun getFileContentDisk(fileId: String): String? {
        return client.get(ApiPaths.backendPath("/disk/files/$fileId/content")) as? String
    }
}
