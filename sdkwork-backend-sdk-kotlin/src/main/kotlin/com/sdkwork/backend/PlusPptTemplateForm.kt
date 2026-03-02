package com.sdkwork.backend

data class PlusPptTemplateForm(
    val title: String? = null,
    val description: String? = null,
    val coverImages: ImageMediaResourceList? = null,
    val type: String? = null,
    val status: String? = null,
    val authorId: Int? = null,
    val authorName: String? = null,
    val tags: PlusPptTemplateTags? = null,
    val meta: PlusPptTemplateMeta? = null,
    val slides: List<PlusPptTemplateSlide>? = null
)
