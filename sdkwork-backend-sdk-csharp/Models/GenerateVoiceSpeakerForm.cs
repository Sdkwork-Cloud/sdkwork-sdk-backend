using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerateVoiceSpeakerForm
    {
        public string? VoiceSpeakerName { get; set; }
        public string? VoiceType { get; set; }
        public string? Text { get; set; }
        public double? Speed { get; set; }
        public double? Pitch { get; set; }
        public int? Volume { get; set; }
        public string? Model { get; set; }
        public string? ResponseFormat { get; set; }
        public string? Prompt { get; set; }
    }
}
