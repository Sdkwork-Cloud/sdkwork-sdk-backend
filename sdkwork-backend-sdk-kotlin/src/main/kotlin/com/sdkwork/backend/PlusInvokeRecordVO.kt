package com.sdkwork.backend

data class PlusInvokeRecordVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val type: String? = null,
    val apiEndpoint: String? = null,
    val functionName: String? = null,
    val requestParams: Map<String, Any>? = null,
    val headers: Map<String, Any>? = null,
    val status: String? = null,
    val duration: Int? = null,
    val errorMsg: String? = null,
    val userId: Int? = null,
    val clientIp: String? = null,
    val clientLocation: String? = null,
    val userAgent: String? = null,
    val browserInfo: String? = null,
    val clientId: String? = null
)
