package com.sdkwork.backend

data class PPTBaseElement(
    val id: String? = null,
    val left: Int? = null,
    val top: Int? = null,
    val lock: Boolean? = null,
    val groupId: String? = null,
    val width: Int? = null,
    val height: Int? = null,
    val rotate: Int? = null,
    val link: PPTElementLink? = null,
    val name: String? = null
)
