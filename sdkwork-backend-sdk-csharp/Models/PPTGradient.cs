using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PPTGradient
    {
        public PPTGradientType? Type { get; set; }
        public List<PPTGradientColor>? Colors { get; set; }
        public int? Rotate { get; set; }
    }
}
