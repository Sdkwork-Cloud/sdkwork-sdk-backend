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

    /** Update an existing coupon template */
    suspend fun updateTemplate(body: PlusCouponTemplateForm): PlusApiResultPlusCouponTemplateVO? {
        return client.put(ApiPaths.backendPath("/coupon/template"), body) as? PlusApiResultPlusCouponTemplateVO
    }

    /** Create a new coupon template */
    suspend fun createTemplate(body: PlusCouponTemplateForm): PlusApiResultPlusCouponTemplateVO? {
        return client.post(ApiPaths.backendPath("/coupon/template"), body) as? PlusApiResultPlusCouponTemplateVO
    }

    /** Exchange coupon by points */
    suspend fun exchangeByPoints(couponId: String, body: CouponPointsExchangeForm): PlusApiResultPlusUserCouponVO? {
        return client.post(ApiPaths.backendPath("/coupon/$couponId/exchange/points"), body) as? PlusApiResultPlusUserCouponVO
    }

    /** Get coupon templates by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCouponTemplateVO? {
        return client.post(ApiPaths.backendPath("/coupon/template/list"), body, params) as? PlusApiResultPagePlusCouponTemplateVO
    }

    /** Get all coupon templates */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusCouponTemplateVO? {
        return client.post(ApiPaths.backendPath("/coupon/template/list/all"), body) as? PlusApiResultListPlusCouponTemplateVO
    }

    /** Redeem coupon */
    suspend fun redeem(body: CouponRedeemForm): PlusApiResultPlusUserCouponVO? {
        return client.post(ApiPaths.backendPath("/coupon/redeem"), body) as? PlusApiResultPlusUserCouponVO
    }

    /** Rollback points exchange coupon */
    suspend fun rollbackPointsExchange(userCouponId: String, body: CouponRollbackForm? = null): PlusApiResultPlusUserCouponVO? {
        return client.post(ApiPaths.backendPath("/coupon/my/$userCouponId/rollback"), body) as? PlusApiResultPlusUserCouponVO
    }

    /** Get coupon templates by page */
    suspend fun createListByPageCoupon(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCouponVO? {
        return client.post(ApiPaths.backendPath("/coupon/list"), body, params) as? PlusApiResultPagePlusCouponVO
    }

    /** Get all coupon templates */
    suspend fun createListAllEntitiesCoupon(body: QueryListForm? = null): PlusApiResultListPlusCouponVO? {
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

    /** Get a coupon template by ID */
    suspend fun getByIdTemplate(id: String): PlusApiResultPlusCouponTemplateVO? {
        return client.get(ApiPaths.backendPath("/coupon/template/$id")) as? PlusApiResultPlusCouponTemplateVO
    }

    /** Delete a coupon template */
    suspend fun deleteTemplate(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/coupon/template/$id")) as? PlusApiResultBoolean
    }
}
