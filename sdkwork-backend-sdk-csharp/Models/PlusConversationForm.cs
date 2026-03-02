using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusConversationForm
    {
        public string? Uuid { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public int? UserId { get; set; }
        public string? Status { get; set; }
        public int? AgentId { get; set; }
        public string? Summary { get; set; }
        public int? LastMessageId { get; set; }
        public int? MessageCount { get; set; }
        public TagsContent? Tags { get; set; }
        public string? SystemContext { get; set; }
        public string? UserContext { get; set; }
        public string? LastInteractionTime { get; set; }
        public int? ModelId { get; set; }
        public string? Model { get; set; }
        public int? KnowledgeBaseId { get; set; }
        public int? DataSourceId { get; set; }
        public PlusChatOptions? ChatOptions { get; set; }
        public bool? Pinned { get; set; }
        public int? SortOrder { get; set; }
    }
}
