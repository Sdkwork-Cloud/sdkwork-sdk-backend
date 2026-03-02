package com.sdkwork.backend

data class PlusShoppingCartForm(
    val owner: String? = null,
    val ownerId: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val groupList: CartGroupList? = null,
    val status: String? = null
)
