using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PPTElementLink
    {
        public PPTElementLinkType? Type { get; set; }
        public string? Target { get; set; }
    }
}
