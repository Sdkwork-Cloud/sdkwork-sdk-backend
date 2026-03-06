package com.sdkwork.backend

data class PlusNotesMediaDraftForm(
    val userId: Int? = null,
    val platform: String? = null,
    val product: String? = null,
    val articles: List<PlusNotesPublishArticleForm>? = null
)
