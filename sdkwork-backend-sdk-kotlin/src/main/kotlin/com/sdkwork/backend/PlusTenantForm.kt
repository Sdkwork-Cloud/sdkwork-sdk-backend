package com.sdkwork.backend

data class PlusTenantForm(
    val name: String? = null,
    val code: String? = null,
    val status: String? = null,
    val description: String? = null,
    val adminUserId: Int? = null,
    val expireTime: String? = null,
    val installAppList: InstallAppList? = null
)
