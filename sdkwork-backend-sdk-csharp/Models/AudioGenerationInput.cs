using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AudioGenerationInput
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
        public string? Text { get; set; }
        public string? Voice { get; set; }
        public int? VoiceSpeakerId { get; set; }
        public string? Language { get; set; }
        public double? Speed { get; set; }
        public double? Pitch { get; set; }
        public int? Volume { get; set; }
        public int? SampleRate { get; set; }
        public int? BitRate { get; set; }
        public int? Channels { get; set; }
        public string? Emotion { get; set; }
        public int? ReferenceAssetCount { get; set; }
    }
}
