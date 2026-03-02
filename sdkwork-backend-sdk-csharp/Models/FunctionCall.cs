using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class FunctionCall
    {
        public string? Name { get; set; }
        public Dictionary<string, object>? Arguments { get; set; }
    }
}
