using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class BaseGenerationInput
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
        public int? ReferenceAssetCount { get; set; }
    }
}
