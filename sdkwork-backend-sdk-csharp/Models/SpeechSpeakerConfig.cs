using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class SpeechSpeakerConfig
    {
        public VoiceSpeakerInfo? Speaker { get; set; }
        public int? SpeakerId { get; set; }
        public double? Volume { get; set; }
        public double? Pitch { get; set; }
        public string? Language { get; set; }
        public double? Speed { get; set; }
        public string? Format { get; set; }
    }
}
