package com.sdkwork.backend

data class AuthorInfo(
    val id: Int? = null,
    val faceImage: ImageMediaResource? = null,
    val name: String? = null,
    val email: String? = null,
    val bio: String? = null,
    val website: String? = null
)
