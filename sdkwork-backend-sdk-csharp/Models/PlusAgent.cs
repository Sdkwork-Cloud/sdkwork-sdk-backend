using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAgent
    {
        public string? Name { get; set; }
        public int? Id { get; set; }
        public AgentDefinition? Definition { get; set; }
        public string? Uuid { get; set; }
        public List<string>? NextActions { get; set; }
        public IPlusChatMemory? ChatMemory { get; set; }
        public AgentExecutionContext? ExecutionContext { get; set; }
        public LlmAccountConfig? AccountConfig { get; set; }
        public ToolCallbackProvider? ToolCallbackProvider { get; set; }
        public PromptContextOptimizer? PromptContextOptimizer { get; set; }
        public string? PromptPath { get; set; }
        public string? Description { get; set; }
        public AgentMetadata? Metadata { get; set; }
        public string? FaceURL { get; set; }
        public Dictionary<string, Prompt>? Prompts { get; set; }
        public Prompt? SystemPrompt { get; set; }
        public List<string>? Instructions { get; set; }
        public ChatOptions? ChatOptions { get; set; }
        public ChatContext? ChatContext { get; set; }
        public List<PromptToolDescription>? Tools { get; set; }
    }
}
