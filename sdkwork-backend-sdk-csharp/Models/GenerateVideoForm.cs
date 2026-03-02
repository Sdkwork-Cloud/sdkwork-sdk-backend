using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerateVideoForm
    {
        public string? Prompt { get; set; }
        public string? NegativePrompt { get; set; }
        public int? N { get; set; }
        public int? Width { get; set; }
        public int? Height { get; set; }
        public string? Model { get; set; }
        public string? ResponseFormat { get; set; }
        public string? Style { get; set; }
        public string? AspectRatio { get; set; }
    }
}
