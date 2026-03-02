using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiAgentToolForm
    {
        public int? AgentId { get; set; }
        public int? ToolId { get; set; }
        public int? SortOrder { get; set; }
        public bool? Enabled { get; set; }
    }
}
