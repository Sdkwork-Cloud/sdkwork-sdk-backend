package com.sdkwork.backend

data class PagePlusAiPromptVO(
    val totalElements: Int? = null,
    val totalPages: Int? = null,
    val size: Int? = null,
    val content: List<PlusAiPromptVO>? = null,
    val number: Int? = null,
    val first: Boolean? = null,
    val last: Boolean? = null,
    val numberOfElements: Int? = null,
    val sort: SortObject? = null,
    val pageable: PageableObject? = null,
    val empty: Boolean? = null
)
