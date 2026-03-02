using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerateVoiceSpeakerVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RequestId { get; set; }
        public string? TaskId { get; set; }
        public string? TaskStatus { get; set; }
        public AudioMediaResourceList? VoiceResources { get; set; }
        public string? VoiceSpeakerId { get; set; }
        public string? VoiceSpeakerName { get; set; }
        public string? VoiceType { get; set; }
        public string? VoiceStyle { get; set; }
        public string? Model { get; set; }
        public int? Duration { get; set; }
        public string? ErrorMessage { get; set; }
    }
}
