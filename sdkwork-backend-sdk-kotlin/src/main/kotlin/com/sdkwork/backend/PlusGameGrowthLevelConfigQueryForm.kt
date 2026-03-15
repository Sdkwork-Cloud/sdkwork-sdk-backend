package com.sdkwork.backend

data class PlusGameGrowthLevelConfigQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val accountType: String? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val seasonKey: String? = null,
    val status: String? = null
)
