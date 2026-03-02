using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AiAgentSystemPrompt
    {
        public string? Title { get; set; }
        public string? Content { get; set; }
    }
}
