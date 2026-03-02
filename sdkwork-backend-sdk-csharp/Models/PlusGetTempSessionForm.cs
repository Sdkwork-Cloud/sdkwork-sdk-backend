using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGetTempSessionForm
    {
        public string? Provider { get; set; }
        public string? Name { get; set; }
        public string? Scene { get; set; }
        public BucketObject? Bucket { get; set; }
        public string? Method { get; set; }
        public int? ExpirationSeconds { get; set; }
    }
}
