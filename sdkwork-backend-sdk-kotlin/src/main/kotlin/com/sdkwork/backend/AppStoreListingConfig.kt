package com.sdkwork.backend

data class AppStoreListingConfig(
    val platform: String? = null,
    val storeAppId: String? = null,
    val packageName: String? = null,
    val bundleId: String? = null,
    val releaseTrack: String? = null,
    val privacyPolicyUrl: String? = null,
    val termsOfServiceUrl: String? = null,
    val supportUrl: String? = null,
    val supportEmail: String? = null,
    val marketingUrl: String? = null,
    val category: String? = null,
    val subcategory: String? = null,
    val contentRating: String? = null,
    val languages: List<String>? = null,
    val countries: List<String>? = null,
    val screenshotUrls: List<String>? = null
)
