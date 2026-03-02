using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AudioEffectGenerationInput
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
        public string? Description { get; set; }
        public string? Category { get; set; }
        public int? Duration { get; set; }
        public int? SampleRate { get; set; }
        public int? BitRate { get; set; }
        public int? Channels { get; set; }
        public bool? Loop { get; set; }
        public double? FadeIn { get; set; }
        public double? FadeOut { get; set; }
        public int? ReferenceAssetCount { get; set; }
    }
}
