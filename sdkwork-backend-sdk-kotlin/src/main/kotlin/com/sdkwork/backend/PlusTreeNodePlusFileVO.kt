package com.sdkwork.backend

data class PlusTreeNodePlusFileVO(
    val data: PlusFileVO? = null,
    val parent: PlusTreeNodePlusFileVO? = null,
    val children: List<PlusTreeNodePlusFileVO>? = null,
    val index: Int? = null,
    val root: Boolean? = null,
    val leaf: Boolean? = null,
    val depth: Int? = null,
    val childrenCount: Int? = null
)
