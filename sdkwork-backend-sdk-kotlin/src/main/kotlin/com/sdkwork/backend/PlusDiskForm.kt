package com.sdkwork.backend

data class PlusDiskForm(
    val name: String? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val diskSize: Int? = null,
    val usedSize: Int? = null,
    val description: String? = null
)
