package com.sdkwork.backend

data class CharacterMediaResource(
    val id: Int? = null,
    val uuid: String? = null,
    val url: String? = null,
    val bytes: String? = null,
    val localFile: Any? = null,
    val base64: String? = null,
    val type: String? = null,
    val mimeType: String? = null,
    val size: Int? = null,
    val name: String? = null,
    val extension: String? = null,
    val tags: TagsContent? = null,
    val metadata: Map<String, Any>? = null,
    val prompt: String? = null,
    val characterType: String? = null,
    val gender: String? = null,
    val ageGroup: String? = null,
    val avatarUrl: String? = null,
    val avatarVideoUrl: String? = null,
    val speakerId: Int? = null,
    val appearanceParams: Map<String, Any>? = null,
    val animationParams: Map<String, Any>? = null
)
