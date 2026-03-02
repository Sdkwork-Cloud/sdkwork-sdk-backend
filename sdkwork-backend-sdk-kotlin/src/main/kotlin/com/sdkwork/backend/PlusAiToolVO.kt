package com.sdkwork.backend

data class PlusAiToolVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val status: String? = null,
    val enabled: Boolean? = null,
    val httpApiDefinition: HttpApiDefinition? = null,
    val toolDefinition: PlusToolDefinition? = null
)
