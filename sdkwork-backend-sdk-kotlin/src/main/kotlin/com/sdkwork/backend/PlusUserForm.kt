package com.sdkwork.backend

data class PlusUserForm(
    val username: String? = null,
    val password: String? = null,
    val salt: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val status: String? = null,
    val roleIds: List<Int>? = null
)
