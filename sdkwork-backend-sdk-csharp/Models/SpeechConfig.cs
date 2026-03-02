using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class SpeechConfig
    {
        public SpeechSpeakerConfig? SpeakerConfig { get; set; }
        public SpeechTranscriptionConfig? TranscriptionConfig { get; set; }
        public VadConfig? VadConfig { get; set; }
        public AecConfig? AecConfig { get; set; }
    }
}
