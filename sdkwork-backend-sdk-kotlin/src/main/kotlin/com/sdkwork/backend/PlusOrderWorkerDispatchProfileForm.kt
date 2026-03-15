package com.sdkwork.backend

data class PlusOrderWorkerDispatchProfileForm(
    val userId: Int? = null,
    val ratingLevel: String? = null,
    val enabled: Boolean? = null,
    val globalMaxInProgress: Int? = null,
    val metadata: OrderWorkerDispatchMetadata? = null
)
