package com.sdkwork.backend

data class JsonSchema(
    val name: String? = null,
    val schema: Map<String, Any>? = null,
    val strict: Boolean? = null
)
