using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusChatMessageForm
    {
        public MessageBody? Content { get; set; }
        public string? Role { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public int? ConversationId { get; set; }
        public int? UserId { get; set; }
        public int? ParentMessageId { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public int? TokenCount { get; set; }
        public int? ProcessingTime { get; set; }
        public bool? IsError { get; set; }
        public string? ErrorCode { get; set; }
        public string? ErrorMessage { get; set; }
        public int? ModelId { get; set; }
        public string? Model { get; set; }
        public double? Temperature { get; set; }
        public bool? UsedRag { get; set; }
        public PlusChatOptions? ChatOptions { get; set; }
    }
}
