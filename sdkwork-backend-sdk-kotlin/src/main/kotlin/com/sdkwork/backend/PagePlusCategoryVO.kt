package com.sdkwork.backend

data class PagePlusCategoryVO(
    val totalElements: Int? = null,
    val totalPages: Int? = null,
    val size: Int? = null,
    val content: List<PlusCategoryVO>? = null,
    val number: Int? = null,
    val first: Boolean? = null,
    val last: Boolean? = null,
    val numberOfElements: Int? = null,
    val sort: SortObject? = null,
    val pageable: PageableObject? = null,
    val empty: Boolean? = null
)
