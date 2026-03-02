using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerationOutput
    {
        public List<AssetMediaResource>? Resources { get; set; }
        public string? PrimaryUrl { get; set; }
        public List<string>? Urls { get; set; }
        public int? DurationMs { get; set; }
        public int? TokenUsage { get; set; }
        public double? Cost { get; set; }
        public string? ModelVersion { get; set; }
        public int? Seed { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public string? CreatedAt { get; set; }
        public int? ResourceCount { get; set; }
        public AssetMediaResource? PrimaryResource { get; set; }
    }
}
