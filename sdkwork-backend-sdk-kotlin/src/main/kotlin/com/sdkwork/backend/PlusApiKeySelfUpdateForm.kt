package com.sdkwork.backend

data class PlusApiKeySelfUpdateForm(
    val name: String? = null,
    val expireTime: String? = null,
    val clearExpireTime: Boolean? = null,
    val description: String? = null
)
