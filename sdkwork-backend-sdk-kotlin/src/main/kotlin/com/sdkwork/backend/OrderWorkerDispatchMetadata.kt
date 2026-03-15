package com.sdkwork.backend

data class OrderWorkerDispatchMetadata(
    val enabledTaskCodes: List<String>? = null,
    val taskConcurrentOverrides: Map<String, Int>? = null
)
