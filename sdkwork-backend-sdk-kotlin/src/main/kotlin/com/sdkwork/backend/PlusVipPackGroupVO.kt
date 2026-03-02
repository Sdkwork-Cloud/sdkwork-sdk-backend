package com.sdkwork.backend

data class PlusVipPackGroupVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val appId: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val sortWeight: Int? = null,
    val status: String? = null,
    val remark: String? = null,
    val packs: List<PlusVipPackVO>? = null
)
