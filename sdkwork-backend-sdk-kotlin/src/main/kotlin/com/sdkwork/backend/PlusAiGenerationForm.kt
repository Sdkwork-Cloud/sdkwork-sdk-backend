package com.sdkwork.backend

data class PlusAiGenerationForm(
    val userId: Int? = null,
    val requestId: String? = null,
    val model: String? = null,
    val channel: String? = null,
    val type: String? = null,
    val cost: Double? = null,
    val status: String? = null
)
