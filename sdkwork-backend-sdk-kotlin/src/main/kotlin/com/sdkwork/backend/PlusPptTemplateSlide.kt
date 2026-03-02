package com.sdkwork.backend

data class PlusPptTemplateSlide(
    val tenantId: Int? = null,
    val organizationId: Int? = null,
    val dataScope: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val v: Int? = null,
    val templateId: Int? = null,
    val pptTemplate: PlusPptTemplate? = null,
    val type: PPTSlideType? = null,
    val title: String? = null,
    val description: String? = null,
    val sortOrder: Int? = null,
    val layoutType: String? = null,
    val slideConfig: PlusPptSlide? = null,
    val payload: PlusPptPayload? = null,
    val pptturningMode: PPTTurningMode? = null
)
