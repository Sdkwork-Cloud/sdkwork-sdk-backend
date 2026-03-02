package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VipRechargePackageApi(private val client: HttpClient) {

    /** Update an existing VIP recharge package */
    suspend fun update(body: PlusVipRechargePackForm): PlusApiResultPlusVipRechargePackVO? {
        return client.put(ApiPaths.backendPath("/vip/recharge/pack"), body) as? PlusApiResultPlusVipRechargePackVO
    }

    /** Create a new VIP recharge package */
    suspend fun create(body: PlusVipRechargePackForm): PlusApiResultPlusVipRechargePackVO? {
        return client.post(ApiPaths.backendPath("/vip/recharge/pack"), body) as? PlusApiResultPlusVipRechargePackVO
    }

    /** Get VIP recharge packages by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipRechargePackVO? {
        return client.post(ApiPaths.backendPath("/vip/recharge/pack/list"), body, params) as? PlusApiResultPagePlusVipRechargePackVO
    }

    /** Get all VIP recharge packages */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVipRechargePackVO? {
        return client.post(ApiPaths.backendPath("/vip/recharge/pack/list/all"), body) as? PlusApiResultListPlusVipRechargePackVO
    }

    /** Get a VIP recharge package by ID */
    suspend fun getById(id: String): PlusApiResultPlusVipRechargePackVO? {
        return client.get(ApiPaths.backendPath("/vip/recharge/pack/$id")) as? PlusApiResultPlusVipRechargePackVO
    }

    /** Delete a VIP recharge package */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/recharge/pack/$id")) as? PlusApiResultBoolean
    }
}
