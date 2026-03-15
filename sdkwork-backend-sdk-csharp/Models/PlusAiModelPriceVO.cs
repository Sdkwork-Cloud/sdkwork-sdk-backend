using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiModelPriceVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ObjectId { get; set; }
        public string? Model { get; set; }
        public int? ModelId { get; set; }
        public string? Channel { get; set; }
        public string? ModelKey { get; set; }
        public string? ProductCode { get; set; }
        public string? FeatureCode { get; set; }
        public string? BillingType { get; set; }
        public string? PriceItemType { get; set; }
        public string? TierName { get; set; }
        public int? RulePriority { get; set; }
        public string? Unit { get; set; }
        public double? UnitSize { get; set; }
        public double? Price { get; set; }
        public double? InputPrice { get; set; }
        public double? BatchInputPrice { get; set; }
        public double? CachedInputPrice { get; set; }
        public double? BatchCachedInputPrice { get; set; }
        public double? OutputPrice { get; set; }
        public double? BatchOutputPrice { get; set; }
        public string? Currency { get; set; }
        public double? MinUsage { get; set; }
        public double? MaxUsage { get; set; }
        public string? EffectiveFrom { get; set; }
        public string? EffectiveTo { get; set; }
        public bool? DefaultRule { get; set; }
        public string? Status { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
    }
}
