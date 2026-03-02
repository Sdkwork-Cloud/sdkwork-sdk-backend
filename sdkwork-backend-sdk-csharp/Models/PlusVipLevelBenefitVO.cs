using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVipLevelBenefitVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? VipLevelId { get; set; }
        public int? BenefitId { get; set; }
        public int? DailyLimit { get; set; }
        public int? MonthlyLimit { get; set; }
        public int? TotalLimit { get; set; }
        public string? Status { get; set; }
        public VipLevelBenefitMetadata? Metadata { get; set; }
        public string? Remark { get; set; }
    }
}
