package com.sdkwork.backend

data class PlusChannelAccountQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val channel: String? = null,
    val status: String? = null,
    val resourceType: String? = null,
    val resourceTypes: List<String>? = null
)
