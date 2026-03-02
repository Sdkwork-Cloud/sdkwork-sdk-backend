package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VipLevelBenefitApi(private val client: HttpClient) {

    /** Update an existing VIP level benefit */
    suspend fun update(body: PlusVipLevelBenefitForm): PlusApiResultPlusVipLevelBenefitVO? {
        return client.put(ApiPaths.backendPath("/vip/level/benefit"), body) as? PlusApiResultPlusVipLevelBenefitVO
    }

    /** Create a new VIP level benefit */
    suspend fun create(body: PlusVipLevelBenefitForm): PlusApiResultPlusVipLevelBenefitVO? {
        return client.post(ApiPaths.backendPath("/vip/level/benefit"), body) as? PlusApiResultPlusVipLevelBenefitVO
    }

    /** Get VIP level benefits by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipLevelBenefitVO? {
        return client.post(ApiPaths.backendPath("/vip/level/benefit/list"), body, params) as? PlusApiResultPagePlusVipLevelBenefitVO
    }

    /** Get all VIP level benefits */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVipLevelBenefitVO? {
        return client.post(ApiPaths.backendPath("/vip/level/benefit/list/all"), body) as? PlusApiResultListPlusVipLevelBenefitVO
    }

    /** Get a VIP level benefit by ID */
    suspend fun getById(id: String): PlusApiResultPlusVipLevelBenefitVO? {
        return client.get(ApiPaths.backendPath("/vip/level/benefit/$id")) as? PlusApiResultPlusVipLevelBenefitVO
    }

    /** Delete a VIP level benefit */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/level/benefit/$id")) as? PlusApiResultBoolean
    }
}
