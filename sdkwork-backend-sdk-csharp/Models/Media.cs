using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class Media
    {
        public string? Id { get; set; }
        public MimeType? MimeType { get; set; }
        public object? Data { get; set; }
        public string? Name { get; set; }
        public string? DataAsByteArray { get; set; }
    }
}
