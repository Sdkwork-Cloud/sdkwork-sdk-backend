using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ContentSegment
    {
        public string? Id { get; set; }
        public int? Order { get; set; }
        public string? Type { get; set; }
        public string? Text { get; set; }
        public int? StartMs { get; set; }
        public int? EndMs { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
    }
}
