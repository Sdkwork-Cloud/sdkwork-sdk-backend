using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AspectRatio
    {
        public string? Ratio { get; set; }
        public double? Width { get; set; }
        public double? Height { get; set; }
    }
}
