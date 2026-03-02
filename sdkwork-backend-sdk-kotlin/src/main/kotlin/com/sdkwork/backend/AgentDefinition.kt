package com.sdkwork.backend

data class AgentDefinition(
    val id: Int? = null,
    val uuid: String? = null,
    val name: String? = null,
    val instructions: String? = null,
    val description: String? = null,
    val type: String? = null,
    val bizType: String? = null,
    val agents: TeamAgentMembers? = null,
    val toolConfig: AgentToolConfig? = null,
    val baseConfig: PlusAiAgentConfig? = null,
    val knowledgeConfig: AgentKnowledgeConfig? = null,
    val memoryConfig: AgentMemoryConfig? = null,
    val speechConfig: SpeechConfig? = null,
    val chatOptions: ChatOptions? = null
)
