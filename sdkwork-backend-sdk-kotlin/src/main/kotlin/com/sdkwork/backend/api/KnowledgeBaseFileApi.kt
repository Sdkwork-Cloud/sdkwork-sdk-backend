package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class KnowledgeBaseFileApi(private val client: HttpClient) {

    /** 获取文件列表 */
    suspend fun listFiles(params: Map<String, Any>? = null): PlusApiResultFileListVO? {
        return client.get(ApiPaths.backendPath("/knowledge_base/files"), params) as? PlusApiResultFileListVO
    }

    /** 上传文件 */
    suspend fun uploadFile(body: UploadFilePostRequest? = null, params: Map<String, Any>? = null): PlusApiResultFileItemVO? {
        return client.post(ApiPaths.backendPath("/knowledge_base/files"), body, params, null, "multipart/form-data") as? PlusApiResultFileItemVO
    }

    /** 获取文件列表 */
    suspend fun getListFiles(params: Map<String, Any>? = null): PlusApiResultFileListVO? {
        return client.get(ApiPaths.backendPath("/disk/files"), params) as? PlusApiResultFileListVO
    }

    /** 上传文件 */
    suspend fun createUploadFile(body: CreateUploadFileRequest? = null, params: Map<String, Any>? = null): PlusApiResultFileItemVO? {
        return client.post(ApiPaths.backendPath("/disk/files"), body, params, null, "multipart/form-data") as? PlusApiResultFileItemVO
    }

    /** 获取单个文件信息 */
    suspend fun getFile(fileId: String): PlusApiResultFileItemVO? {
        return client.get(ApiPaths.backendPath("/knowledge_base/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** 删除文件 */
    suspend fun deleteFile(fileId: String): PlusApiResultFileItemVO? {
        return client.delete(ApiPaths.backendPath("/knowledge_base/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** 获取文件内容 */
    suspend fun getFileContent(fileId: String): String? {
        return client.get(ApiPaths.backendPath("/knowledge_base/files/$fileId/content")) as? String
    }

    /** 获取单个文件信息 */
    suspend fun getFileDisk(fileId: String): PlusApiResultFileItemVO? {
        return client.get(ApiPaths.backendPath("/disk/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** 删除文件 */
    suspend fun deleteFileDisk(fileId: String): PlusApiResultFileItemVO? {
        return client.delete(ApiPaths.backendPath("/disk/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** 获取文件内容 */
    suspend fun getFileContentDisk(fileId: String): String? {
        return client.get(ApiPaths.backendPath("/disk/files/$fileId/content")) as? String
    }
}
