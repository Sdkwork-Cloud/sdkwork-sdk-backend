using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ModelLimitItem
    {
        public string? Type { get; set; }
        public double? Value { get; set; }
    }
}
