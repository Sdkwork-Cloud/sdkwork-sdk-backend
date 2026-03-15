package com.sdkwork.backend

data class PlusAccountForm(
    val accountType: String? = null,
    val userId: Int? = null,
    val availableBalance: Double? = null,
    val frozenBalance: Double? = null,
    val availablePoints: Int? = null,
    val frozenPoints: Int? = null,
    val status: String? = null
)
