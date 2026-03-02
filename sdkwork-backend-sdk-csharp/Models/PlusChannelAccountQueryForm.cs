using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusChannelAccountQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public string? Channel { get; set; }
        public string? Status { get; set; }
        public string? ResourceType { get; set; }
        public List<string>? ResourceTypes { get; set; }
    }
}
