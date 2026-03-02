using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPptThemeShadow
    {
        public int? H { get; set; }
        public int? V { get; set; }
        public int? Blur { get; set; }
        public string? Color { get; set; }
    }
}
