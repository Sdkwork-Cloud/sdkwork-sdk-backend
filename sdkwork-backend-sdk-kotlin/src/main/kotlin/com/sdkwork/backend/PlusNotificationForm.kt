package com.sdkwork.backend

data class PlusNotificationForm(
    val role: String? = null,
    val senderId: Int? = null,
    val sender: Participant? = null,
    val receiverId: Int? = null,
    val receiver: Participant? = null,
    val groupId: Int? = null,
    val title: String? = null,
    val content: String? = null,
    val type: String? = null,
    val channelType: String? = null,
    val templateId: String? = null,
    val templateParams: Map<String, Any>? = null,
    val redirectUrl: String? = null,
    val miniProgramPath: String? = null,
    val status: String? = null,
    val sentAt: String? = null,
    val readAt: String? = null,
    val extraData: Map<String, Any>? = null,
    val retryCount: Int? = null,
    val maxRetryCount: Int? = null,
    val errorMessage: String? = null
)
