package com.sdkwork.backend

data class CreateServiceOrderForm(
    val publisherUserId: Int? = null,
    val subject: String? = null,
    val taskCode: String? = null,
    val dispatchMode: String? = null,
    val totalAmount: Double? = null,
    val dispatchExpireTime: String? = null,
    val expireTime: String? = null,
    val taskPayload: Map<String, Any>? = null,
    val remark: String? = null
)
