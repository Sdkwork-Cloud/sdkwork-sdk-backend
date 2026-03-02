package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class FilePartApi(private val client: HttpClient) {

    /** Update an existing file part */
    suspend fun update(body: PlusFilePartForm): PlusApiResultPlusFilePartVO? {
        return client.put(ApiPaths.backendPath("/file/part"), body) as? PlusApiResultPlusFilePartVO
    }

    /** Create a new file part */
    suspend fun create(body: PlusFilePartForm): PlusApiResultPlusFilePartVO? {
        return client.post(ApiPaths.backendPath("/file/part"), body) as? PlusApiResultPlusFilePartVO
    }

    /** Get file parts by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusFilePartVO? {
        return client.post(ApiPaths.backendPath("/file/part/list"), body, params) as? PlusApiResultPagePlusFilePartVO
    }

    /** Get all file parts */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusFilePartVO? {
        return client.post(ApiPaths.backendPath("/file/part/list/all"), body) as? PlusApiResultListPlusFilePartVO
    }

    /** Get a file part by ID */
    suspend fun getById(id: String): PlusApiResultPlusFilePartVO? {
        return client.get(ApiPaths.backendPath("/file/part/$id")) as? PlusApiResultPlusFilePartVO
    }

    /** Delete a file part */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/file/part/$id")) as? PlusApiResultBoolean
    }
}
