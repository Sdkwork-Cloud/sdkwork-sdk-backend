using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class StreamOptions
    {
        public bool? IncludeUsage { get; set; }
        public bool? ChunkIncludeUsage { get; set; }
    }
}
