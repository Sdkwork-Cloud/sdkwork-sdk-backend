package com.sdkwork.backend

data class PlusGameDefinitionQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val code: String? = null,
    val codeLike: String? = null,
    val nameLike: String? = null,
    val gameType: String? = null,
    val category: String? = null,
    val gameModeCode: String? = null,
    val enabled: Boolean? = null,
    val ranked: Boolean? = null,
    val supportsReplay: Boolean? = null,
    val supportsTournament: Boolean? = null
)
