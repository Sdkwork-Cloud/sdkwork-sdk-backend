package com.sdkwork.backend

data class PlusShareVisitRecordForm(
    val shareId: Int? = null,
    val ipAddress: String? = null,
    val userAgent: String? = null,
    val accessedAt: String? = null,
    val success: Boolean? = null
)
