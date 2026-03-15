using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiModelInfoVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ObjectId { get; set; }
        public string? Model { get; set; }
        public string? ModelId { get; set; }
        public string? ModelKey { get; set; }
        public string? VendorModel { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Channel { get; set; }
        public string? Vendor { get; set; }
        public string? ModelVersion { get; set; }
        public string? Family { get; set; }
        public string? ApiEndpoint { get; set; }
        public string? ModelType { get; set; }
        public string? PricingType { get; set; }
        public string? LifecycleStage { get; set; }
        public string? ReleaseDate { get; set; }
        public string? DeprecatedAt { get; set; }
        public int? ContextTokens { get; set; }
        public int? MaxInputTokens { get; set; }
        public int? MaxOutputTokens { get; set; }
        public bool? SupportReasoning { get; set; }
        public bool? SupportMultimodal { get; set; }
        public bool? SupportFunctionCall { get; set; }
        public bool? SupportStructuredOutput { get; set; }
        public bool? SupportRealtime { get; set; }
        public bool? SupportFineTuning { get; set; }
        public int? PopularityScore { get; set; }
        public string? OwnedBy { get; set; }
        public SceneContent? Scenes { get; set; }
        public ModelLimitInfo? TokenLimit { get; set; }
        public ModelFunctionInfo? FunctionInfo { get; set; }
        public ModelPrice? PriceInfo { get; set; }
        public ModelMetadata? Metadata { get; set; }
        public Dictionary<string, object>? ProductSupportInfo { get; set; }
        public string? SupportedVoices { get; set; }
        public double? DefaultTemperature { get; set; }
        public double? DefaultTopP { get; set; }
        public double? DefaultFrequencyPenalty { get; set; }
        public double? DefaultPresencePenalty { get; set; }
        public string? Status { get; set; }
        public int? UsageCount { get; set; }
        public int? TotalTokens { get; set; }
        public int? AvgResponseTime { get; set; }
        public TagsContent? Tags { get; set; }
        public string? ConfigParams { get; set; }
    }
}
