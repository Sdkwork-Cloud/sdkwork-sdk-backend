using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerateAudioForm
    {
        public string? Title { get; set; }
        public string? Prompt { get; set; }
        public string? Voice { get; set; }
        public string? Model { get; set; }
        public string? Format { get; set; }
        public double? Speed { get; set; }
    }
}
