package com.sdkwork.backend

data class MemoryProfile(
    val items: List<ProfileItem>? = null,
    val customs: Map<String, List<ProfileItem>>? = null,
    val description: String? = null
)
