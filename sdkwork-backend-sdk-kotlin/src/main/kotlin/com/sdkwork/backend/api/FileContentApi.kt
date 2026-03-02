package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class FileContentApi(private val client: HttpClient) {

    /** Update file content */
    suspend fun update(body: PlusFileContentForm): PlusApiResultPlusFileContentVO? {
        return client.put(ApiPaths.backendPath("/file/content"), body) as? PlusApiResultPlusFileContentVO
    }

    /** Create file content */
    suspend fun create(body: PlusFileContentForm): PlusApiResultPlusFileContentVO? {
        return client.post(ApiPaths.backendPath("/file/content"), body) as? PlusApiResultPlusFileContentVO
    }

    /** Get file contents by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusFileContentVO? {
        return client.post(ApiPaths.backendPath("/file/content/list"), body, params) as? PlusApiResultPagePlusFileContentVO
    }

    /** Get all file contents */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusFileContentVO? {
        return client.post(ApiPaths.backendPath("/file/content/list/all"), body) as? PlusApiResultListPlusFileContentVO
    }

    /** Get file content by ID */
    suspend fun getById(id: String): PlusApiResultPlusFileContentVO? {
        return client.get(ApiPaths.backendPath("/file/content/$id")) as? PlusApiResultPlusFileContentVO
    }

    /** Delete file content */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/file/content/$id")) as? PlusApiResultBoolean
    }
}
