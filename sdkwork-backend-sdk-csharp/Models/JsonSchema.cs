using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class JsonSchema
    {
        public string? Name { get; set; }
        public Dictionary<string, object>? Schema { get; set; }
        public bool? Strict { get; set; }
    }
}
