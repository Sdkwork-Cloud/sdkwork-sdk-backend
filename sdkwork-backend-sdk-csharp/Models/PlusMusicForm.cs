using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusMusicForm
    {
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? ContentUrl { get; set; }
        public string? Format { get; set; }
        public int? Duration { get; set; }
        public int? FileSize { get; set; }
        public string? ThumbnailUrl { get; set; }
        public string? Artist { get; set; }
        public string? Genre { get; set; }
        public int? Bitrate { get; set; }
        public string? Status { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
    }
}
