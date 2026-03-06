package com.sdkwork.backend

data class PlusDnsRecordVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val domainId: Int? = null,
    val recordName: String? = null,
    val fileName: String? = null,
    val fileContent: String? = null,
    val recordType: String? = null,
    val recordValue: DnsRecordValue? = null,
    val ttl: Int? = null,
    val priority: Int? = null,
    val enabled: Boolean? = null,
    val recordValues: List<String>? = null,
    val firstRecordValue: String? = null
)
