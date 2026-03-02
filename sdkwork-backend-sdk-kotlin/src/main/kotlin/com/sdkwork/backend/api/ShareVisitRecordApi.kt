package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ShareVisitRecordApi(private val client: HttpClient) {

    /** Update visit record */
    suspend fun update(body: PlusShareVisitRecordForm): PlusApiResultPlusShareVisitRecordVO? {
        return client.put(ApiPaths.backendPath("/share/visit_record"), body) as? PlusApiResultPlusShareVisitRecordVO
    }

    /** Create visit record */
    suspend fun create(body: PlusShareVisitRecordForm): PlusApiResultPlusShareVisitRecordVO? {
        return client.post(ApiPaths.backendPath("/share/visit_record"), body) as? PlusApiResultPlusShareVisitRecordVO
    }

    /** Get visit records by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusShareVisitRecordVO? {
        return client.post(ApiPaths.backendPath("/share/visit_record/list"), body, params) as? PlusApiResultPagePlusShareVisitRecordVO
    }

    /** Get all visit records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusShareVisitRecordVO? {
        return client.post(ApiPaths.backendPath("/share/visit_record/list/all"), body) as? PlusApiResultListPlusShareVisitRecordVO
    }

    /** Get visit record by ID */
    suspend fun getById(id: String): PlusApiResultPlusShareVisitRecordVO? {
        return client.get(ApiPaths.backendPath("/share/visit_record/$id")) as? PlusApiResultPlusShareVisitRecordVO
    }

    /** Delete visit record */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/share/visit_record/$id")) as? PlusApiResultBoolean
    }
}
