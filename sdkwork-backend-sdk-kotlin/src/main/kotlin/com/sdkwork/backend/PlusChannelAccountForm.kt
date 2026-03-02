package com.sdkwork.backend

data class PlusChannelAccountForm(
    val name: String? = null,
    val channel: String? = null,
    val configs: ChannelConfigInfo? = null,
    val status: String? = null,
    val description: String? = null
)
