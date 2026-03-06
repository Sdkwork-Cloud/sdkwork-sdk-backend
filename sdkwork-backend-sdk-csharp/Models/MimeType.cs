using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MimeType
    {
        public string? Type { get; set; }
        public string? Subtype { get; set; }
        public Dictionary<string, string>? Parameters { get; set; }
        public string? Charset { get; set; }
        public bool? Concrete { get; set; }
        public string? SubtypeSuffix { get; set; }
        public bool? WildcardType { get; set; }
        public bool? WildcardSubtype { get; set; }
    }
}
