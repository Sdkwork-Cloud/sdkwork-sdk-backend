using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MusicGenerationInput
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
        public string? Lyrics { get; set; }
        public int? Duration { get; set; }
        public string? Genre { get; set; }
        public string? Style { get; set; }
        public int? Tempo { get; set; }
        public string? Key { get; set; }
        public string? TimeSignature { get; set; }
        public string? Mood { get; set; }
        public string? Instruments { get; set; }
        public bool? Instrumental { get; set; }
        public bool? Hd { get; set; }
        public int? ReferenceAssetCount { get; set; }
    }
}
