using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusRefundVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? OrderId { get; set; }
        public int? PaymentId { get; set; }
        public string? OutRefundNo { get; set; }
        public string? OutTradeNo { get; set; }
        public string? RefundId { get; set; }
        public double? Amount { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public string? ApplyTime { get; set; }
        public string? CompleteTime { get; set; }
        public string? Remark { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
    }
}
