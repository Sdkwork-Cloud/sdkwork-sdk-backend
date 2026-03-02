using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVipBenefitUsageForm
    {
        public int? UserId { get; set; }
        public string? BenefitType { get; set; }
        public string? UsageTime { get; set; }
        public int? UsageCount { get; set; }
        public int? Status { get; set; }
        public int? SourceId { get; set; }
        public string? SourceType { get; set; }
        public string? Remark { get; set; }
    }
}
