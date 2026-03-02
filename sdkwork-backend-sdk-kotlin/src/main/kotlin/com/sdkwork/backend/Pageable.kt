package com.sdkwork.backend

data class Pageable(
    val page: Int? = null,
    val size: Int? = null,
    val sort: List<String>? = null
)
