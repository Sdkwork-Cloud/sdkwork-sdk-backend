package com.sdkwork.backend

data class PlusPptTemplate(
    val tenantId: Int? = null,
    val organizationId: Int? = null,
    val dataScope: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val v: Int? = null,
    val title: String? = null,
    val description: String? = null,
    val coverImages: ImageMediaResourceList? = null,
    val type: String? = null,
    val status: String? = null,
    val authorId: Int? = null,
    val authorName: String? = null,
    val author: PlusUser? = null,
    val tags: PlusPptTemplateTags? = null,
    val meta: PlusPptTemplateMeta? = null,
    val slides: List<PlusPptTemplateSlide>? = null
)
