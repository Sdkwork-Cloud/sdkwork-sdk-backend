package com.sdkwork.backend

data class PlusUserProfileVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val faceImage: ImageMediaResource? = null,
    val faceVideo: VideoMediaResource? = null,
    val username: String? = null,
    val nickname: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val gender: String? = null,
    val status: String? = null,
    val countryCode: String? = null,
    val provinceCode: String? = null,
    val cityCode: String? = null,
    val districtCode: String? = null,
    val address: String? = null,
    val bio: String? = null,
    val birthDate: String? = null,
    val socialInfoList: SocialInfoList? = null
)
