using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiGenerationVO
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? UserId { get; set; }
        public string? Title { get; set; }
        public string? RequestId { get; set; }
        public string? Type { get; set; }
        public string? Model { get; set; }
        public string? Channel { get; set; }
        public GenerationInput? InputParams { get; set; }
        public GenerationOutput? OutputResult { get; set; }
        public string? Status { get; set; }
        public int? Progress { get; set; }
        public string? ChannelTaskId { get; set; }
        public string? ChannelTaskStatus { get; set; }
        public double? Cost { get; set; }
        public string? ErrorCode { get; set; }
        public string? ErrorMessage { get; set; }
        public int? RetryCount { get; set; }
        public int? MaxRetry { get; set; }
        public string? StartedAt { get; set; }
        public string? CompletedAt { get; set; }
        public int? ConversationId { get; set; }
        public int? MessageId { get; set; }
        public int? ParentId { get; set; }
        public string? BatchId { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
    }
}
