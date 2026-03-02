using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusUserCouponForm
    {
        public int? UserId { get; set; }
        public int? CouponId { get; set; }
        public string? CouponCode { get; set; }
        public string? AcquireAt { get; set; }
        public string? UseAt { get; set; }
        public string? Status { get; set; }
    }
}
