package com.sdkwork.backend

data class PlusAgentSkillPackageVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val tenantId: Int? = null,
    val organizationId: Int? = null,
    val userId: Int? = null,
    val packageKey: String? = null,
    val name: String? = null,
    val summary: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val coverImage: String? = null,
    val categoryId: Int? = null,
    val categoryName: String? = null,
    val tags: List<String>? = null,
    val enabled: Boolean? = null,
    val featured: Boolean? = null,
    val sortWeight: Int? = null,
    val skillCount: Int? = null,
    val latestPublishedAt: String? = null
)
