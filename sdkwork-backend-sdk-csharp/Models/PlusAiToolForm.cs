using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiToolForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public bool? Enabled { get; set; }
        public HttpApiDefinition? HttpApiDefinition { get; set; }
        public PlusToolDefinition? ToolDefinition { get; set; }
    }
}
