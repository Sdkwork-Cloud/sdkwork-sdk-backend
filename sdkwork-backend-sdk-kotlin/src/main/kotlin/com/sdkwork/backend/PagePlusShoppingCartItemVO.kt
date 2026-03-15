package com.sdkwork.backend

data class PagePlusShoppingCartItemVO(
    val totalElements: Int? = null,
    val totalPages: Int? = null,
    val size: Int? = null,
    val content: List<PlusShoppingCartItemVO>? = null,
    val number: Int? = null,
    val numberOfElements: Int? = null,
    val sort: SortObject? = null,
    val pageable: PageableObject? = null,
    val first: Boolean? = null,
    val last: Boolean? = null,
    val empty: Boolean? = null
)
