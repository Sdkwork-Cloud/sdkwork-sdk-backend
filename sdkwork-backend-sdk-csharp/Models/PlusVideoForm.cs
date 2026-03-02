using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVideoForm
    {
        public int? Id { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? ContentUrl { get; set; }
        public string? AspectRatio { get; set; }
        public int? Duration { get; set; }
        public string? Resolution { get; set; }
        public int? Width { get; set; }
        public int? Height { get; set; }
        public int? FileSize { get; set; }
        public string? Format { get; set; }
        public string? ThumbnailUrl { get; set; }
        public string? Status { get; set; }
        public string? Uuid { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
    }
}
