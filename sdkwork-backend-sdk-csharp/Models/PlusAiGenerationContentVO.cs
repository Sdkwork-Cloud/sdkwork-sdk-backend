using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiGenerationContentVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? Version { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public GenerationInputParams? InputParams { get; set; }
        public GenerationOutput? Output { get; set; }
        public string? ContentFormat { get; set; }
        public string? ContentUrl { get; set; }
        public int? FileSize { get; set; }
    }
}
