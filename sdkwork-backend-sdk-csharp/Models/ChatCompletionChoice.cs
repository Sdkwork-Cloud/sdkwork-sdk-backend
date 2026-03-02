using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChatCompletionChoice
    {
        public int? Index { get; set; }
        public ChatCompletionMessage? Message { get; set; }
        public LogProbInfo? Logprobs { get; set; }
        public string? FinishReason { get; set; }
    }
}
