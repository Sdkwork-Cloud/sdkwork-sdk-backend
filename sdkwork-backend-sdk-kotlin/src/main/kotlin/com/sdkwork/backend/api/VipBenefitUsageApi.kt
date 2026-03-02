package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VipBenefitUsageApi(private val client: HttpClient) {

    /** Update an existing VIP benefit usage record */
    suspend fun update(body: PlusVipBenefitUsageForm): PlusApiResultPlusVipBenefitUsageVO? {
        return client.put(ApiPaths.backendPath("/vip/benefit/usage"), body) as? PlusApiResultPlusVipBenefitUsageVO
    }

    /** Create a new VIP benefit usage record */
    suspend fun create(body: PlusVipBenefitUsageForm): PlusApiResultPlusVipBenefitUsageVO? {
        return client.post(ApiPaths.backendPath("/vip/benefit/usage"), body) as? PlusApiResultPlusVipBenefitUsageVO
    }

    /** Get VIP benefit usage records by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipBenefitUsageVO? {
        return client.post(ApiPaths.backendPath("/vip/benefit/usage/list"), body, params) as? PlusApiResultPagePlusVipBenefitUsageVO
    }

    /** Get all VIP benefit usage records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVipBenefitUsageVO? {
        return client.post(ApiPaths.backendPath("/vip/benefit/usage/list/all"), body) as? PlusApiResultListPlusVipBenefitUsageVO
    }

    /** Get a VIP benefit usage record by ID */
    suspend fun getById(id: String): PlusApiResultPlusVipBenefitUsageVO? {
        return client.get(ApiPaths.backendPath("/vip/benefit/usage/$id")) as? PlusApiResultPlusVipBenefitUsageVO
    }

    /** Delete a VIP benefit usage record */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/benefit/usage/$id")) as? PlusApiResultBoolean
    }
}
