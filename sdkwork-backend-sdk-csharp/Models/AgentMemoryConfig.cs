using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AgentMemoryConfig
    {
        public MemoryProfile? Profile { get; set; }
    }
}
