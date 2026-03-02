using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PPTAnimation
    {
        public string? Id { get; set; }
        public string? ElId { get; set; }
        public string? Effect { get; set; }
        public PPTAnimationType? Type { get; set; }
        public int? Duration { get; set; }
        public PPTAnimationTrigger? Trigger { get; set; }
    }
}
