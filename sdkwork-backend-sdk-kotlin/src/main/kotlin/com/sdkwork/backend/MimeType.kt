package com.sdkwork.backend

data class MimeType(
    val type: String? = null,
    val subtype: String? = null,
    val parameters: Map<String, String>? = null,
    val charset: String? = null,
    val concrete: Boolean? = null,
    val subtypeSuffix: String? = null,
    val wildcardType: Boolean? = null,
    val wildcardSubtype: Boolean? = null
)
