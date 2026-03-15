using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiModelInfoQueryListForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public string? Keyword { get; set; }
        public string? Channel { get; set; }
        public string? ModelType { get; set; }
        public string? Status { get; set; }
        public string? Family { get; set; }
        public string? Vendor { get; set; }
        public bool? OpenSource { get; set; }
        public string? PricingType { get; set; }
        public string? LifecycleStage { get; set; }
        public int? MinContextTokens { get; set; }
        public bool? SupportReasoning { get; set; }
        public bool? SupportMultimodal { get; set; }
        public bool? SupportFunctionCall { get; set; }
        public bool? SupportRealtime { get; set; }
        public bool? SupportFineTuning { get; set; }
    }
}
