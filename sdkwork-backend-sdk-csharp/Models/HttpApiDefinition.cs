using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class HttpApiDefinition
    {
        public string? ApiName { get; set; }
        public string? Description { get; set; }
        public string? BaseUrl { get; set; }
        public string? Path { get; set; }
        public string? Method { get; set; }
        public Dictionary<string, string>? Headers { get; set; }
        public Dictionary<string, object>? Parameters { get; set; }
        public string? RequestFormat { get; set; }
        public string? ResponseFormat { get; set; }
        public bool? Authenticated { get; set; }
        public int? TimeoutMillis { get; set; }
        public string? RequestBodyFormat { get; set; }
        public Dictionary<string, object>? RequestBody { get; set; }
        public string? AuthType { get; set; }
        public Dictionary<string, object>? AuthParams { get; set; }
    }
}
