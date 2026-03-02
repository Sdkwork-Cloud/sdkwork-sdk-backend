package com.sdkwork.backend

data class PlusApiResultPlusKnowledgeBaseVO(
    val data: PlusKnowledgeBaseVO? = null,
    val code: String? = null,
    val msg: String? = null,
    val requestId: String? = null,
    val ip: String? = null,
    val hostname: String? = null,
    val errorName: String? = null
)
