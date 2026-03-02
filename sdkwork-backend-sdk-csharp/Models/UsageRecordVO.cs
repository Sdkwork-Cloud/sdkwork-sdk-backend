using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class UsageRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? UserId { get; set; }
        public string? RequestId { get; set; }
        public string? ModelName { get; set; }
        public string? Channel { get; set; }
        public string? UsageType { get; set; }
        public string? BillingType { get; set; }
        public int? PromptTokens { get; set; }
        public int? CompletionTokens { get; set; }
        public int? CachedTokens { get; set; }
        public int? TotalTokens { get; set; }
        public int? CallCount { get; set; }
        public int? ProcessingTime { get; set; }
        public int? ImageCount { get; set; }
        public string? ImageSize { get; set; }
        public int? VideoDuration { get; set; }
        public int? AudioDuration { get; set; }
        public double? Cost { get; set; }
        public string? CurrencyCode { get; set; }
        public string? Status { get; set; }
        public string? RequestTime { get; set; }
        public string? ResponseTime { get; set; }
        public int? PromptId { get; set; }
        public int? ToolId { get; set; }
    }
}
