using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiPromptVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Title { get; set; }
        public string? Content { get; set; }
        public string? Description { get; set; }
        public int? CategoryId { get; set; }
        public bool? Enabled { get; set; }
        public int? Sort { get; set; }
        public Dictionary<string, object>? Parameters { get; set; }
        public string? Creator { get; set; }
        public string? Model { get; set; }
        public TagsContent? Tags { get; set; }
        public int? UsageCount { get; set; }
        public int? AvgResponseTime { get; set; }
    }
}
