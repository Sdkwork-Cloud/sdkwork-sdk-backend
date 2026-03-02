package com.sdkwork.backend

data class ProfileItem(
    val name: String? = null,
    val label: String? = null,
    val values: List<String>? = null,
    val custom: Boolean? = null,
    val updateCount: Int? = null,
    val samples: List<String>? = null,
    val description: String? = null
)
