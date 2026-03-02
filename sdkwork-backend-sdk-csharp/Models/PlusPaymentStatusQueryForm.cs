using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPaymentStatusQueryForm
    {
        public string? OutTradeNo { get; set; }
        public string? Provider { get; set; }
        public double? Amount { get; set; }
    }
}
