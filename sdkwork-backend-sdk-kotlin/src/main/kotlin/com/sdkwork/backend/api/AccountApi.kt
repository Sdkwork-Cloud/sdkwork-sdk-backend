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

    /** Update an existing account history record */
    suspend fun updateHistory(body: PlusAccountHistoryForm): PlusApiResultPlusAccountHistoryVO? {
        return client.put(ApiPaths.backendPath("/account/history"), body) as? PlusApiResultPlusAccountHistoryVO
    }

    /** Create a new account history record */
    suspend fun createHistory(body: PlusAccountHistoryForm): PlusApiResultPlusAccountHistoryVO? {
        return client.post(ApiPaths.backendPath("/account/history"), body) as? PlusApiResultPlusAccountHistoryVO
    }

    /** Get points-to-cash rate */
    suspend fun getPointsToCashRate(): PlusApiResultAccountExchangeRateVO? {
        return client.get(ApiPaths.backendPath("/account/exchange-config/points-cash-rate")) as? PlusApiResultAccountExchangeRateVO
    }

    /** Update points-to-cash rate */
    suspend fun updatePointsToCashRate(body: AccountExchangeRateUpdateForm): PlusApiResultAccountExchangeRateVO? {
        return client.put(ApiPaths.backendPath("/account/exchange-config/points-cash-rate"), body) as? PlusApiResultAccountExchangeRateVO
    }

    /** Get accounts by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAccountVO? {
        return client.post(ApiPaths.backendPath("/account/list"), body, params) as? PlusApiResultPagePlusAccountVO
    }

    /** Get all accounts */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAccountVO? {
        return client.post(ApiPaths.backendPath("/account/list/all"), body) as? PlusApiResultListPlusAccountVO
    }

    /** Get account history records by page */
    suspend fun createListByPageHistory(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAccountHistoryVO? {
        return client.post(ApiPaths.backendPath("/account/history/list"), body, params) as? PlusApiResultPagePlusAccountHistoryVO
    }

    /** Get all account history records */
    suspend fun createListAllEntitiesHistory(body: QueryListForm? = null): PlusApiResultListPlusAccountHistoryVO? {
        return client.post(ApiPaths.backendPath("/account/history/list/all"), body) as? PlusApiResultListPlusAccountHistoryVO
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

    /** Get an account history record by ID */
    suspend fun getByIdHistory(id: String): PlusApiResultPlusAccountHistoryVO? {
        return client.get(ApiPaths.backendPath("/account/history/$id")) as? PlusApiResultPlusAccountHistoryVO
    }

    /** Delete an account history record */
    suspend fun deleteHistory(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/account/history/$id")) as? PlusApiResultBoolean
    }
}
