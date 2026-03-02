using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class VideoGenerationInput
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
        public int? Duration { get; set; }
        public int? Fps { get; set; }
        public string? Style { get; set; }
        public string? AspectRatio { get; set; }
        public int? MotionStrength { get; set; }
        public string? CameraMotion { get; set; }
        public bool? Loop { get; set; }
        public bool? Hd { get; set; }
        public bool? Subtitle { get; set; }
        public bool? TextToVideo { get; set; }
        public int? ReferenceAssetCount { get; set; }
    }
}
