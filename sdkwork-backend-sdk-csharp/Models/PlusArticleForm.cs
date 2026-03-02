using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusArticleForm
    {
        public string? Title { get; set; }
        public string? Subtitle { get; set; }
        public string? Content { get; set; }
        public int? WordCount { get; set; }
        public int? ReadingTime { get; set; }
        public ImageMediaResourceList? CoverImages { get; set; }
        public AuthorInfo? Author { get; set; }
        public string? Source { get; set; }
        public string? Status { get; set; }
        public List<string>? Keywords { get; set; }
        public string? Summary { get; set; }
    }
}
