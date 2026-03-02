package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class CouponApi(private val client: HttpClient) {

    /** Update an existing coupon template */
    suspend fun update(body: PlusCouponForm): PlusApiResultPlusCouponVO? {
        return client.put(ApiPaths.backendPath("/coupon"), body) as? PlusApiResultPlusCouponVO
    }

    /** Create a new coupon template */
    suspend fun create(body: PlusCouponForm): PlusApiResultPlusCouponVO? {
        return client.post(ApiPaths.backendPath("/coupon"), body) as? PlusApiResultPlusCouponVO
    }

    /** Get coupon templates by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCouponVO? {
        return client.post(ApiPaths.backendPath("/coupon/list"), body, params) as? PlusApiResultPagePlusCouponVO
    }

    /** Get all coupon templates */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusCouponVO? {
        return client.post(ApiPaths.backendPath("/coupon/list/all"), body) as? PlusApiResultListPlusCouponVO
    }

    /** Get a coupon template by ID */
    suspend fun getById(id: String): PlusApiResultPlusCouponVO? {
        return client.get(ApiPaths.backendPath("/coupon/$id")) as? PlusApiResultPlusCouponVO
    }

    /** Delete a coupon template */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/coupon/$id")) as? PlusApiResultBoolean
    }
}
