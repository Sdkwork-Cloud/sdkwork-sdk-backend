package com.sdkwork.backend

data class AppInfoVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val version: String? = null,
    val description: String? = null,
    val projectId: Int? = null,
    val icon: ImageMediaResource? = null,
    val resourceList: AssetMediaResourceList? = null,
    val iconUrl: String? = null,
    val accessUrl: String? = null,
    val status: String? = null,
    val appType: String? = null,
    val platforms: AppPlatforms? = null,
    val installPlatforms: AppPlatforms? = null,
    val installSkill: AppInstallSkill? = null,
    val installConfig: AppInstallConfig? = null,
    val packageName: String? = null,
    val bundleId: String? = null,
    val storeUrl: String? = null,
    val downloadUrl: String? = null,
    val buildTime: String? = null,
    val startTime: String? = null,
    val environment: String? = null
)
