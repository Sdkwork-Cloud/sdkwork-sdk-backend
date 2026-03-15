package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class SystemApi(private val client: HttpClient) {

    /** Apply invoice */
    suspend fun apply(body: PlusSystemInvoiceApplyForm): PlusApiResultPlusSystemInvoiceVO? {
        return client.post(ApiPaths.backendPath("/system/invoice/apply"), body) as? PlusApiResultPlusSystemInvoiceVO
    }

    /** Query invoice page */
    suspend fun listByPage(params: Map<String, Any>? = null): PlusApiResultPagePlusSystemInvoiceVO? {
        return client.get(ApiPaths.backendPath("/system/invoice/page"), params) as? PlusApiResultPagePlusSystemInvoiceVO
    }
}
