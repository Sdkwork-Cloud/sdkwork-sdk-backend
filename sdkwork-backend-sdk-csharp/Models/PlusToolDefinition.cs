using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusToolDefinition
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Type { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? InputSchema { get; set; }
        public bool? BuildIn { get; set; }
        public HttpApiDefinition? HttpDefinition { get; set; }
    }
}
