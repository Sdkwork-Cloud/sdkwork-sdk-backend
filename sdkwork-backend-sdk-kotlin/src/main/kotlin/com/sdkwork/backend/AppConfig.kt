package com.sdkwork.backend

data class AppConfig(
    val officialAccount: OfficialAccountConfig? = null,
    val publish: AppPublishConfig? = null
)
