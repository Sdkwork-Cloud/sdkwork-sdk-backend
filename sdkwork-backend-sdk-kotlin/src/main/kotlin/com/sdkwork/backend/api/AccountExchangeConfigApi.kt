package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AccountExchangeConfigApi(private val client: HttpClient) {

    /** Get points-to-cash rate */
    suspend fun getPointsToCashRate(): PlusApiResultAccountExchangeRateVO? {
        return client.get(ApiPaths.backendPath("/account/exchange-config/points-cash-rate")) as? PlusApiResultAccountExchangeRateVO
    }

    /** Update points-to-cash rate */
    suspend fun updatePointsToCashRate(body: AccountExchangeRateUpdateForm): PlusApiResultAccountExchangeRateVO? {
        return client.put(ApiPaths.backendPath("/account/exchange-config/points-cash-rate"), body) as? PlusApiResultAccountExchangeRateVO
    }
}
