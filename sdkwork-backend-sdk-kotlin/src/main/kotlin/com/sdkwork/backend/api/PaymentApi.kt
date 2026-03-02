package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class PaymentApi(private val client: HttpClient) {

    /** Update an existing payment record */
    suspend fun update(body: PlusPaymentForm): PlusApiResultPlusPaymentVO? {
        return client.put(ApiPaths.backendPath("/trade/payment"), body) as? PlusApiResultPlusPaymentVO
    }

    /** Create a new payment record */
    suspend fun create(body: PlusPaymentForm): PlusApiResultPlusPaymentVO? {
        return client.post(ApiPaths.backendPath("/trade/payment"), body) as? PlusApiResultPlusPaymentVO
    }

    /** Check payment status */
    suspend fun checkPaymentStatus(body: PlusPaymentStatusQueryForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/trade/payment/status"), body) as? PlusApiResultBoolean
    }

    /** Refund payment */
    suspend fun refund(body: PlusRefundForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/trade/payment/refund"), body) as? PlusApiResultBoolean
    }

    /** Get payment records by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusPaymentVO? {
        return client.post(ApiPaths.backendPath("/trade/payment/list"), body, params) as? PlusApiResultPagePlusPaymentVO
    }

    /** Get all payment records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusPaymentVO? {
        return client.post(ApiPaths.backendPath("/trade/payment/list/all"), body) as? PlusApiResultListPlusPaymentVO
    }

    /** Cancel payment */
    suspend fun cancel(body: PlusPaymentCancelForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.backendPath("/trade/payment/cancel"), body) as? PlusApiResultBoolean
    }

    /** Get a payment record by ID */
    suspend fun getById(id: String): PlusApiResultPlusPaymentVO? {
        return client.get(ApiPaths.backendPath("/trade/payment/$id")) as? PlusApiResultPlusPaymentVO
    }

    /** Delete a payment record */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/trade/payment/$id")) as? PlusApiResultBoolean
    }
}
