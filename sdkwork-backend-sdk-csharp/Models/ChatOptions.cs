using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChatOptions
    {
        public string? Model { get; set; }
        public double? Temperature { get; set; }
        public double? TopP { get; set; }
        public int? TopK { get; set; }
        public int? MaxTokens { get; set; }
        public List<string>? StopSequences { get; set; }
        public double? FrequencyPenalty { get; set; }
        public double? PresencePenalty { get; set; }
    }
}
