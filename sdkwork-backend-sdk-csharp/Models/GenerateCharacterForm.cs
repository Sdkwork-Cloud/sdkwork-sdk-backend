using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerateCharacterForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Appearance { get; set; }
        public string? Personality { get; set; }
        public string? Background { get; set; }
        public string? Style { get; set; }
        public string? ResponseFormat { get; set; }
        public string? Model { get; set; }
        public int? N { get; set; }
        public int? Width { get; set; }
        public int? Height { get; set; }
        public string? Quality { get; set; }
        public string? Prompt { get; set; }
        public string? NegativePrompt { get; set; }
    }
}
