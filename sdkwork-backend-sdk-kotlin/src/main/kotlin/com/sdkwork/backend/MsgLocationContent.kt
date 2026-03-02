package com.sdkwork.backend

data class MsgLocationContent(
    val content: String? = null,
    val location: GeoPoint? = null,
    val address: String? = null,
    val name: String? = null,
    val radius: Double? = null
)
