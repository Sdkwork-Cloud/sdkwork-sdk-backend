using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusImageVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public ImageMediaResource? Resource { get; set; }
        public AuthorInfo? Author { get; set; }
        public string? Url { get; set; }
        public string? AspectRatio { get; set; }
        public int? Width { get; set; }
        public int? Height { get; set; }
        public int? FileSize { get; set; }
        public string? Format { get; set; }
        public string? Status { get; set; }
    }
}
