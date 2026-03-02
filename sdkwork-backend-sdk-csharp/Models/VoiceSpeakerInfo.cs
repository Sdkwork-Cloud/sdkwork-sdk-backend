using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class VoiceSpeakerInfo
    {
        public string? Channel { get; set; }
        public string? Provider { get; set; }
        public string? Product { get; set; }
        public string? Id { get; set; }
        public List<string>? Models { get; set; }
        public string? SpeakerId { get; set; }
        public string? DisplayName { get; set; }
        public TagsContent? Tags { get; set; }
        public VoiceMotion? Motion { get; set; }
        public VoiceStyle? Style { get; set; }
        public string? Description { get; set; }
    }
}
