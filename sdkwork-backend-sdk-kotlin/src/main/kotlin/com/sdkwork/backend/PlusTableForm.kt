package com.sdkwork.backend

data class PlusTableForm(
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
    val schemaId: Int? = null
)
