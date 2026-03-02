using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class Function
    {
        public string? Description { get; set; }
        public string? Name { get; set; }
        public Dictionary<string, object>? Parameters { get; set; }
        public bool? Strict { get; set; }
    }
}
