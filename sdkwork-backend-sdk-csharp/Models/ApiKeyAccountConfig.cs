using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ApiKeyAccountConfig
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Region { get; set; }
        public int? Weight { get; set; }
        public string? Channel { get; set; }
        public string? Product { get; set; }
        public List<string>? Functions { get; set; }
        public AccountConfigMetadata? Metadata { get; set; }
        public Dictionary<string, object>? Properties { get; set; }
        public string? ApiKey { get; set; }
        public string? BaseUrl { get; set; }
    }
}
