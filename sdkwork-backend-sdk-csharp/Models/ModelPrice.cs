using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ModelPrice
    {
        public string? Unit { get; set; }
        public List<ModelPriceItem>? Items { get; set; }
        public string? Currency { get; set; }
    }
}
