using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class FileContentObject
    {
        public string? Text { get; set; }
        public Dictionary<string, string>? Contents { get; set; }
    }
}
