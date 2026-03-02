using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVipRechargeForm
    {
        public int? UserId { get; set; }
        public int? VipLevelId { get; set; }
        public double? Amount { get; set; }
        public int? PointAmount { get; set; }
        public string? RechargeType { get; set; }
        public string? RechargeTime { get; set; }
        public string? TransactionNo { get; set; }
        public int? Status { get; set; }
        public string? Remark { get; set; }
    }
}
