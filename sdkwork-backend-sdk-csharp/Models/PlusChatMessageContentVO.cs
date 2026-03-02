using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusChatMessageContentVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? Version { get; set; }
        public string? Role { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public int? ConversationId { get; set; }
        public string? ConversationUuid { get; set; }
        public int? AgentId { get; set; }
        public string? AgentType { get; set; }
        public string? AgentBizType { get; set; }
        public MessageBody? Content { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
    }
}
