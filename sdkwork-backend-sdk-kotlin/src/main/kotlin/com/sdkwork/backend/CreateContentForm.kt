package com.sdkwork.backend

data class CreateContentForm(
    val title: String? = null,
    val type: String? = null,
    val description: String? = null,
    val coverUrl: String? = null
)
