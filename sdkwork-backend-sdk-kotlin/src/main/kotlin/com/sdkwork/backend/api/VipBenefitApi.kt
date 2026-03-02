package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VipBenefitApi(private val client: HttpClient) {

    /** Update an existing VIP benefit */
    suspend fun update(body: PlusVipBenefitForm): PlusApiResultPlusVipBenefitVO? {
        return client.put(ApiPaths.backendPath("/vip/benefit"), body) as? PlusApiResultPlusVipBenefitVO
    }

    /** Create a new VIP benefit */
    suspend fun create(body: PlusVipBenefitForm): PlusApiResultPlusVipBenefitVO? {
        return client.post(ApiPaths.backendPath("/vip/benefit"), body) as? PlusApiResultPlusVipBenefitVO
    }

    /** Get VIP benefits by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipBenefitVO? {
        return client.post(ApiPaths.backendPath("/vip/benefit/list"), body, params) as? PlusApiResultPagePlusVipBenefitVO
    }

    /** Get all VIP benefits */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVipBenefitVO? {
        return client.post(ApiPaths.backendPath("/vip/benefit/list/all"), body) as? PlusApiResultListPlusVipBenefitVO
    }

    /** Get a VIP benefit by ID */
    suspend fun getById(id: String): PlusApiResultPlusVipBenefitVO? {
        return client.get(ApiPaths.backendPath("/vip/benefit/$id")) as? PlusApiResultPlusVipBenefitVO
    }

    /** Delete a VIP benefit */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/benefit/$id")) as? PlusApiResultBoolean
    }
}
