package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class FileApi(private val client: HttpClient) {

    /** Update existing file metadata */
    suspend fun update(body: PlusFileForm): PlusApiResultPlusFileVO? {
        return client.put(ApiPaths.backendPath("/file"), body) as? PlusApiResultPlusFileVO
    }

    /** Create a new file metadata */
    suspend fun create(body: PlusFileForm): PlusApiResultPlusFileVO? {
        return client.post(ApiPaths.backendPath("/file"), body) as? PlusApiResultPlusFileVO
    }

    /** 获取文件列表 */
    suspend fun listFiles(params: Map<String, Any>? = null): PlusApiResultFileListVO? {
        return client.get(ApiPaths.backendPath("/oss/files"), params) as? PlusApiResultFileListVO
    }

    /** 上传文件 */
    suspend fun upload(body: UploadFileRequest? = null, params: Map<String, Any>? = null): PlusApiResultFileItemVO? {
        return client.post(ApiPaths.backendPath("/oss/files"), body, params, null, "multipart/form-data") as? PlusApiResultFileItemVO
    }

    /** Get upload temporary session */
    suspend fun getTempSession(body: PlusGetTempSessionForm): PlusApiResultPlusTempSessionVO? {
        return client.post(ApiPaths.backendPath("/oss/files/temp_session"), body) as? PlusApiResultPlusTempSessionVO
    }

    /** Generate presigned URL */
    suspend fun getPresignedUrl(body: PlusGetPresignedUrlForm): PlusApiResultGetUrlResult? {
        return client.post(ApiPaths.backendPath("/oss/files/get_presigned_url"), body) as? PlusApiResultGetUrlResult
    }

    /** Upload file */
    suspend fun createFiles(body: PlusUploadForm): PlusApiResultPlusFileVO? {
        return client.post(ApiPaths.backendPath("/oss/files/create"), body) as? PlusApiResultPlusFileVO
    }

    /** Get file metadata by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusFileVO? {
        return client.post(ApiPaths.backendPath("/file/list"), body, params) as? PlusApiResultPagePlusFileVO
    }

    /** Get all file metadata */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusFileVO? {
        return client.post(ApiPaths.backendPath("/file/list/all"), body) as? PlusApiResultListPlusFileVO
    }

    /** Get Tree */
    suspend fun getTree(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultSetPlusTreeNodePlusFileVO? {
        return client.post(ApiPaths.backendPath("/file/get_tree"), body, params) as? PlusApiResultSetPlusTreeNodePlusFileVO
    }

    /** 获取单个文件信息 */
    suspend fun getFile(fileId: String): PlusApiResultFileItemVO? {
        return client.get(ApiPaths.backendPath("/oss/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** 删除文件 */
    suspend fun deleteFile(fileId: String): PlusApiResultFileItemVO? {
        return client.delete(ApiPaths.backendPath("/oss/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** 获取文件内容 */
    suspend fun getFileContent(fileId: String): String? {
        return client.get(ApiPaths.backendPath("/oss/files/$fileId/content")) as? String
    }

    /** Get file metadata by ID */
    suspend fun getById(id: String): PlusApiResultPlusFileVO? {
        return client.get(ApiPaths.backendPath("/file/$id")) as? PlusApiResultPlusFileVO
    }

    /** Delete file metadata */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/file/$id")) as? PlusApiResultBoolean
    }
}
