package com.sdkwork.backend

data class FilePermission(
    val permissions: List<String>? = null,
    val readOnly: Boolean? = null,
    val permissionSet: List<String>? = null
)
