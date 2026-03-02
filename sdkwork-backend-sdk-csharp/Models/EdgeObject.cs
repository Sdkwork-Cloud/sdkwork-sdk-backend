using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class EdgeObject
    {
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? SourceNodeId { get; set; }
        public string? TargetNodeId { get; set; }
        public string? Type { get; set; }
        public object? Condition { get; set; }
    }
}
