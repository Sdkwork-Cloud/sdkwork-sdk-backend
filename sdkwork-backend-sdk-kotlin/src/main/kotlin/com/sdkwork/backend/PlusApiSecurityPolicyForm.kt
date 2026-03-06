package com.sdkwork.backend

data class PlusApiSecurityPolicyForm(
    val policyCode: String? = null,
    val apiType: String? = null,
    val pathPattern: String? = null,
    val httpMethod: String? = null,
    val matchMode: String? = null,
    val authMode: String? = null,
    val allowAnonymous: Boolean? = null,
    val requiredRoles: String? = null,
    val requiredPermissions: String? = null,
    val priority: Int? = null,
    val enabled: Boolean? = null,
    val description: String? = null
)
