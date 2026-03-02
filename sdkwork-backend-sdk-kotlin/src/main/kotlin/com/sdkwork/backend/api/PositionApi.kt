package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class PositionApi(private val client: HttpClient) {

    /** Update an existing position */
    suspend fun update(body: PlusPositionForm): PlusApiResultPlusPositionVO? {
        return client.put(ApiPaths.backendPath("/organization/position"), body) as? PlusApiResultPlusPositionVO
    }

    /** Create a new position */
    suspend fun create(body: PlusPositionForm): PlusApiResultPlusPositionVO? {
        return client.post(ApiPaths.backendPath("/organization/position"), body) as? PlusApiResultPlusPositionVO
    }

    /** Get positions by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusPositionVO? {
        return client.post(ApiPaths.backendPath("/organization/position/list"), body, params) as? PlusApiResultPagePlusPositionVO
    }

    /** Get all positions */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusPositionVO? {
        return client.post(ApiPaths.backendPath("/organization/position/list/all"), body) as? PlusApiResultListPlusPositionVO
    }

    /** Get a position by ID */
    suspend fun getById(id: String): PlusApiResultPlusPositionVO? {
        return client.get(ApiPaths.backendPath("/organization/position/$id")) as? PlusApiResultPlusPositionVO
    }

    /** Delete a position */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/organization/position/$id")) as? PlusApiResultBoolean
    }
}
