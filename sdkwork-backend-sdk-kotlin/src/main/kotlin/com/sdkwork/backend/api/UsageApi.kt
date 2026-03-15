package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class UsageApi(private val client: HttpClient) {

    /** Update an existing usage record */
    suspend fun update(body: UsageRecordForm): PlusApiResultUsageRecordVO? {
        return client.put(ApiPaths.backendPath("/usage/record"), body) as? PlusApiResultUsageRecordVO
    }

    /** Create a new usage record */
    suspend fun create(body: UsageRecordForm): PlusApiResultUsageRecordVO? {
        return client.post(ApiPaths.backendPath("/usage/record"), body) as? PlusApiResultUsageRecordVO
    }

    /** Get usage records by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPageUsageRecordVO? {
        return client.post(ApiPaths.backendPath("/usage/record/list"), body, params) as? PlusApiResultPageUsageRecordVO
    }

    /** Get all usage records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListUsageRecordVO? {
        return client.post(ApiPaths.backendPath("/usage/record/list/all"), body) as? PlusApiResultListUsageRecordVO
    }

    /** Get a usage record by ID */
    suspend fun getById(id: String): PlusApiResultUsageRecordVO? {
        return client.get(ApiPaths.backendPath("/usage/record/$id")) as? PlusApiResultUsageRecordVO
    }

    /** Delete a usage record */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/usage/record/$id")) as? PlusApiResultBoolean
    }
}
