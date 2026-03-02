using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerateMusicForm
    {
        public string? Prompt { get; set; }
        public string? Lyrics { get; set; }
        public int? N { get; set; }
        public string? Model { get; set; }
        public int? Tempo { get; set; }
        public string? Style { get; set; }
        public string? Instrument { get; set; }
    }
}
