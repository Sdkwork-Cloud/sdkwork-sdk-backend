using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ToolCallback
    {
        public ToolDefinition? ToolDefinition { get; set; }
        public ToolMetadata? ToolMetadata { get; set; }
    }
}
