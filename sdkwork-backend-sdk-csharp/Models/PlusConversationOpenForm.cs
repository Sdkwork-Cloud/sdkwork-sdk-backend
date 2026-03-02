using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusConversationOpenForm
    {
        public string? ConversationId { get; set; }
        public string? Uuid { get; set; }
        public string? Title { get; set; }
        public int? UserId { get; set; }
        public int? AgentId { get; set; }
        public int? KnowledgeBaseId { get; set; }
        public int? DataSourceId { get; set; }
        public PlusChatOptions? ChatOptions { get; set; }
    }
}
