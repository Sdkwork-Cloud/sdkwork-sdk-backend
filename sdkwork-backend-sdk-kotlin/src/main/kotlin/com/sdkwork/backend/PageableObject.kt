package com.sdkwork.backend

data class PageableObject(
    val offset: Int? = null,
    val paged: Boolean? = null,
    val sort: SortObject? = null,
    val pageSize: Int? = null,
    val pageNumber: Int? = null,
    val unpaged: Boolean? = null
)
