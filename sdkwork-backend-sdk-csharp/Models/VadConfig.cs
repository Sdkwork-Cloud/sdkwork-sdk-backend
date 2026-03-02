using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class VadConfig
    {
        public double? SpeechThreshold { get; set; }
        public int? MinSpeechDurationMs { get; set; }
        public int? MinSilenceDurationMs { get; set; }
        public int? MaxSilenceDurationMs { get; set; }
        public int? SilenceTimeout { get; set; }
        public int? SpeechTimeout { get; set; }
        public int? WindowSize { get; set; }
        public int? StepSize { get; set; }
    }
}
