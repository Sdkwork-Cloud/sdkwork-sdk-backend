package com.sdkwork.backend

data class GetAccessTokenForm(
    val id: Int? = null,
    val platforms: List<String>? = null
)
