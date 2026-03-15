using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameDefinitionQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public string? Code { get; set; }
        public string? CodeLike { get; set; }
        public string? NameLike { get; set; }
        public string? GameType { get; set; }
        public string? Category { get; set; }
        public string? GameModeCode { get; set; }
        public bool? Enabled { get; set; }
        public bool? Ranked { get; set; }
        public bool? SupportsReplay { get; set; }
        public bool? SupportsTournament { get; set; }
    }
}
