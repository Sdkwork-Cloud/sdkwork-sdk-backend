using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVipLevelForm
    {
        public string? Name { get; set; }
        public int? LevelValue { get; set; }
        public int? RequiredPoints { get; set; }
        public string? Description { get; set; }
    }
}
