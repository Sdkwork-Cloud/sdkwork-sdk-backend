using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CompletionUsage
    {
        public int? PromptTokens { get; set; }
        public int? CompletionTokens { get; set; }
        public int? TotalTokens { get; set; }
        public int? PromptCacheHitTokens { get; set; }
        public int? PromptCacheMissTokens { get; set; }
        public PromptTokensDetails? PromptTokensDetails { get; set; }
        public CompletionTokensDetails? CompletionTokensDetails { get; set; }
    }
}
