using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChatCompletionCreateForm
    {
        public string? Model { get; set; }
        public List<ChatCompletionMessage>? Messages { get; set; }
        public double? Temperature { get; set; }
        public int? N { get; set; }
        public bool? Stream { get; set; }
        public List<string>? Stop { get; set; }
        public string? User { get; set; }
        public string? Tool { get; set; }
        public double? TopP { get; set; }
        public int? MaxTokens { get; set; }
        public double? PresencePenalty { get; set; }
        public double? FrequencyPenalty { get; set; }
        public Dictionary<string, int>? LogitBias { get; set; }
        public bool? ResponseFormat { get; set; }
        public string? SystemFingerprint { get; set; }
        public ChatContext? ChatContext { get; set; }
    }
}
