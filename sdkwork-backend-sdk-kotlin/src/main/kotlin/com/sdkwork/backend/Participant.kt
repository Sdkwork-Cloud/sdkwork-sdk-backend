package com.sdkwork.backend

data class Participant(
    val id: Int? = null,
    val uuid: String? = null,
    val openId: String? = null,
    val unionId: String? = null,
    val name: String? = null,
    val face: ImageMediaResource? = null,
    val deviceId: Int? = null,
    val deviceUuid: String? = null,
    val device: Boolean? = null
)
