package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AccountApi(private val client: HttpClient) {

    /** Update an existing account */
    suspend fun update(body: PlusAccountForm): PlusApiResultPlusAccountVO? {
        return client.put(ApiPaths.backendPath("/account"), body) as? PlusApiResultPlusAccountVO
    }

    /** Create a new account */
    suspend fun create(body: PlusAccountForm): PlusApiResultPlusAccountVO? {
        return client.post(ApiPaths.backendPath("/account"), body) as? PlusApiResultPlusAccountVO
    }

    /** Get accounts by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAccountVO? {
        return client.post(ApiPaths.backendPath("/account/list"), body, params) as? PlusApiResultPagePlusAccountVO
    }

    /** Get all accounts */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAccountVO? {
        return client.post(ApiPaths.backendPath("/account/list/all"), body) as? PlusApiResultListPlusAccountVO
    }

    /** Get points account */
    suspend fun getPoints(body: PlusGetAccountForm): PlusApiResultPlusAccountVO? {
        return client.post(ApiPaths.backendPath("/account/get_points"), body) as? PlusApiResultPlusAccountVO
    }

    /** Get cash account */
    suspend fun getCash(body: PlusGetAccountForm): PlusApiResultPlusAccountVO? {
        return client.post(ApiPaths.backendPath("/account/get_cash"), body) as? PlusApiResultPlusAccountVO
    }

    /** Get an account by ID */
    suspend fun getById(id: String): PlusApiResultPlusAccountVO? {
        return client.get(ApiPaths.backendPath("/account/$id")) as? PlusApiResultPlusAccountVO
    }

    /** Delete an account */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/account/$id")) as? PlusApiResultBoolean
    }
}
