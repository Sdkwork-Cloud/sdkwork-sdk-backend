using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusChannelForm
    {
        public string? Name { get; set; }
        public string? Channel { get; set; }
        public List<string>? Types { get; set; }
        public List<string>? SupportResources { get; set; }
        public string? Status { get; set; }
        public string? Description { get; set; }
    }
}
