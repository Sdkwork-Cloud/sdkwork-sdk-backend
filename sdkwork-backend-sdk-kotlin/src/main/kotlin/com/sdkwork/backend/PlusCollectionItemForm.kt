package com.sdkwork.backend

data class PlusCollectionItemForm(
    val collectionId: Int? = null,
    val collectionUuid: String? = null,
    val type: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val contentUuid: String? = null,
    val title: String? = null,
    val description: String? = null,
    val position: Int? = null,
    val isPinned: Boolean? = null,
    val tags: String? = null,
    val extraData: String? = null
)
