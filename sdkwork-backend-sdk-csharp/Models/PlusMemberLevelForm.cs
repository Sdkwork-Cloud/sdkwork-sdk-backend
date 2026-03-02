using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusMemberLevelForm
    {
        public int? CardId { get; set; }
        public string? LevelName { get; set; }
        public int? RequiredPoints { get; set; }
        public string? Description { get; set; }
        public string? Status { get; set; }
    }
}
