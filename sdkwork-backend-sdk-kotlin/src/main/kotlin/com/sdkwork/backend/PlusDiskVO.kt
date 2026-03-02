package com.sdkwork.backend

data class PlusDiskVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val name: String? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val diskSize: Int? = null,
    val usedSize: Int? = null,
    val description: String? = null,
    val remainingSize: Int? = null,
    val usageRate: Double? = null
)
