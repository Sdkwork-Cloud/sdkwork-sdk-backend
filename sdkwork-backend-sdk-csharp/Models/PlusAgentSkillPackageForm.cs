using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAgentSkillPackageForm
    {
        public int? UserId { get; set; }
        public string? PackageKey { get; set; }
        public string? Name { get; set; }
        public string? Summary { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public string? CoverImage { get; set; }
        public int? CategoryId { get; set; }
        public bool? Enabled { get; set; }
        public bool? Featured { get; set; }
        public int? SortWeight { get; set; }
        public List<string>? Tags { get; set; }
    }
}
