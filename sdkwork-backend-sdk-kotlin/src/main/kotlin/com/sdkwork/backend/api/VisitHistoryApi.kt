package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VisitHistoryApi(private val client: HttpClient) {

    /** Update Visit History */
    suspend fun update(body: PlusVisitHistoryForm): PlusApiResultPlusVisitHistoryVO? {
        return client.put(ApiPaths.backendPath("/visit_history"), body) as? PlusApiResultPlusVisitHistoryVO
    }

    /** Create Visit History */
    suspend fun create(body: PlusVisitHistoryForm): PlusApiResultPlusVisitHistoryVO? {
        return client.post(ApiPaths.backendPath("/visit_history"), body) as? PlusApiResultPlusVisitHistoryVO
    }

    /** List Visit Histories by Page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVisitHistoryVO? {
        return client.post(ApiPaths.backendPath("/visit_history/list"), body, params) as? PlusApiResultPagePlusVisitHistoryVO
    }

    /** List All Visit Histories */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVisitHistoryVO? {
        return client.post(ApiPaths.backendPath("/visit_history/list/all"), body) as? PlusApiResultListPlusVisitHistoryVO
    }

    /** Get Visit History by ID */
    suspend fun getById(id: String): PlusApiResultPlusVisitHistoryVO? {
        return client.get(ApiPaths.backendPath("/visit_history/$id")) as? PlusApiResultPlusVisitHistoryVO
    }

    /** Delete Visit History */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/visit_history/$id")) as? PlusApiResultBoolean
    }
}
