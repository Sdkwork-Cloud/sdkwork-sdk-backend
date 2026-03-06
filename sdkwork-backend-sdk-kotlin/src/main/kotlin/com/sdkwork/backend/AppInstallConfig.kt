package com.sdkwork.backend

data class AppInstallConfig(
    val packages: List<AppInstallPackage>? = null,
    val defaultPackageId: String? = null,
    val installCommand: String? = null,
    val launchCommand: String? = null,
    val uninstallCommand: String? = null,
    val metadata: Map<String, Any>? = null
)
