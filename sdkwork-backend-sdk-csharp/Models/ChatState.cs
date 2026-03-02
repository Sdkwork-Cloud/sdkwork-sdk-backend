using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChatState
    {
        public string? Content { get; set; }
        public string? ReasoningContent { get; set; }
        public bool? Thinking { get; set; }
    }
}
