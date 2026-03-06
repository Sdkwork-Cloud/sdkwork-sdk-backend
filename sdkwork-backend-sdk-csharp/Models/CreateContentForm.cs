using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CreateContentForm
    {
        public string? Title { get; set; }
        public string? Type { get; set; }
        public string? Description { get; set; }
        public string? CoverUrl { get; set; }
    }
}
