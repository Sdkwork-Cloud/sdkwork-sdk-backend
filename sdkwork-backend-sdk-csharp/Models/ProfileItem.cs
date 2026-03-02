using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ProfileItem
    {
        public string? Name { get; set; }
        public string? Label { get; set; }
        public List<string>? Values { get; set; }
        public bool? Custom { get; set; }
        public int? UpdateCount { get; set; }
        public List<string>? Samples { get; set; }
        public string? Description { get; set; }
    }
}
