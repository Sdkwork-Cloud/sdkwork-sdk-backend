package com.sdkwork.backend

data class MessageBody(
    val id: String? = null,
    val completion: ChatCompletion? = null,
    val payload: MsgPayload? = null,
    val chunk: ChatCompletionChunk? = null,
    val audioFrame: AudioMediaResource? = null,
    val groupInfos: Map<String, GroupInfo>? = null,
    val groups: Map<String, List<ChatCompletionChunk>>? = null,
    val thinkStart: Int? = null,
    val thinkEnd: Int? = null,
    val state: ChatState? = null
)
