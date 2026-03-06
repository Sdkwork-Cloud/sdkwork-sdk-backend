using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusUserCouponVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? UserId { get; set; }
        public int? CouponId { get; set; }
        public string? CouponCode { get; set; }
        public string? AcquireTime { get; set; }
        public string? AcquireRequestNo { get; set; }
        public string? AcquireType { get; set; }
        public int? PointCost { get; set; }
        public bool? PointsRefunded { get; set; }
        public string? PointsRefundAt { get; set; }
        public string? UseTime { get; set; }
        public string? Status { get; set; }
    }
}
