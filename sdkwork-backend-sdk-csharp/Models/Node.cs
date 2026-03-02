using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class Node
    {
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public Dictionary<string, object>? Properties { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public List<PlusAgent>? Agents { get; set; }
    }
}
