package com.sdkwork.backend

data class MiniProgramSdkConfigVO(
    val appId: String? = null,
    val timestamp: Int? = null,
    val nonceStr: String? = null,
    val signature: String? = null,
    val jsApiList: List<String>? = null
)
