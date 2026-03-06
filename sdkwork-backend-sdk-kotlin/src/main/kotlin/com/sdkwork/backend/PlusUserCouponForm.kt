package com.sdkwork.backend

data class PlusUserCouponForm(
    val userId: Int? = null,
    val couponId: Int? = null,
    val couponCode: String? = null,
    val acquireAt: String? = null,
    val acquireRequestNo: String? = null,
    val acquireType: String? = null,
    val pointCost: Int? = null,
    val pointsRefunded: Boolean? = null,
    val pointsRefundAt: String? = null,
    val useAt: String? = null,
    val status: String? = null
)
