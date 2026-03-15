package com.sdkwork.backend

data class ServiceOrderVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val orderId: Int? = null,
    val orderSn: String? = null,
    val taskCode: String? = null,
    val dispatchMode: String? = null,
    val dispatchStatus: String? = null,
    val workerUserId: Int? = null,
    val dispatchExpireTime: String? = null,
    val success: Boolean? = null,
    val message: String? = null
)
