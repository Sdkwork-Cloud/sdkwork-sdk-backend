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

    /** Update an existing file part */
    suspend fun updatePart(body: PlusFilePartForm): PlusApiResultPlusFilePartVO? {
        return client.put(ApiPaths.backendPath("/file/part"), body) as? PlusApiResultPlusFilePartVO
    }

    /** Create a new file part */
    suspend fun createPart(body: PlusFilePartForm): PlusApiResultPlusFilePartVO? {
        return client.post(ApiPaths.backendPath("/file/part"), body) as? PlusApiResultPlusFilePartVO
    }

    /** Update file content */
    suspend fun updateContent(body: PlusFileContentForm): PlusApiResultPlusFileContentVO? {
        return client.put(ApiPaths.backendPath("/file/content"), body) as? PlusApiResultPlusFileContentVO
    }

    /** Create file content */
    suspend fun createContent(body: PlusFileContentForm): PlusApiResultPlusFileContentVO? {
        return client.post(ApiPaths.backendPath("/file/content"), body) as? PlusApiResultPlusFileContentVO
    }

    /** Get file parts by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusFilePartVO? {
        return client.post(ApiPaths.backendPath("/file/part/list"), body, params) as? PlusApiResultPagePlusFilePartVO
    }

    /** Get all file parts */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusFilePartVO? {
        return client.post(ApiPaths.backendPath("/file/part/list/all"), body) as? PlusApiResultListPlusFilePartVO
    }

    /** Get file metadata by page */
    suspend fun createListByPageFile(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusFileVO? {
        return client.post(ApiPaths.backendPath("/file/list"), body, params) as? PlusApiResultPagePlusFileVO
    }

    /** Get all file metadata */
    suspend fun createListAllEntitiesFile(body: QueryListForm? = null): PlusApiResultListPlusFileVO? {
        return client.post(ApiPaths.backendPath("/file/list/all"), body) as? PlusApiResultListPlusFileVO
    }

    /** Get Tree */
    suspend fun getTree(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultSetPlusTreeNodePlusFileVO? {
        return client.post(ApiPaths.backendPath("/file/get_tree"), body, params) as? PlusApiResultSetPlusTreeNodePlusFileVO
    }

    /** Get file contents by page */
    suspend fun createListByPageContent(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusFileContentVO? {
        return client.post(ApiPaths.backendPath("/file/content/list"), body, params) as? PlusApiResultPagePlusFileContentVO
    }

    /** Get all file contents */
    suspend fun createListAllEntitiesContent(body: QueryListForm? = null): PlusApiResultListPlusFileContentVO? {
        return client.post(ApiPaths.backendPath("/file/content/list/all"), body) as? PlusApiResultListPlusFileContentVO
    }

    /** Get file metadata by ID */
    suspend fun getById(id: String): PlusApiResultPlusFileVO? {
        return client.get(ApiPaths.backendPath("/file/$id")) as? PlusApiResultPlusFileVO
    }

    /** Delete file metadata */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/file/$id")) as? PlusApiResultBoolean
    }

    /** Get a file part by ID */
    suspend fun getByIdPart(id: String): PlusApiResultPlusFilePartVO? {
        return client.get(ApiPaths.backendPath("/file/part/$id")) as? PlusApiResultPlusFilePartVO
    }

    /** Delete a file part */
    suspend fun deletePart(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/file/part/$id")) as? PlusApiResultBoolean
    }

    /** Get file content by ID */
    suspend fun getByIdContent(id: String): PlusApiResultPlusFileContentVO? {
        return client.get(ApiPaths.backendPath("/file/content/$id")) as? PlusApiResultPlusFileContentVO
    }

    /** Delete file content */
    suspend fun deleteContent(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/file/content/$id")) as? PlusApiResultBoolean
    }
}
