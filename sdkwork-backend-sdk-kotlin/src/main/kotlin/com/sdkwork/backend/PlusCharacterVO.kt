package com.sdkwork.backend

data class PlusCharacterVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val name: String? = null,
    val type: String? = null,
    val avatar: ImageMediaResource? = null,
    val threeViewImage: ImageMediaResource? = null,
    val gridShotsImage: ImageMediaResource? = null,
    val avatarVideo: VideoMediaResource? = null,
    val agentId: Int? = null,
    val description: String? = null,
    val status: String? = null,
    val personality: String? = null,
    val background: String? = null,
    val interactionSettings: String? = null,
    val version: String? = null,
    val userId: Int? = null
)
