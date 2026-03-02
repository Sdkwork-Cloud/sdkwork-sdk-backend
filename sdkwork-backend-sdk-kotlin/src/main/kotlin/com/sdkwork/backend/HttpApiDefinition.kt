package com.sdkwork.backend

data class HttpApiDefinition(
    val apiName: String? = null,
    val description: String? = null,
    val baseUrl: String? = null,
    val path: String? = null,
    val method: String? = null,
    val headers: Map<String, String>? = null,
    val parameters: Map<String, Any>? = null,
    val requestFormat: String? = null,
    val responseFormat: String? = null,
    val authenticated: Boolean? = null,
    val timeoutMillis: Int? = null,
    val requestBodyFormat: String? = null,
    val requestBody: Map<String, Any>? = null,
    val authType: String? = null,
    val authParams: Map<String, Any>? = null
)
