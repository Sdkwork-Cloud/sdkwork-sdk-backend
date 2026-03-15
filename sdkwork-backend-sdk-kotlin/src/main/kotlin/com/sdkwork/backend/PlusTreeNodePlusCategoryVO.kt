package com.sdkwork.backend

data class PlusTreeNodePlusCategoryVO(
    val data: PlusCategoryVO? = null,
    val parent: PlusTreeNodePlusCategoryVO? = null,
    val children: List<PlusTreeNodePlusCategoryVO>? = null,
    val index: Int? = null,
    val root: Boolean? = null,
    val leaf: Boolean? = null,
    val childrenCount: Int? = null,
    val depth: Int? = null
)
