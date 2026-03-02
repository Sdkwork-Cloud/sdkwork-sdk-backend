using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusChatMessageVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public MessageBody? Body { get; set; }
        public string? Role { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public int? ConversationId { get; set; }
        public string? ConversationUuid { get; set; }
        public int? UserId { get; set; }
        public int? SenderId { get; set; }
        public Participant? Sender { get; set; }
        public Participant? Receiver { get; set; }
        public int? ReceiverId { get; set; }
        public int? GroupId { get; set; }
        public int? ParentMessageId { get; set; }
        public List<PlusChatMessageVO>? Children { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public int? TokenCount { get; set; }
        public string? SendAt { get; set; }
        public string? ReceiveAt { get; set; }
        public string? ReadAt { get; set; }
        public int? ProcessingTime { get; set; }
        public bool? IsError { get; set; }
        public string? ErrorCode { get; set; }
        public string? ErrorMessage { get; set; }
        public int? ModelId { get; set; }
        public string? Model { get; set; }
        public double? Temperature { get; set; }
        public bool? UsedRag { get; set; }
        public PlusChatOptions? ChatOptions { get; set; }
        public string? ChannelId { get; set; }
        public int? AgentId { get; set; }
        public int? KnowledgeBaseId { get; set; }
        public int? DatasourceId { get; set; }
        public string? AgentType { get; set; }
        public string? AgentBizType { get; set; }
        public string? ChannelMsgId { get; set; }
        public string? ChannelClientMsgId { get; set; }
        public int? ChannelMsgSeq { get; set; }
        public string? ConversationType { get; set; }
        public FeedbackMetadata? FeedbackMetadata { get; set; }
    }
}
