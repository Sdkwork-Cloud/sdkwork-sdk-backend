package com.sdkwork.backend

data class VectorAccountConfig(
    val id: Int? = null,
    val uuid: String? = null,
    val region: String? = null,
    val weight: Int? = null,
    val channel: String? = null,
    val product: String? = null,
    val functions: List<String>? = null,
    val metadata: AccountConfigMetadata? = null,
    val properties: Map<String, Any>? = null,
    val dimension: Int? = null,
    val indexType: String? = null,
    val indexName: String? = null,
    val embeddingConfigId: Int? = null,
    val databaseName: String? = null,
    val collectionName: String? = null,
    val embeddingConfig: EmbeddingAccountConfig? = null
)
