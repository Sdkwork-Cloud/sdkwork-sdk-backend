using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GetUrlResult
    {
        public string? Url { get; set; }
        public string? PreviewUrl { get; set; }
        public string? ObjectKey { get; set; }
    }
}
