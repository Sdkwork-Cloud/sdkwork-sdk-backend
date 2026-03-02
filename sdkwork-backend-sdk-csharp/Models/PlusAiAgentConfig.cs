using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiAgentConfig
    {
        public string? Welcome { get; set; }
        public List<string>? Questions { get; set; }
        public bool? SaveFiles { get; set; }
        public bool? EnableMemory { get; set; }
        public int? MaxHistoryMessages { get; set; }
        public bool? UseKnowledgeBase { get; set; }
        public Dictionary<string, object>? Properties { get; set; }
    }
}
