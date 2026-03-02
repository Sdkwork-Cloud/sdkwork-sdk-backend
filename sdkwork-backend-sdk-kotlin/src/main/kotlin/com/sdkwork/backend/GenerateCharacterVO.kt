package com.sdkwork.backend

data class GenerateCharacterVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val requestId: String? = null,
    val taskId: String? = null,
    val taskStatus: String? = null,
    val characterImages: List<ImageMediaResource>? = null,
    val characterId: String? = null,
    val characterName: String? = null,
    val characterDescription: String? = null,
    val model: String? = null,
    val duration: Int? = null,
    val errorMessage: String? = null
)
