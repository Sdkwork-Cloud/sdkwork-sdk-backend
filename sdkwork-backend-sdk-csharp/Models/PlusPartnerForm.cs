using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPartnerForm
    {
        public string? Name { get; set; }
        public string? Level { get; set; }
        public string? Status { get; set; }
        public string? ContactName { get; set; }
        public string? ContactPhone { get; set; }
        public string? ContactEmail { get; set; }
        public string? CompanyAddress { get; set; }
        public string? BusinessLicense { get; set; }
        public string? SettlementAccount { get; set; }
        public double? CommissionRate { get; set; }
        public double? TotalCommission { get; set; }
        public double? WithdrawableCommission { get; set; }
        public double? WithdrawnCommission { get; set; }
        public string? PromotionCode { get; set; }
        public int? ParentId { get; set; }
        public PlusTreeParentMetadata? ParentMetadata { get; set; }
        public string? ParentUuid { get; set; }
        public string? CooperationStartTime { get; set; }
        public string? CooperationEndTime { get; set; }
        public string? Remark { get; set; }
    }
}
