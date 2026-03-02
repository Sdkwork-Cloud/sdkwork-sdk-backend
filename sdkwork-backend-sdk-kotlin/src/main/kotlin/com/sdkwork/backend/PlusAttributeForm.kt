package com.sdkwork.backend

data class PlusAttributeForm(
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
