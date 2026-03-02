package com.sdkwork.backend

data class PlusChannelAccountVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val userId: Int? = null,
    val name: String? = null,
    val channel: String? = null,
    val configs: ChannelConfigInfo? = null,
    val status: String? = null,
    val description: String? = null
)
