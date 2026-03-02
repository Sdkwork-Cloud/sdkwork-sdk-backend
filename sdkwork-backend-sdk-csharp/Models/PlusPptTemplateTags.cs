using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPptTemplateTags
    {
        public List<string>? Scene { get; set; }
        public List<string>? Design { get; set; }
        public List<string>? Theme { get; set; }
        public List<string>? Style { get; set; }
    }
}
