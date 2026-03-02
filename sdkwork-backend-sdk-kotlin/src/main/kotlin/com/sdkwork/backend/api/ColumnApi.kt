package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ColumnApi(private val client: HttpClient) {

    /** Update column */
    suspend fun update(body: PlusColumnForm): PlusApiResultPlusColumnVO? {
        return client.put(ApiPaths.backendPath("/column"), body) as? PlusApiResultPlusColumnVO
    }

    /** Create column */
    suspend fun create(body: PlusColumnForm): PlusApiResultPlusColumnVO? {
        return client.post(ApiPaths.backendPath("/column"), body) as? PlusApiResultPlusColumnVO
    }

    /** Get columns by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusColumnVO? {
        return client.post(ApiPaths.backendPath("/column/list"), body, params) as? PlusApiResultPagePlusColumnVO
    }

    /** Get all columns */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusColumnVO? {
        return client.post(ApiPaths.backendPath("/column/list/all"), body) as? PlusApiResultListPlusColumnVO
    }

    /** Get column by ID */
    suspend fun getById(id: String): PlusApiResultPlusColumnVO? {
        return client.get(ApiPaths.backendPath("/column/$id")) as? PlusApiResultPlusColumnVO
    }

    /** Delete column */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/column/$id")) as? PlusApiResultBoolean
    }
}
