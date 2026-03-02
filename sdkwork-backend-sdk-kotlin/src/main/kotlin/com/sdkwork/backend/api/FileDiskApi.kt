package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class FileDiskApi(private val client: HttpClient) {

    /** Update an existing file disk */
    suspend fun update(body: PlusDiskForm): PlusApiResultPlusDiskVO? {
        return client.put(ApiPaths.backendPath("/disk"), body) as? PlusApiResultPlusDiskVO
    }

    /** Create a new file disk */
    suspend fun create(body: PlusDiskForm): PlusApiResultPlusDiskVO? {
        return client.post(ApiPaths.backendPath("/disk"), body) as? PlusApiResultPlusDiskVO
    }

    /** Get file disks by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusDiskVO? {
        return client.post(ApiPaths.backendPath("/disk/list"), body, params) as? PlusApiResultPagePlusDiskVO
    }

    /** Get all file disks */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusDiskVO? {
        return client.post(ApiPaths.backendPath("/disk/list/all"), body) as? PlusApiResultListPlusDiskVO
    }

    /** Get a file disk by ID */
    suspend fun getById(id: String): PlusApiResultPlusDiskVO? {
        return client.get(ApiPaths.backendPath("/disk/$id")) as? PlusApiResultPlusDiskVO
    }

    /** Delete a file disk */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/disk/$id")) as? PlusApiResultBoolean
    }
}
