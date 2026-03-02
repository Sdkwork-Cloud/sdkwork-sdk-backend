package com.sdkwork.backend

data class ContentVoteForm(
    val contentType: String? = null,
    val rating: String? = null,
    val contentId: Int? = null,
    val metadata: ContentVoteMetadata? = null
)
