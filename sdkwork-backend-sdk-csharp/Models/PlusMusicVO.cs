using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusMusicVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? Version { get; set; }
        public string? Title { get; set; }
        public ImageMediaResourceList? CoverImages { get; set; }
        public string? Description { get; set; }
        public MusicMediaResource? Resource { get; set; }
        public AuthorInfo? Author { get; set; }
        public string? ContentUrl { get; set; }
        public AssetMediaResourceList? ResourceList { get; set; }
        public string? Format { get; set; }
        public int? Duration { get; set; }
        public int? FileSize { get; set; }
        public string? ThumbnailUrl { get; set; }
        public string? Artist { get; set; }
        public string? Genre { get; set; }
        public int? Bitrate { get; set; }
        public string? Status { get; set; }
    }
}
