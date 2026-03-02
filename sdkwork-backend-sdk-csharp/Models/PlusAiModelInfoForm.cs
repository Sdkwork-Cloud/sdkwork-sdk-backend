using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiModelInfoForm
    {
        public string? ObjectId { get; set; }
        public string? Model { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Channel { get; set; }
        public string? ModelVersion { get; set; }
        public string? Family { get; set; }
        public string? ApiEndpoint { get; set; }
        public string? ModelType { get; set; }
        public int? CreatedAt { get; set; }
        public string? OwnedBy { get; set; }
        public ModelLimitInfo? TokenLimit { get; set; }
        public ModelPrice? PriceInfo { get; set; }
        public ModelMetadata? Metadata { get; set; }
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
