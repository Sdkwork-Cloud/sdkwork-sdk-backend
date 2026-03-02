package com.sdkwork.backend

data class PlusOssBucketForm(
    val name: String? = null,
    val region: String? = null,
    val channel: String? = null,
    val channelConfigId: Int? = null,
    val description: String? = null,
    val status: String? = null,
    val creationDate: String? = null,
    val arn: String? = null,
    val endpoint: String? = null,
    val storageClass: String? = null,
    val versioningEnabled: Boolean? = null,
    val encryptionEnabled: Boolean? = null,
    val encryptionType: String? = null,
    val acl: String? = null
)
