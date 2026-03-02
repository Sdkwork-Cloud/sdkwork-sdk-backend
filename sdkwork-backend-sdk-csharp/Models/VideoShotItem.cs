using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class VideoShotItem
    {
        public string? Id { get; set; }
        public string? Uuid { get; set; }
        public string? ShotPrompt { get; set; }
        public string? Dialogue { get; set; }
        public double? Duration { get; set; }
        public ImageMediaResource? StartFrame { get; set; }
        public ImageMediaResource? EndFrame { get; set; }
        public ImageMediaResource? Image { get; set; }
        public AssetMediaResourceList? ResourceList { get; set; }
        public string? Emotion { get; set; }
        public string? VideoDescription { get; set; }
        public VideoMediaResource? Video { get; set; }
    }
}
