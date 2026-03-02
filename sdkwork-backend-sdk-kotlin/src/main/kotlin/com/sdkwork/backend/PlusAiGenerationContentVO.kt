package com.sdkwork.backend

data class PlusAiGenerationContentVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val version: Int? = null,
    val title: String? = null,
    val description: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val metadata: Map<String, Any>? = null,
    val inputParams: GenerationInputParams? = null,
    val output: GenerationOutput? = null,
    val contentFormat: String? = null,
    val contentUrl: String? = null,
    val fileSize: Int? = null
)
