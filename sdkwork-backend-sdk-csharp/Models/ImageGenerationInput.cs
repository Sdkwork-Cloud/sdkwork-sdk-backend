using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ImageGenerationInput
    {
        public string? Title { get; set; }
        public string? Prompt { get; set; }
        public string? NegativePrompt { get; set; }
        public List<AssetMediaResource>? ReferenceAssets { get; set; }
        public VideoStoryboard? Storyboard { get; set; }
        public Dictionary<string, object>? Parameters { get; set; }
        public int? N { get; set; }
        public int? Seed { get; set; }
        public string? Format { get; set; }
        public int? Width { get; set; }
        public int? Height { get; set; }
        public string? Size { get; set; }
        public string? Quality { get; set; }
        public string? Style { get; set; }
        public double? CfgScale { get; set; }
        public int? Steps { get; set; }
        public string? Sampler { get; set; }
        public double? Strength { get; set; }
        public bool? SafetyChecker { get; set; }
        public string? AspectRatio { get; set; }
        public int? ReferenceAssetCount { get; set; }
    }
}
