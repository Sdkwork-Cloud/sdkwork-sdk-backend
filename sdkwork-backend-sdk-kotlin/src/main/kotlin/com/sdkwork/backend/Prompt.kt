package com.sdkwork.backend

data class Prompt(
    val contents: String? = null,
    val lastUserOrToolResponseMessage: Message? = null,
    val systemMessages: List<SystemMessage>? = null,
    val userMessages: List<UserMessage>? = null,
    val userMessage: UserMessage? = null,
    val systemMessage: SystemMessage? = null,
    val options: ChatOptions? = null,
    val instructions: List<Message>? = null
)
