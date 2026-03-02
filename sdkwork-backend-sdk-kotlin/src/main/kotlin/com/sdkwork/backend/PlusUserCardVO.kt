package com.sdkwork.backend

data class PlusUserCardVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userId: Int? = null,
    val cardId: Int? = null,
    val cardCode: String? = null,
    val acquireTime: String? = null,
    val activateTime: String? = null,
    val cancelTime: String? = null,
    val points: Int? = null,
    val balance: Int? = null
)
