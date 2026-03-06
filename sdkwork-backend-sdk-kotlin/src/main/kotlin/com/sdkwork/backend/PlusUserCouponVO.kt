package com.sdkwork.backend

data class PlusUserCouponVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userId: Int? = null,
    val couponId: Int? = null,
    val couponCode: String? = null,
    val acquireTime: String? = null,
    val acquireRequestNo: String? = null,
    val acquireType: String? = null,
    val pointCost: Int? = null,
    val pointsRefunded: Boolean? = null,
    val pointsRefundAt: String? = null,
    val useTime: String? = null,
    val status: String? = null
)
