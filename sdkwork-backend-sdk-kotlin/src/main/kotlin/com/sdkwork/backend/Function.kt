package com.sdkwork.backend

data class Function(
    val description: String? = null,
    val name: String? = null,
    val parameters: Map<String, Any>? = null,
    val strict: Boolean? = null
)
