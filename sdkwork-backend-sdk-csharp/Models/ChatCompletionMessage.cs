using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChatCompletionMessage
    {
        public string? Role { get; set; }
        public string? Content { get; set; }
        public ChatCompletionAudio? Audio { get; set; }
        public List<ChatCompletionMessageToolCall>? ToolCalls { get; set; }
    }
}
