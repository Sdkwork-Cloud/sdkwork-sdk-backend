using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVipRechargePackVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public double? Price { get; set; }
        public int? PointAmount { get; set; }
        public int? VipDurationDays { get; set; }
        public int? Status { get; set; }
        public int? SortWeight { get; set; }
        public string? ValidFrom { get; set; }
        public string? ValidTo { get; set; }
        public string? Remark { get; set; }
    }
}
