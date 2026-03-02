package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VipRechargeApi(private val client: HttpClient) {

    /** Update an existing VIP recharge record */
    suspend fun update(body: PlusVipRechargeForm): PlusApiResultPlusVipRechargeVO? {
        return client.put(ApiPaths.backendPath("/vip/recharge"), body) as? PlusApiResultPlusVipRechargeVO
    }

    /** Create a new VIP recharge record */
    suspend fun create(body: PlusVipRechargeForm): PlusApiResultPlusVipRechargeVO? {
        return client.post(ApiPaths.backendPath("/vip/recharge"), body) as? PlusApiResultPlusVipRechargeVO
    }

    /** Get VIP recharge records by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipRechargeVO? {
        return client.post(ApiPaths.backendPath("/vip/recharge/list"), body, params) as? PlusApiResultPagePlusVipRechargeVO
    }

    /** Get all VIP recharge records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVipRechargeVO? {
        return client.post(ApiPaths.backendPath("/vip/recharge/list/all"), body) as? PlusApiResultListPlusVipRechargeVO
    }

    /** Get a VIP recharge record by ID */
    suspend fun getById(id: String): PlusApiResultPlusVipRechargeVO? {
        return client.get(ApiPaths.backendPath("/vip/recharge/$id")) as? PlusApiResultPlusVipRechargeVO
    }

    /** Delete a VIP recharge record */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/recharge/$id")) as? PlusApiResultBoolean
    }
}
