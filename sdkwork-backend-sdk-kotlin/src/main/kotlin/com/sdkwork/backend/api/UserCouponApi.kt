package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class UserCouponApi(private val client: HttpClient) {

    /** Update an existing user coupon */
    suspend fun update(body: PlusUserCouponForm): PlusApiResultPlusUserCouponVO? {
        return client.put(ApiPaths.backendPath("/user/coupon"), body) as? PlusApiResultPlusUserCouponVO
    }

    /** Create a new user coupon */
    suspend fun create(body: PlusUserCouponForm): PlusApiResultPlusUserCouponVO? {
        return client.post(ApiPaths.backendPath("/user/coupon"), body) as? PlusApiResultPlusUserCouponVO
    }

    /** Get user coupons by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusUserCouponVO? {
        return client.post(ApiPaths.backendPath("/user/coupon/list"), body, params) as? PlusApiResultPagePlusUserCouponVO
    }

    /** Get all user coupons */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusUserCouponVO? {
        return client.post(ApiPaths.backendPath("/user/coupon/list/all"), body) as? PlusApiResultListPlusUserCouponVO
    }

    /** Get a user coupon by ID */
    suspend fun getById(id: String): PlusApiResultPlusUserCouponVO? {
        return client.get(ApiPaths.backendPath("/user/coupon/$id")) as? PlusApiResultPlusUserCouponVO
    }

    /** Delete a user coupon */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/user/coupon/$id")) as? PlusApiResultBoolean
    }
}
