package com.sdkwork.backend

data class PlusCard(
    val tenantId: Int? = null,
    val organizationId: Int? = null,
    val dataScope: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val v: Int? = null,
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
