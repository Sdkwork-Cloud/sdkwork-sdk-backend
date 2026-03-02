using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusShareForm
    {
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public ShareContents? Contents { get; set; }
        public string? ContentType { get; set; }
        public string? Status { get; set; }
        public string? ShareUrl { get; set; }
        public List<string>? ContentIds { get; set; }
        public string? Password { get; set; }
        public string? ExpireAt { get; set; }
        public int? ClickCount { get; set; }
        public TagsContent? Tags { get; set; }
        public string? ShareCode { get; set; }
    }
}
