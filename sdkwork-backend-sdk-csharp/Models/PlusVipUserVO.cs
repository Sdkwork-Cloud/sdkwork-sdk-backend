using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVipUserVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? UserId { get; set; }
        public int? VipLevelId { get; set; }
        public string? Status { get; set; }
        public int? PointBalance { get; set; }
        public int? TotalRechargedPoints { get; set; }
        public string? ValidFrom { get; set; }
        public string? ValidTo { get; set; }
        public string? LastActiveTime { get; set; }
        public string? Remark { get; set; }
        public PlusVipLevelVO? VipLevel { get; set; }
    }
}
