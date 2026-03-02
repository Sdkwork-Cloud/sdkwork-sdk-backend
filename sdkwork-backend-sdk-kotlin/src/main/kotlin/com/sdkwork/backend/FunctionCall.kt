package com.sdkwork.backend

data class FunctionCall(
    val name: String? = null,
    val arguments: Map<String, Any>? = null
)
