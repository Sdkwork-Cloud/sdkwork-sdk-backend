package com.sdkwork.backend

data class PlusAgent(
    val name: String? = null,
    val id: Int? = null,
    val definition: AgentDefinition? = null,
    val description: String? = null,
    val metadata: AgentMetadata? = null,
    val uuid: String? = null,
    val systemPrompt: Prompt? = null,
    val accountConfig: LlmAccountConfig? = null,
    val tools: List<PromptToolDescription>? = null,
    val executionContext: AgentExecutionContext? = null,
    val chatContext: ChatContext? = null,
    val chatOptions: ChatOptions? = null,
    val instructions: List<String>? = null,
    val faceURL: String? = null,
    val prompts: Map<String, Prompt>? = null,
    val toolCallbackProvider: ToolCallbackProvider? = null,
    val promptPath: String? = null,
    val promptContextOptimizer: PromptContextOptimizer? = null,
    val nextActions: List<String>? = null,
    val chatMemory: IPlusChatMemory? = null
)
