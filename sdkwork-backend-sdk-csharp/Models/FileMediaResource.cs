using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class FileMediaResource
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Url { get; set; }
        public string? Bytes { get; set; }
        public object? LocalFile { get; set; }
        public string? Base64 { get; set; }
        public string? Type { get; set; }
        public int? Size { get; set; }
        public string? Name { get; set; }
        public string? Extension { get; set; }
        public TagsContent? Tags { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public string? Prompt { get; set; }
        public int? Width { get; set; }
        public int? Height { get; set; }
        public int? Duration { get; set; }
        public string? MimeType { get; set; }
    }
}
