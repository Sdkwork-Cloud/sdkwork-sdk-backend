package com.sdkwork.backend

data class PlusOrganizationForm(
    val name: String? = null,
    val code: String? = null,
    val status: String? = null,
    val description: String? = null,
    val parentId: Int? = null,
    val installAppList: InstallAppList? = null
)
