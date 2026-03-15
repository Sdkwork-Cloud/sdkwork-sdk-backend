package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class RecordApi(private val client: HttpClient) {

    /** Update an existing invocation record */
    suspend fun update(body: PlusInvokeRecordForm): PlusApiResultPlusInvokeRecordVO? {
        return client.put(ApiPaths.backendPath("/record"), body) as? PlusApiResultPlusInvokeRecordVO
    }

    /** Create a new invocation record */
    suspend fun create(body: PlusInvokeRecordForm): PlusApiResultPlusInvokeRecordVO? {
        return client.post(ApiPaths.backendPath("/record"), body) as? PlusApiResultPlusInvokeRecordVO
    }

    /** Get invocation records by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusInvokeRecordVO? {
        return client.post(ApiPaths.backendPath("/record/list"), body, params) as? PlusApiResultPagePlusInvokeRecordVO
    }

    /** Get all invocation records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusInvokeRecordVO? {
        return client.post(ApiPaths.backendPath("/record/list/all"), body) as? PlusApiResultListPlusInvokeRecordVO
    }

    /** Get an invocation record by ID */
    suspend fun getById(id: String): PlusApiResultPlusInvokeRecordVO? {
        return client.get(ApiPaths.backendPath("/record/$id")) as? PlusApiResultPlusInvokeRecordVO
    }

    /** Delete an invocation record */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/record/$id")) as? PlusApiResultBoolean
    }
}
