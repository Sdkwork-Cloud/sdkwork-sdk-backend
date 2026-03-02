using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class SystemMessage
    {
        public string? MessageType { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public string? Text { get; set; }
    }
}
