package com.sdkwork.backend

data class PlusSchemaVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val status: Int? = null,
    val tableCount: Int? = null,
    val lastSyncTime: String? = null,
    val isDefault: Boolean? = null,
    val datasourceId: Int? = null,
    val tableIds: List<Int>? = null
)
