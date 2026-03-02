using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ShortUrlForm
    {
        public string? OriginalUrl { get; set; }
        public string? ShortCode { get; set; }
        public string? ExpiresAt { get; set; }
        public string? Status { get; set; }
        public int? CreatedBy { get; set; }
        public string? Description { get; set; }
    }
}
