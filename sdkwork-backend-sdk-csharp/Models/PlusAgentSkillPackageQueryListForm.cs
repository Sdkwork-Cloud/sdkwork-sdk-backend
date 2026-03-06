using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAgentSkillPackageQueryListForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public string? Keyword { get; set; }
        public int? UserId { get; set; }
        public int? CategoryId { get; set; }
        public bool? Enabled { get; set; }
        public bool? Featured { get; set; }
    }
}
