package com.sdkwork.backend

data class PlusAiGenerationForm(
    val userId: Int? = null,
    val requestId: String? = null,
    val model: String? = null,
    val channel: String? = null,
    val type: String? = null,
    val coverImages: ImageMediaResourceList? = null,
    val resourceList: AssetMediaResourceList? = null,
    val storyboard: VideoStoryboard? = null,
    val author: AuthorInfo? = null,
    val tags: TagsContent? = null,
    val promptId: Int? = null,
    val channelTaskId: String? = null,
    val channelTaskStatus: String? = null,
    val taskCreatedTime: String? = null,
    val taskUpdatedTime: String? = null,
    val cost: Double? = null,
    val status: String? = null,
    val requestTime: String? = null,
    val responseTime: String? = null,
    val usageRecordId: Int? = null,
    val conversationId: Int? = null,
    val messageId: Int? = null
)
