using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerateAudioEffectForm
    {
        public string? Title { get; set; }
        public string? Prompt { get; set; }
        public string? AudioType { get; set; }
        public string? EffectType { get; set; }
        public int? Intensity { get; set; }
        public string? EffectParams { get; set; }
        public string? Model { get; set; }
        public string? Channel { get; set; }
    }
}
