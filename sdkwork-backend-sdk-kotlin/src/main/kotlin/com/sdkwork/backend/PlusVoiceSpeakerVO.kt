package com.sdkwork.backend

data class PlusVoiceSpeakerVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val voice: String? = null,
    val channelSpeakerId: String? = null,
    val code: String? = null,
    val channel: String? = null,
    val gender: String? = null,
    val ageType: String? = null,
    val type: String? = null,
    val models: List<String>? = null,
    val tags: TagsContent? = null,
    val status: String? = null,
    val description: String? = null
)
