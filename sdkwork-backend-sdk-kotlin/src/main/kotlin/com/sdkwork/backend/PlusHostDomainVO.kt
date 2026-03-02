package com.sdkwork.backend

data class PlusHostDomainVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val domainName: String? = null,
    val tld: String? = null,
    val registrar: String? = null,
    val ownerId: Int? = null,
    val registeredAt: String? = null,
    val expiredAt: String? = null,
    val status: String? = null,
    val dnsServers: DnsServers? = null,
    val resolutionStatus: String? = null,
    val autoRenew: Boolean? = null,
    val remark: String? = null,
    val dnsRecords: List<PlusDnsRecordVO>? = null
)
