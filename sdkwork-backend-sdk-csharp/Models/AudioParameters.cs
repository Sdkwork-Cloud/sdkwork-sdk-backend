using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AudioParameters
    {
        public string? Voice { get; set; }
        public string? Format { get; set; }
    }
}
