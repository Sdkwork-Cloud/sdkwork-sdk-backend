package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class OssApi(private val client: HttpClient) {

    /** Update an existing OSS bucket */
    suspend fun update(body: PlusOssBucketForm): PlusApiResultPlusOssBucketVO? {
        return client.put(ApiPaths.backendPath("/oss/bucket"), body) as? PlusApiResultPlusOssBucketVO
    }

    /** Create a new OSS bucket */
    suspend fun create(body: PlusOssBucketForm): PlusApiResultPlusOssBucketVO? {
        return client.post(ApiPaths.backendPath("/oss/bucket"), body) as? PlusApiResultPlusOssBucketVO
    }

    /** List files */
    suspend fun listFiles(params: Map<String, Any>? = null): PlusApiResultFileListVO? {
        return client.get(ApiPaths.backendPath("/oss/files"), params) as? PlusApiResultFileListVO
    }

    /** Upload file */
    suspend fun uploadFile(body: UploadFileRequest? = null, params: Map<String, Any>? = null): PlusApiResultFileItemVO? {
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

    /** Get OSS buckets by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusOssBucketVO? {
        return client.post(ApiPaths.backendPath("/oss/bucket/list"), body, params) as? PlusApiResultPagePlusOssBucketVO
    }

    /** Get all OSS buckets */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusOssBucketVO? {
        return client.post(ApiPaths.backendPath("/oss/bucket/list/all"), body) as? PlusApiResultListPlusOssBucketVO
    }

    /** Get file */
    suspend fun getFile(fileId: String): PlusApiResultFileItemVO? {
        return client.get(ApiPaths.backendPath("/oss/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** Delete file */
    suspend fun deleteFile(fileId: String): PlusApiResultFileItemVO? {
        return client.delete(ApiPaths.backendPath("/oss/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** Get file content */
    suspend fun getFileContent(fileId: String): String? {
        return client.get(ApiPaths.backendPath("/oss/files/$fileId/content")) as? String
    }

    /** Get an OSS bucket by ID */
    suspend fun getById(id: String): PlusApiResultPlusOssBucketVO? {
        return client.get(ApiPaths.backendPath("/oss/bucket/$id")) as? PlusApiResultPlusOssBucketVO
    }

    /** Delete an OSS bucket */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/oss/bucket/$id")) as? PlusApiResultBoolean
    }
}
