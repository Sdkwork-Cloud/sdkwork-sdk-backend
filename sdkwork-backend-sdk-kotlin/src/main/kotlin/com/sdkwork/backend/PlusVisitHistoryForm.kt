package com.sdkwork.backend

data class PlusVisitHistoryForm(
    val contentType: String? = null,
    val contentId: Int? = null,
    val visitCount: Int? = null,
    val lastVisitedAt: String? = null,
    val duration: Int? = null,
    val source: String? = null
)
