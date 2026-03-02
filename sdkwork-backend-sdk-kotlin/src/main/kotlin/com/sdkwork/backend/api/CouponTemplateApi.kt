package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class CouponTemplateApi(private val client: HttpClient) {

    /** Update an existing coupon template */
    suspend fun update(body: PlusCouponTemplateForm): PlusApiResultPlusCouponTemplateVO? {
        return client.put(ApiPaths.backendPath("/coupon/template"), body) as? PlusApiResultPlusCouponTemplateVO
    }

    /** Create a new coupon template */
    suspend fun create(body: PlusCouponTemplateForm): PlusApiResultPlusCouponTemplateVO? {
        return client.post(ApiPaths.backendPath("/coupon/template"), body) as? PlusApiResultPlusCouponTemplateVO
    }

    /** Get coupon templates by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCouponTemplateVO? {
        return client.post(ApiPaths.backendPath("/coupon/template/list"), body, params) as? PlusApiResultPagePlusCouponTemplateVO
    }

    /** Get all coupon templates */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusCouponTemplateVO? {
        return client.post(ApiPaths.backendPath("/coupon/template/list/all"), body) as? PlusApiResultListPlusCouponTemplateVO
    }

    /** Get a coupon template by ID */
    suspend fun getById(id: String): PlusApiResultPlusCouponTemplateVO? {
        return client.get(ApiPaths.backendPath("/coupon/template/$id")) as? PlusApiResultPlusCouponTemplateVO
    }

    /** Delete a coupon template */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/coupon/template/$id")) as? PlusApiResultBoolean
    }
}
