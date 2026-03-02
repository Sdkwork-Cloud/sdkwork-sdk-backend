using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVipRechargeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
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
