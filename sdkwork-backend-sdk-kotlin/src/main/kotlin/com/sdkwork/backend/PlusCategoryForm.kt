package com.sdkwork.backend

data class PlusCategoryForm(
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val icon: String? = null,
    val sortWeight: Int? = null,
    val parentId: Int? = null,
    val path: List<String>? = null,
    val visible: Int? = null,
    val status: String? = null
)
