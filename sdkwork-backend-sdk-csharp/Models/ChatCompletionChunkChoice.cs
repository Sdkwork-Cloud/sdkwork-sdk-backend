using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChatCompletionChunkChoice
    {
        public int? Index { get; set; }
        public ChatCompletionChunkDelta? Delta { get; set; }
        public LogProbInfo? Logprobs { get; set; }
        public string? FinishReason { get; set; }
    }
}
