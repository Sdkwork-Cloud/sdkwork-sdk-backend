package com.sdkwork.backend

data class PlusCouponTemplateForm(
    val name: String? = null,
    val templateCode: String? = null,
    val type: String? = null,
    val description: String? = null,
    val amount: Int? = null,
    val discount: Double? = null,
    val minConsume: Int? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val total: Int? = null,
    val getLimit: Int? = null,
    val status: String? = null,
    val validityType: String? = null,
    val validityDays: Int? = null,
    val canShare: Boolean? = null,
    val scopeType: String? = null,
    val scopeValue: String? = null
)
