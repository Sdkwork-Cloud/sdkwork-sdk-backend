package com.sdkwork.backend

data class PlusToolDefinition(
    val id: Int? = null,
    val uuid: String? = null,
    val type: String? = null,
    val name: String? = null,
    val description: String? = null,
    val inputSchema: String? = null,
    val buildIn: Boolean? = null,
    val httpDefinition: HttpApiDefinition? = null
)
