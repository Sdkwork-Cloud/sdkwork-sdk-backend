package com.sdkwork.backend

data class QrCodeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val qrKey: String? = null,
    val qrUrl: String? = null,
    val qrContent: String? = null,
    val expireTime: Int? = null
)
