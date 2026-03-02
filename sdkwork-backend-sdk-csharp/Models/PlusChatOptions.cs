using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusChatOptions
    {
        public bool? StreamUsage { get; set; }
        public string? Model { get; set; }
        public double? FrequencyPenalty { get; set; }
        public Dictionary<string, int>? LogitBias { get; set; }
        public bool? Logprobs { get; set; }
        public int? TopLogprobs { get; set; }
        public int? MaxTokens { get; set; }
        public int? MaxCompletionTokens { get; set; }
        public int? N { get; set; }
        public List<string>? Modalities { get; set; }
        public AudioParameters? Audio { get; set; }
        public double? PresencePenalty { get; set; }
        public ResponseFormat? ResponseFormat { get; set; }
        public StreamOptions? StreamOptions { get; set; }
        public bool? Stream { get; set; }
        public int? Seed { get; set; }
        public List<string>? Stop { get; set; }
        public double? Temperature { get; set; }
        public double? TopP { get; set; }
        public List<FunctionTool>? Tools { get; set; }
        public object? ToolChoice { get; set; }
        public string? User { get; set; }
        public bool? ParallelToolCalls { get; set; }
        public bool? Store { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
        public string? ReasoningEffort { get; set; }
        public string? Verbosity { get; set; }
        public WebSearchOptions? WebSearchOptions { get; set; }
    }
}
