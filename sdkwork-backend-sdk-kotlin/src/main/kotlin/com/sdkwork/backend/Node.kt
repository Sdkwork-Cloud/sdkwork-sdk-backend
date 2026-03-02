package com.sdkwork.backend

data class Node(
    val id: String? = null,
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val properties: Map<String, Any>? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val agents: List<PlusAgent>? = null
)
