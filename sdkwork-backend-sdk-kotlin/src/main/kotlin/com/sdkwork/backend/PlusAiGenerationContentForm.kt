package com.sdkwork.backend

data class PlusAiGenerationContentForm(
    val title: String? = null,
    val description: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val metadata: Map<String, Any>? = null,
    val contentUrl: String? = null,
    val fileSize: Int? = null,
    val contentFormat: String? = null
)
