package com.sdkwork.backend

data class PlusCardVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val cardOrganizationId: Int? = null,
    val cardType: String? = null,
    val codeType: String? = null,
    val title: String? = null,
    val brandName: String? = null,
    val logoUrl: String? = null,
    val notice: String? = null,
    val description: String? = null,
    val color: String? = null,
    val quantity: Int? = null,
    val getLimit: Int? = null,
    val canShare: Boolean? = null,
    val canGiveFriend: Boolean? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val status: String? = null
)
