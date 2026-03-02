package com.sdkwork.backend

data class WechatInfo(
    val openId: String? = null,
    val unionId: String? = null,
    val nickname: String? = null,
    val avatarUrl: String? = null,
    val gender: Int? = null,
    val country: String? = null,
    val province: String? = null,
    val city: String? = null
)
