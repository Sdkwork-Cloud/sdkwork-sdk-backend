package com.sdkwork.backend

data class PlusAgentSkillPackageForm(
    val userId: Int? = null,
    val packageKey: String? = null,
    val name: String? = null,
    val summary: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val coverImage: String? = null,
    val categoryId: Int? = null,
    val enabled: Boolean? = null,
    val featured: Boolean? = null,
    val sortWeight: Int? = null,
    val tags: List<String>? = null
)
