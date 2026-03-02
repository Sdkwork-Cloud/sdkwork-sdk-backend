package com.sdkwork.backend

data class PlusVisitHistoryVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val userId: Int? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val visitCount: Int? = null,
    val lastVisitedAt: String? = null,
    val duration: Int? = null,
    val source: String? = null
)
