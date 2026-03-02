package com.sdkwork.backend

data class GetUserInfoResponse(
    val userId: String? = null,
    val openId: String? = null,
    val unionId: String? = null,
    val username: String? = null,
    val email: String? = null,
    val emailVerified: Boolean? = null,
    val fullName: String? = null,
    val avatarUrl: String? = null,
    val gender: String? = null,
    val nickname: String? = null,
    val sex: Int? = null,
    val city: String? = null,
    val province: String? = null,
    val country: String? = null,
    val privileges: List<String>? = null,
    val bio: String? = null,
    val blog: String? = null,
    val location: String? = null,
    val company: String? = null,
    val firstName: String? = null,
    val lastName: String? = null,
    val locale: String? = null,
    val mobile: String? = null,
    val jobTitle: String? = null,
    val officeLocation: String? = null
)
