package com.sdkwork.backend

data class OfficialAccountSdkConfigVO(
    val debug: Boolean? = null,
    val appId: String? = null,
    val timestamp: String? = null,
    val nonceStr: String? = null,
    val signature: String? = null,
    val jsApiList: List<String>? = null
)
