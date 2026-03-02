using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class VipLevelBenefitMetadata
    {
        public int? MaxUsageCount { get; set; }
        public int? MaxDailyUsage { get; set; }
        public int? MaxMonthlyUsage { get; set; }
        public bool? IsUnlimited { get; set; }
        public string? ValidPeriod { get; set; }
        public string? ExtendInfo { get; set; }
    }
}
