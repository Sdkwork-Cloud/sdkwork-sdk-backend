using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChatContext
    {
        public string? Indent { get; set; }
        public ChatResponseHandler? ResponseHandler { get; set; }
        public ShardingContext? ShardingContext { get; set; }
        public string? ConversationId { get; set; }
        public string? ConversationUuid { get; set; }
        public int? UserId { get; set; }
        public int? KnowledgeBaseId { get; set; }
        public int? AgentId { get; set; }
        public int? FlowId { get; set; }
        public int? DatasourceId { get; set; }
        public int? ParentMessageId { get; set; }
        public bool? SaveAudio { get; set; }
        public List<string>? Modalities { get; set; }
        public PlusChatOptions? ChatOptions { get; set; }
        public List<string>? ResponseChannels { get; set; }
    }
}
