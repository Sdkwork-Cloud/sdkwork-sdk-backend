using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusNewsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? UserId { get; set; }
        public string? Title { get; set; }
        public string? Url { get; set; }
        public string? Source { get; set; }
        public string? Summary { get; set; }
        public string? PublishTime { get; set; }
        public TagsContent? Tags { get; set; }
    }
}
