package com.sdkwork.backend

data class PlusCardTemplateForm(
    val name: String? = null,
    val templateCode: String? = null,
    val cardType: String? = null,
    val codeType: String? = null,
    val title: String? = null,
    val description: String? = null,
    val brandName: String? = null,
    val logoUrl: String? = null,
    val notice: String? = null,
    val color: String? = null,
    val quantity: Int? = null,
    val getLimit: Int? = null,
    val canShare: Boolean? = null,
    val canGiveFriend: Boolean? = null,
    val minimumBalance: Double? = null,
    val initialBalance: Double? = null,
    val discountRate: Double? = null,
    val validityType: String? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val validityDays: Int? = null,
    val isDeleted: Boolean? = null
)
