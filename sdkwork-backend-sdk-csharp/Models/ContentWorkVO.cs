using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ContentWorkVO
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Title { get; set; }
        public string? Type { get; set; }
        public string? TypeDesc { get; set; }
        public string? Description { get; set; }
        public string? CoverUrl { get; set; }
        public string? Path { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
    }
}
