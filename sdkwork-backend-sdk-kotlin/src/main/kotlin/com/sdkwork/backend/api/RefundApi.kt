package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class RefundApi(private val client: HttpClient) {

    /** Update an existing refund record */
    suspend fun update(body: PlusRefundForm): PlusApiResultPlusRefundVO? {
        return client.put(ApiPaths.backendPath("/trade/refund"), body) as? PlusApiResultPlusRefundVO
    }

    /** Create a new refund record */
    suspend fun create(body: PlusRefundForm): PlusApiResultPlusRefundVO? {
        return client.post(ApiPaths.backendPath("/trade/refund"), body) as? PlusApiResultPlusRefundVO
    }

    /** Get refund records by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusRefundVO? {
        return client.post(ApiPaths.backendPath("/trade/refund/list"), body, params) as? PlusApiResultPagePlusRefundVO
    }

    /** Get all refund records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusRefundVO? {
        return client.post(ApiPaths.backendPath("/trade/refund/list/all"), body) as? PlusApiResultListPlusRefundVO
    }

    /** Get a refund record by ID */
    suspend fun getById(id: String): PlusApiResultPlusRefundVO? {
        return client.get(ApiPaths.backendPath("/trade/refund/$id")) as? PlusApiResultPlusRefundVO
    }

    /** Delete a refund record */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/refund/$id")) as? PlusApiResultBoolean
    }
}
