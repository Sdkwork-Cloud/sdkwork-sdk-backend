using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVipLevelVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Name { get; set; }
        public int? LevelValue { get; set; }
        public int? RequiredPoints { get; set; }
        public string? Description { get; set; }
        public List<int>? BenefitIds { get; set; }
        public List<PlusVipBenefitVO>? Benefits { get; set; }
    }
}
