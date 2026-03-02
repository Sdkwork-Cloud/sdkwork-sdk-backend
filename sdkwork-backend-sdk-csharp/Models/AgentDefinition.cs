using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AgentDefinition
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Name { get; set; }
        public string? Instructions { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public string? BizType { get; set; }
        public TeamAgentMembers? Agents { get; set; }
        public AgentToolConfig? ToolConfig { get; set; }
        public PlusAiAgentConfig? BaseConfig { get; set; }
        public AgentKnowledgeConfig? KnowledgeConfig { get; set; }
        public AgentMemoryConfig? MemoryConfig { get; set; }
        public SpeechConfig? SpeechConfig { get; set; }
        public ChatOptions? ChatOptions { get; set; }
    }
}
