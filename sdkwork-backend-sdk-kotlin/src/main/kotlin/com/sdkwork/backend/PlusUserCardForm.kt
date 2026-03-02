package com.sdkwork.backend

data class PlusUserCardForm(
    val userId: Int? = null,
    val cardId: Int? = null,
    val cardCode: String? = null,
    val acquireTime: String? = null,
    val activateTime: String? = null,
    val cancelTime: String? = null,
    val points: Int? = null,
    val balance: Int? = null
)
