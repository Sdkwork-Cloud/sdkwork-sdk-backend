using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiGenerationContentForm
    {
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public string? ContentUrl { get; set; }
        public int? FileSize { get; set; }
        public string? ContentFormat { get; set; }
    }
}
