using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class UserMessage
    {
        public string? MessageType { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public List<Media>? Media { get; set; }
        public string? Text { get; set; }
    }
}
