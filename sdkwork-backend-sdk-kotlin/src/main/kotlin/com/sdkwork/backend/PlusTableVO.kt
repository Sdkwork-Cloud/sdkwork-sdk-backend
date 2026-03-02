package com.sdkwork.backend

data class PlusTableVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val columnCount: Int? = null,
    val rowCount: Int? = null,
    val lastSyncTime: String? = null,
    val primaryKeys: String? = null,
    val engine: String? = null,
    val createSql: String? = null,
    val comment: String? = null,
    val schemaId: Int? = null,
    val schemaName: String? = null,
    val columns: List<PlusColumnVO>? = null
)
