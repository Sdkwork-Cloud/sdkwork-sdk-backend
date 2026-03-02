using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class Message
    {
        public string? MessageType { get; set; }
        public string? Text { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
    }
}
