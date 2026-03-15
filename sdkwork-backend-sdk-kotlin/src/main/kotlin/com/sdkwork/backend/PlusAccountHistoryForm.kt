package com.sdkwork.backend

data class PlusAccountHistoryForm(
    val accountType: String? = null,
    val assetType: String? = null,
    val accountId: Int? = null,
    val transactionId: String? = null,
    val transactionType: String? = null,
    val status: String? = null,
    val amount: Double? = null,
    val balanceBefore: Double? = null,
    val balanceAfter: Double? = null,
    val relatedAccountId: Int? = null,
    val pointsChange: Int? = null,
    val pointsBefore: Int? = null,
    val pointsAfter: Int? = null,
    val sourceType: String? = null,
    val sourceId: String? = null,
    val expiredAt: String? = null,
    val remarks: String? = null
)
