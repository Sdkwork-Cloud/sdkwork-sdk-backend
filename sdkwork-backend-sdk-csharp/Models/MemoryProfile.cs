using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MemoryProfile
    {
        public List<ProfileItem>? Items { get; set; }
        public Dictionary<string, List<ProfileItem>>? Customs { get; set; }
        public string? Description { get; set; }
    }
}
