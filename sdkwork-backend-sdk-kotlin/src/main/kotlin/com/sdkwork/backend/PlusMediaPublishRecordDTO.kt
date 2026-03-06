package com.sdkwork.backend

data class PlusMediaPublishRecordDTO(
    val id: Int? = null,
    val uuid: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val version: Int? = null,
    val batchId: String? = null,
    val userId: Int? = null,
    val noteId: Int? = null,
    val noteUuid: String? = null,
    val noteTitle: String? = null,
    val platform: String? = null,
    val action: String? = null,
    val status: String? = null,
    val draftMediaId: String? = null,
    val publishId: String? = null,
    val articleId: String? = null,
    val articleIndex: Int? = null,
    val errcode: Int? = null,
    val errmsg: String? = null,
    val requestPayload: Map<String, Any>? = null,
    val responsePayload: Map<String, Any>? = null,
    val startedAt: String? = null,
    val finishedAt: String? = null
)
