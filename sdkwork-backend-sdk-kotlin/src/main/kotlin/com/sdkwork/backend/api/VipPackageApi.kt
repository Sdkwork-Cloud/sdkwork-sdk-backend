package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VipPackageApi(private val client: HttpClient) {

    /** Update VIP Package */
    suspend fun update(body: PlusVipPackForm): PlusApiResultPlusVipPackVO? {
        return client.put(ApiPaths.backendPath("/vip/pack"), body) as? PlusApiResultPlusVipPackVO
    }

    /** Create VIP Package */
    suspend fun create(body: PlusVipPackForm): PlusApiResultPlusVipPackVO? {
        return client.post(ApiPaths.backendPath("/vip/pack"), body) as? PlusApiResultPlusVipPackVO
    }

    /** Get VIP Packages by Page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipPackVO? {
        return client.post(ApiPaths.backendPath("/vip/pack/list"), body, params) as? PlusApiResultPagePlusVipPackVO
    }

    /** Get All VIP Packages */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVipPackVO? {
        return client.post(ApiPaths.backendPath("/vip/pack/list/all"), body) as? PlusApiResultListPlusVipPackVO
    }

    /** Get VIP Package by ID */
    suspend fun getById(id: String): PlusApiResultPlusVipPackVO? {
        return client.get(ApiPaths.backendPath("/vip/pack/$id")) as? PlusApiResultPlusVipPackVO
    }

    /** Delete VIP Package */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/pack/$id")) as? PlusApiResultBoolean
    }
}
