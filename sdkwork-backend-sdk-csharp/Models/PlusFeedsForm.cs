using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusFeedsForm
    {
        public string? Title { get; set; }
        public string? Summary { get; set; }
        public int? CategoryId { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public ImageMediaResourceList? CoverImages { get; set; }
        public string? Source { get; set; }
        public string? PublishTime { get; set; }
        public TagsContent? Tags { get; set; }
        public string? Status { get; set; }
    }
}
