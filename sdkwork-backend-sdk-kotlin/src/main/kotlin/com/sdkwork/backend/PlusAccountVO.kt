package com.sdkwork.backend

data class PlusAccountVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userId: Int? = null,
    val availableBalance: Double? = null,
    val frozenBalance: Double? = null,
    val availablePoints: Int? = null,
    val frozenPoints: Int? = null,
    val status: String? = null,
    val historyList: List<PlusAccountHistoryVO>? = null
)
