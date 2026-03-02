using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class VideoStoryboard
    {
        public List<VideoShotItem>? Shots { get; set; }
        public VideoMediaResource? FinalVideo { get; set; }
        public AudioMediaResource? FinalAudio { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? Style { get; set; }
        public string? AspectRatio { get; set; }
        public string? Prompt { get; set; }
        public double? Duration { get; set; }
        public VoiceSpeakerInfo? Speaker { get; set; }
    }
}
