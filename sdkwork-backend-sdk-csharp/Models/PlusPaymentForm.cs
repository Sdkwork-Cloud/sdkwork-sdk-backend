using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPaymentForm
    {
        public string? Purpose { get; set; }
        public int? OrderId { get; set; }
        public string? TransactionId { get; set; }
        public string? OutTradeNo { get; set; }
        public string? Channel { get; set; }
        public string? Provider { get; set; }
        public string? Status { get; set; }
        public double? Amount { get; set; }
        public string? SuccessTime { get; set; }
        public string? Remark { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public string? ProductType { get; set; }
    }
}
