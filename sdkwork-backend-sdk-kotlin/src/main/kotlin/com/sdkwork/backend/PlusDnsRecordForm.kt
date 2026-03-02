package com.sdkwork.backend

data class PlusDnsRecordForm(
    val domainId: Int? = null,
    val recordName: String? = null,
    val fileName: String? = null,
    val fileContent: String? = null,
    val recordType: String? = null,
    val recordValue: DnsRecordValue? = null,
    val ttl: Int? = null,
    val priority: Int? = null,
    val enabled: Boolean? = null
)
