using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class SpeechTranscriptionConfig
    {
        public string? Channel { get; set; }
        public string? Product { get; set; }
        public AudioTranscriptionOptions? Options { get; set; }
    }
}
