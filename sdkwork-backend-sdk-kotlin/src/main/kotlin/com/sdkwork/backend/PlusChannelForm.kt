package com.sdkwork.backend

data class PlusChannelForm(
    val name: String? = null,
    val channel: String? = null,
    val types: List<String>? = null,
    val supportResources: List<String>? = null,
    val status: String? = null,
    val description: String? = null
)
