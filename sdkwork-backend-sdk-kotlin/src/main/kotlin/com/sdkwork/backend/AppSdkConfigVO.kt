package com.sdkwork.backend

data class AppSdkConfigVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val platform: String? = null,
    val officialAccount: OfficialAccountSdkConfigVO? = null,
    val miniProgram: MiniProgramSdkConfigVO? = null,
    val app: MobileAppSdkConfigVO? = null
)
