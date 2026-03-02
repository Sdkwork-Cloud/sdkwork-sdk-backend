using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CharacterGenerationInput
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
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Appearance { get; set; }
        public string? Personality { get; set; }
        public string? Background { get; set; }
        public string? Type { get; set; }
        public string? Style { get; set; }
        public string? Pose { get; set; }
        public string? Expression { get; set; }
        public string? Gender { get; set; }
        public string? Age { get; set; }
        public string? Clothing { get; set; }
        public int? Width { get; set; }
        public int? Height { get; set; }
        public bool? Hd { get; set; }
        public bool? MultiView { get; set; }
        public int? ReferenceAssetCount { get; set; }
    }
}
