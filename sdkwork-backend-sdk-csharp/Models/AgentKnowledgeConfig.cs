using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AgentKnowledgeConfig
    {
        public List<AgentKnowledgeItem>? List { get; set; }
    }
}
