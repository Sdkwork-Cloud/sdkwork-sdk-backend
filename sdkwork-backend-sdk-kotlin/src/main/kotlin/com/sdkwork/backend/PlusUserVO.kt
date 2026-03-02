package com.sdkwork.backend

data class PlusUserVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val faceImage: ImageMediaResource? = null,
    val faceVideo: ImageMediaResource? = null,
    val username: String? = null,
    val nickname: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val gender: String? = null,
    val status: String? = null,
    val roleIds: List<Int>? = null,
    val roleNames: List<String>? = null,
    val socialInfoList: SocialInfoList? = null
)
