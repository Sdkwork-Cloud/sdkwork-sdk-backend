using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ModelMetadata
    {
        public List<int>? Durations { get; set; }
        public List<string>? Resolutions { get; set; }
        public List<AspectRatio>? Ratios { get; set; }
        public bool? IsMultimodal { get; set; }
        public bool? IsReasoning { get; set; }
        public bool? IsToolCall { get; set; }
    }
}
