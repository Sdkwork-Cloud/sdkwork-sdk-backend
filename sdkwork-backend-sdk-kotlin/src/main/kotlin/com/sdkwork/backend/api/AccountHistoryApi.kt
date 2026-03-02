package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AccountHistoryApi(private val client: HttpClient) {

    /** Update an existing account history record */
    suspend fun update(body: PlusAccountHistoryForm): PlusApiResultPlusAccountHistoryVO? {
        return client.put(ApiPaths.backendPath("/account/history"), body) as? PlusApiResultPlusAccountHistoryVO
    }

    /** Create a new account history record */
    suspend fun create(body: PlusAccountHistoryForm): PlusApiResultPlusAccountHistoryVO? {
        return client.post(ApiPaths.backendPath("/account/history"), body) as? PlusApiResultPlusAccountHistoryVO
    }

    /** Get account history records by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAccountHistoryVO? {
        return client.post(ApiPaths.backendPath("/account/history/list"), body, params) as? PlusApiResultPagePlusAccountHistoryVO
    }

    /** Get all account history records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAccountHistoryVO? {
        return client.post(ApiPaths.backendPath("/account/history/list/all"), body) as? PlusApiResultListPlusAccountHistoryVO
    }

    /** Get an account history record by ID */
    suspend fun getById(id: String): PlusApiResultPlusAccountHistoryVO? {
        return client.get(ApiPaths.backendPath("/account/history/$id")) as? PlusApiResultPlusAccountHistoryVO
    }

    /** Delete an account history record */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/account/history/$id")) as? PlusApiResultBoolean
    }
}
