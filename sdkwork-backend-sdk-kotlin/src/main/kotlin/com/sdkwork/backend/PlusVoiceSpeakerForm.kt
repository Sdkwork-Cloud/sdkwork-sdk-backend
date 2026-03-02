package com.sdkwork.backend

data class PlusVoiceSpeakerForm(
    val name: String? = null,
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
