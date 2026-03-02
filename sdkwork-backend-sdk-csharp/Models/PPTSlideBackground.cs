using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PPTSlideBackground
    {
        public PPTSlideBackgroundType? Type { get; set; }
        public string? Color { get; set; }
        public PPTSlideBackgroundImage? Image { get; set; }
        public PPTGradient? Pptgradient { get; set; }
    }
}
