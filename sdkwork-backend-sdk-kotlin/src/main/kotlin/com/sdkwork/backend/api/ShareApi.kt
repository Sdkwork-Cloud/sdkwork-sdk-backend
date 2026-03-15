package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ShareApi(private val client: HttpClient) {

    /** 更新分享 */
    suspend fun update(body: PlusShareForm): PlusApiResultPlusShareVO? {
        return client.put(ApiPaths.backendPath("/share"), body) as? PlusApiResultPlusShareVO
    }

    /** 创建分享 */
    suspend fun create(body: PlusShareForm): PlusApiResultPlusShareVO? {
        return client.post(ApiPaths.backendPath("/share"), body) as? PlusApiResultPlusShareVO
    }

    /** Update visit record */
    suspend fun updateVisitRecord(body: PlusShareVisitRecordForm): PlusApiResultPlusShareVisitRecordVO? {
        return client.put(ApiPaths.backendPath("/share/visit_record"), body) as? PlusApiResultPlusShareVisitRecordVO
    }

    /** Create visit record */
    suspend fun createVisitRecord(body: PlusShareVisitRecordForm): PlusApiResultPlusShareVisitRecordVO? {
        return client.post(ApiPaths.backendPath("/share/visit_record"), body) as? PlusApiResultPlusShareVisitRecordVO
    }

    /** Get visit records by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusShareVisitRecordVO? {
        return client.post(ApiPaths.backendPath("/share/visit_record/list"), body, params) as? PlusApiResultPagePlusShareVisitRecordVO
    }

    /** Get all visit records */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusShareVisitRecordVO? {
        return client.post(ApiPaths.backendPath("/share/visit_record/list/all"), body) as? PlusApiResultListPlusShareVisitRecordVO
    }

    /** 分页获取分享 */
    suspend fun createListByPageShare(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusShareVO? {
        return client.post(ApiPaths.backendPath("/share/list"), body, params) as? PlusApiResultPagePlusShareVO
    }

    /** 获取所有分享 */
    suspend fun createListAllEntitiesShare(body: QueryListForm? = null): PlusApiResultListPlusShareVO? {
        return client.post(ApiPaths.backendPath("/share/list/all"), body) as? PlusApiResultListPlusShareVO
    }

    /** 获取分享详情 */
    suspend fun getById(id: String): PlusApiResultPlusShareVO? {
        return client.get(ApiPaths.backendPath("/share/$id")) as? PlusApiResultPlusShareVO
    }

    /** 删除分享 */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/share/$id")) as? PlusApiResultBoolean
    }

    /** Get visit record by ID */
    suspend fun getByIdVisitRecord(id: String): PlusApiResultPlusShareVisitRecordVO? {
        return client.get(ApiPaths.backendPath("/share/visit_record/$id")) as? PlusApiResultPlusShareVisitRecordVO
    }

    /** Delete visit record */
    suspend fun deleteVisitRecord(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/share/visit_record/$id")) as? PlusApiResultBoolean
    }
}
