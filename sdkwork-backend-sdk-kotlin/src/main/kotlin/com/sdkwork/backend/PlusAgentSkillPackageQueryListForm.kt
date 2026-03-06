package com.sdkwork.backend

data class PlusAgentSkillPackageQueryListForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val keyword: String? = null,
    val userId: Int? = null,
    val categoryId: Int? = null,
    val enabled: Boolean? = null,
    val featured: Boolean? = null
)
