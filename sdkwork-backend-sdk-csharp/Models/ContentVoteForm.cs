using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ContentVoteForm
    {
        public string? ContentType { get; set; }
        public string? Rating { get; set; }
        public int? ContentId { get; set; }
        public ContentVoteMetadata? Metadata { get; set; }
    }
}
