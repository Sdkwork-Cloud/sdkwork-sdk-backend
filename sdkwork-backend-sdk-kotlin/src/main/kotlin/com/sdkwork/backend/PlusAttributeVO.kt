package com.sdkwork.backend

data class PlusAttributeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val version: Int? = null,
    val name: String? = null,
    val code: String? = null,
    val description: String? = null,
    val type: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val categoryId: Int? = null,
    val attributeValue: String? = null,
    val sortWeight: Int? = null,
    val required: Int? = null,
    val status: String? = null
)
