package com.sdkwork.backend

data class PlusSchemaForm(
    val name: String? = null,
    val description: String? = null,
    val status: Int? = null,
    val tableCount: Int? = null,
    val lastSyncTime: String? = null,
    val isDefault: Boolean? = null,
    val datasourceId: Int? = null
)
