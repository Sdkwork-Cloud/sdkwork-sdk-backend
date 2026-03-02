package com.sdkwork.backend

data class EdgeObject(
    val id: String? = null,
    val name: String? = null,
    val description: String? = null,
    val sourceNodeId: String? = null,
    val targetNodeId: String? = null,
    val type: String? = null,
    val condition: Any? = null
)
