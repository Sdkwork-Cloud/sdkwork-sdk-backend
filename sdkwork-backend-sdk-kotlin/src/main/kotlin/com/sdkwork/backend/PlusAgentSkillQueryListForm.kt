package com.sdkwork.backend

data class PlusAgentSkillQueryListForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val keyword: String? = null,
    val userId: Int? = null,
    val categoryId: Int? = null,
    val packageId: Int? = null,
    val marketStatus: String? = null,
    val visibility: String? = null,
    val sourceType: String? = null,
    val reviewStatus: String? = null,
    val builtin: Boolean? = null,
    val enabled: Boolean? = null,
    val featured: Boolean? = null
)
