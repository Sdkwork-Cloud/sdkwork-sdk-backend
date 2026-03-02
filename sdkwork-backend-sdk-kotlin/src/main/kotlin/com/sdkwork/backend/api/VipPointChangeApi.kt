package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VipPointChangeApi(private val client: HttpClient) {

    /** Update an existing VIP point change record */
    suspend fun update(body: PlusVipPointChangeForm): PlusApiResultPlusVipPointChangeVO? {
        return client.put(ApiPaths.backendPath("/vip/point/change"), body) as? PlusApiResultPlusVipPointChangeVO
    }

    /** Create a new VIP point change record */
    suspend fun create(body: PlusVipPointChangeForm): PlusApiResultPlusVipPointChangeVO? {
        return client.post(ApiPaths.backendPath("/vip/point/change"), body) as? PlusApiResultPlusVipPointChangeVO
    }

    /** Get VIP point change records by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipPointChangeVO? {
        return client.post(ApiPaths.backendPath("/vip/point/change/list"), body, params) as? PlusApiResultPagePlusVipPointChangeVO
    }

    /** Get all VIP point change records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVipPointChangeVO? {
        return client.post(ApiPaths.backendPath("/vip/point/change/list/all"), body) as? PlusApiResultListPlusVipPointChangeVO
    }

    /** Get a VIP point change record by ID */
    suspend fun getById(id: String): PlusApiResultPlusVipPointChangeVO? {
        return client.get(ApiPaths.backendPath("/vip/point/change/$id")) as? PlusApiResultPlusVipPointChangeVO
    }

    /** Delete a VIP point change record */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/point/change/$id")) as? PlusApiResultBoolean
    }
}
