package com.sdkwork.backend

data class PlusHostDomainForm(
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
    val remark: String? = null
)
