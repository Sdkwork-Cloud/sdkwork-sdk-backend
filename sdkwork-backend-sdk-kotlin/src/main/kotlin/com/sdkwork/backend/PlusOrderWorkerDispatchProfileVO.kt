package com.sdkwork.backend

data class PlusOrderWorkerDispatchProfileVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val userId: Int? = null,
    val ratingLevel: String? = null,
    val enabled: Boolean? = null,
    val globalMaxInProgress: Int? = null,
    val metadata: OrderWorkerDispatchMetadata? = null
)
