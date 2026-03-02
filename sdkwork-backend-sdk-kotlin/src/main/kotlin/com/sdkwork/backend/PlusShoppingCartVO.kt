package com.sdkwork.backend

data class PlusShoppingCartVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val groupList: CartGroupList? = null,
    val status: String? = null
)
