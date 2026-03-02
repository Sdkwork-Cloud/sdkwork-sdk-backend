package com.sdkwork.backend

data class PlusDiskObject(
    val id: Int? = null,
    val uuid: String? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val name: String? = null,
    val type: String? = null,
    val description: String? = null,
    val diskSize: Int? = null,
    val usedSize: Int? = null
)
