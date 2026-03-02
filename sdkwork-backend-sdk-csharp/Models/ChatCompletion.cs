using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChatCompletion
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public int? Created { get; set; }
        public string? Model { get; set; }
        public List<ChatCompletionChoice>? Choices { get; set; }
        public CompletionUsage? Usage { get; set; }
        public ChatCompletionMetadata? Metadata { get; set; }
        public string? Content { get; set; }
        public PlusAgent? Agent { get; set; }
        public string? SystemFingerprint { get; set; }
    }
}
