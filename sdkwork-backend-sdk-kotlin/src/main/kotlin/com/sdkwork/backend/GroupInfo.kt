package com.sdkwork.backend

data class GroupInfo(
    val id: String? = null,
    val object: String? = null,
    val created: Int? = null,
    val model: String? = null,
    val systemFingerprint: String? = null,
    val metadata: ChatCompletionMetadata? = null,
    val agent: PlusAgent? = null
)
