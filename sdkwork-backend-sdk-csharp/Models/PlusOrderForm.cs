using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusOrderForm
    {
        public string? OrderType { get; set; }
        public int? UserId { get; set; }
        public string? OrderSn { get; set; }
        public string? TransactionId { get; set; }
        public string? OutTradeNo { get; set; }
        public double? TotalAmount { get; set; }
        public double? PaidAmount { get; set; }
        public int? PaidPointsAmount { get; set; }
        public string? Status { get; set; }
        public string? PayTime { get; set; }
        public string? ExpireTime { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
    }
}
