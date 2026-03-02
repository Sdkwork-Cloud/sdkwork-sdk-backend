using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiAgentToolVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? AgentId { get; set; }
        public int? ToolId { get; set; }
        public int? SortOrder { get; set; }
        public bool? Enabled { get; set; }
        public string? AgentName { get; set; }
        public string? ToolName { get; set; }
    }
}
