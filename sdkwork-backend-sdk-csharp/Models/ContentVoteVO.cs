using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ContentVoteVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? V { get; set; }
        public int? UserId { get; set; }
        public string? ContentType { get; set; }
        public string? Rating { get; set; }
        public int? ContentId { get; set; }
        public ContentVoteMetadata? Metadata { get; set; }
    }
}
