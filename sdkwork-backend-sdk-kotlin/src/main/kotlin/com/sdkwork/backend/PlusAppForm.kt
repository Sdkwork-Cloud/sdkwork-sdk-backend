package com.sdkwork.backend

data class PlusAppForm(
    val name: String? = null,
    val icon: ImageMediaResource? = null,
    val resourceList: AssetMediaResourceList? = null,
    val projectId: Int? = null,
    val description: String? = null,
    val version: String? = null,
    val iconUrl: String? = null,
    val accessUrl: String? = null,
    val config: AppConfig? = null,
    val status: String? = null,
    val appType: String? = null,
    val platforms: AppPlatforms? = null,
    val packageName: String? = null,
    val bundleId: String? = null,
    val storeUrl: String? = null,
    val downloadUrl: String? = null
)
