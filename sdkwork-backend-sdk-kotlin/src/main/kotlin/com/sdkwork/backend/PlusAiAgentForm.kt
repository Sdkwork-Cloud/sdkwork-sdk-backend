package com.sdkwork.backend

data class PlusAiAgentForm(
    val name: String? = null,
    val faceImage: ImageMediaResource? = null,
    val faceVideo: VideoMediaResource? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val channel: String? = null,
    val channelId: String? = null,
    val icon: String? = null,
    val description: String? = null,
    val tags: TagsContent? = null,
    val type: String? = null,
    val bizType: String? = null,
    val status: String? = null,
    val baseConfig: PlusAiAgentConfig? = null,
    val knowledgeConfig: AgentKnowledgeConfig? = null,
    val memoryConfig: AgentMemoryConfig? = null,
    val speechConfig: SpeechConfig? = null,
    val toolConfig: AgentToolConfig? = null,
    val members: TeamAgentMembers? = null,
    val cateId: Int? = null,
    val knowledgeBaseId: Int? = null,
    val chatOptions: PlusChatOptions? = null,
    val prompt: AiAgentSystemPrompt? = null
)
