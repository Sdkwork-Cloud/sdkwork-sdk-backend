package com.sdkwork.backend

data class PlusColumnForm(
    val name: String? = null,
    val description: String? = null,
    val dataType: String? = null,
    val columnType: String? = null,
    val ordinalPosition: Int? = null,
    val isNullable: Boolean? = null,
    val isPrimaryKey: Boolean? = null,
    val isAutoIncrement: Boolean? = null,
    val defaultValue: String? = null,
    val comment: String? = null,
    val characterSet: String? = null,
    val collationRule: String? = null,
    val tableId: Int? = null
)
