package com.sdkwork.backend

data class PlusNotesPublishArticleForm(
    val noteId: Int? = null,
    val noteUuid: String? = null,
    val title: String? = null,
    val content: String? = null,
    val digest: String? = null,
    val author: String? = null,
    val thumbMediaId: String? = null,
    val contentSourceUrl: String? = null,
    val showCoverPic: Int? = null,
    val needOpenComment: Int? = null,
    val onlyFansCanComment: Int? = null
)
