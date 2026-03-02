using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChatCompletionMessageToolCall
    {
        public string? Id { get; set; }
        public string? Type { get; set; }
        public FunctionCall? Function { get; set; }
    }
}
