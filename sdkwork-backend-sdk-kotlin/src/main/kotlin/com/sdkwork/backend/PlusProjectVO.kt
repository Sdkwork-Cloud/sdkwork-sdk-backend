package com.sdkwork.backend

data class PlusProjectVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val name: String? = null,
    val code: String? = null,
    val description: String? = null,
    val status: String? = null,
    val leaderId: Int? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val budgetAmount: Int? = null,
    val isDeleted: Boolean? = null
)
