using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPaymentCancelForm
    {
        public int? PaymentId { get; set; }
        public string? OutTradeNo { get; set; }
        public double? Amount { get; set; }
        public string? Reason { get; set; }
    }
}
