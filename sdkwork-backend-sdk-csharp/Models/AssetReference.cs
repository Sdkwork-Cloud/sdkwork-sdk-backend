using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AssetReference
    {
        public int? FileId { get; set; }
        public string? FileUuid { get; set; }
        public string? FilePath { get; set; }
        public string? AssetType { get; set; }
        public string? MimeType { get; set; }
        public string? Url { get; set; }
    }
}
