package com.sdkwork.backend

data class AppInstallPackage(
    val id: String? = null,
    val name: String? = null,
    val sourceType: String? = null,
    val packageFormat: String? = null,
    val platform: String? = null,
    val url: String? = null,
    val repositoryUrl: String? = null,
    val branch: String? = null,
    val tag: String? = null,
    val commitId: String? = null,
    val checksumAlgorithm: String? = null,
    val checksum: String? = null,
    val architecture: String? = null,
    val sizeBytes: Int? = null,
    val enabled: Boolean? = null
)
