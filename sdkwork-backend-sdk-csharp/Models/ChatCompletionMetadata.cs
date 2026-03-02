using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChatCompletionMetadata
    {
        public List<string>? Actions { get; set; }
        public Dictionary<string, object>? Agent { get; set; }
        public int? ParentMessageId { get; set; }
        public string? ParentMessageUuid { get; set; }
    }
}
