using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class FileContentObject
    {
        public string? SchemaVersion { get; set; }
        public string? Source { get; set; }
        public string? Text { get; set; }
        public Dictionary<string, string>? Contents { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public GenerationContext? Generation { get; set; }
        public List<ContentSegment>? Segments { get; set; }
        public List<AssetReference>? References { get; set; }
    }
}
