using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ShortUrlVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? OriginalUrl { get; set; }
        public string? ShortCode { get; set; }
        public string? ExpiresAt { get; set; }
        public int? ClickCount { get; set; }
        public string? Status { get; set; }
        public int? CreatedBy { get; set; }
        public string? Description { get; set; }
    }
}
