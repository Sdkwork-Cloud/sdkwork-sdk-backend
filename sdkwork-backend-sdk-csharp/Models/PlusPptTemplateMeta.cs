using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPptTemplateMeta
    {
        public string? PayloadUrl { get; set; }
        public List<string>? PreviewUrls { get; set; }
    }
}
