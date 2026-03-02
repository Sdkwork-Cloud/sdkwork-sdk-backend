package com.sdkwork.backend

data class MobileAppSdkConfigVO(
    val packageName: String? = null,
    val version: String? = null,
    val appKey: String? = null,
    val pushToken: String? = null
)
