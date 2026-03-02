using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusNewsForm
    {
        public string? Title { get; set; }
        public string? Url { get; set; }
        public string? Source { get; set; }
        public string? Summary { get; set; }
        public string? PublishTime { get; set; }
        public TagsContent? Tags { get; set; }
        public int? UserId { get; set; }
    }
}
