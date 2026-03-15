using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ModelFunctionItem
    {
        public string? Type { get; set; }
        public bool? Supported { get; set; }
    }
}
