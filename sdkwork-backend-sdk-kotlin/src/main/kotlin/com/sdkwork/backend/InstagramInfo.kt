package com.sdkwork.backend

data class InstagramInfo(
    val userId: String? = null,
    val username: String? = null,
    val fullName: String? = null,
    val profilePictureUrl: String? = null,
    val bio: String? = null,
    val website: String? = null,
    val isBusinessAccount: Boolean? = null
)
