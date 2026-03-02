package com.sdkwork.backend

data class PlusPptTemplateSlideVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val templateId: Int? = null,
    val sectionTitle: String? = null,
    val sectionContent: String? = null,
    val pageNumber: Int? = null,
    val layoutType: String? = null,
    val backgroundImage: String? = null,
    val sortOrder: Int? = null,
    val isRequired: Boolean? = null
)
