using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CouponRedeemForm
    {
        public string? RedeemCode { get; set; }
        public string? Channel { get; set; }
    }
}
