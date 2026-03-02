using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ModelPriceItem
    {
        public string? Type { get; set; }
        public double? Price { get; set; }
    }
}
