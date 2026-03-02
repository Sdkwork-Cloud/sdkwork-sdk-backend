package com.sdkwork.backend

data class LoginResultVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val token: String? = null,
    val refreshToken: String? = null,
    val expiresIn: Int? = null,
    val refreshExpiresIn: Int? = null,
    val userId: Int? = null,
    val user: UserVO? = null
)
