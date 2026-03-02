using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChatCompletionChunkDelta
    {
        public string? Role { get; set; }
        public string? Content { get; set; }
        public ChatCompletionAudio? Audio { get; set; }
        public string? ReasoningContent { get; set; }
        public List<ChatCompletionMessageToolCall>? ToolCalls { get; set; }
    }
}
