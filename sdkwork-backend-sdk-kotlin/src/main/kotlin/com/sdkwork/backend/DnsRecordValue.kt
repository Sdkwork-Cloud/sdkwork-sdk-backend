package com.sdkwork.backend

data class DnsRecordValue(
    val values: List<String>? = null,
    val empty: Boolean? = null,
    val firstValue: String? = null
)
