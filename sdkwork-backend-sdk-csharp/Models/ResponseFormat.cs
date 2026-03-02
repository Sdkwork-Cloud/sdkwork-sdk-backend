using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ResponseFormat
    {
        public string? Type { get; set; }
        public JsonSchema? JsonSchema { get; set; }
    }
}
