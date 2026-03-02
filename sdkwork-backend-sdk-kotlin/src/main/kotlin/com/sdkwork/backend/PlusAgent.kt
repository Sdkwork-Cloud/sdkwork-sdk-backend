package com.sdkwork.backend

data class PlusAgent(
    val name: String? = null,
    val id: Int? = null,
    val definition: AgentDefinition? = null,
    val uuid: String? = null,
    val nextActions: List<String>? = null,
    val chatMemory: IPlusChatMemory? = null,
    val executionContext: AgentExecutionContext? = null,
    val accountConfig: LlmAccountConfig? = null,
    val toolCallbackProvider: ToolCallbackProvider? = null,
    val promptContextOptimizer: PromptContextOptimizer? = null,
    val promptPath: String? = null,
    val description: String? = null,
    val metadata: AgentMetadata? = null,
    val faceURL: String? = null,
    val prompts: Map<String, Prompt>? = null,
    val systemPrompt: Prompt? = null,
    val instructions: List<String>? = null,
    val chatOptions: ChatOptions? = null,
    val chatContext: ChatContext? = null,
    val tools: List<PromptToolDescription>? = null
)
