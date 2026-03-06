package com.sdkwork.backend

data class PlusPermissionForm(
    val name: String? = null,
    val code: String? = null,
    val description: String? = null,
    val status: String? = null,
    val sortOrder: Int? = null,
    val resourceUrl: String? = null,
    val httpMethod: String? = null
)
