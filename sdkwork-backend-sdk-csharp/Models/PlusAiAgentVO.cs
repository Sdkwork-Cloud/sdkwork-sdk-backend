using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiAgentVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Name { get; set; }
        public ImageMediaResource? FaceImage { get; set; }
        public VideoMediaResource? FaceVideo { get; set; }
        public string? Owner { get; set; }
        public int? OwnerId { get; set; }
        public string? Channel { get; set; }
        public string? ChannelId { get; set; }
        public string? Icon { get; set; }
        public string? Description { get; set; }
        public TagsContent? Tags { get; set; }
        public string? Type { get; set; }
        public string? BizType { get; set; }
        public string? Status { get; set; }
        public PlusAiAgentConfig? BaseConfig { get; set; }
        public AgentKnowledgeConfig? KnowledgeConfig { get; set; }
        public AgentMemoryConfig? MemoryConfig { get; set; }
        public SpeechConfig? SpeechConfig { get; set; }
        public AgentToolConfig? ToolConfig { get; set; }
        public TeamAgentMembers? Members { get; set; }
        public int? KnowledgeBaseId { get; set; }
        public int? PromptId { get; set; }
        public int? CategoryId { get; set; }
        public PlusChatOptions? ChatOptions { get; set; }
        public PlusAiAgentConfig? Config { get; set; }
        public int? UsageCount { get; set; }
    }
}
