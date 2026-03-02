using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ApplePayObject
    {
        public string? PaymentData { get; set; }
        public string? MerchantId { get; set; }
        public string? TransactionId { get; set; }
        public string? DisplayName { get; set; }
        public string? Network { get; set; }
        public string? Type { get; set; }
        public string? Amount { get; set; }
        public string? CurrencyCode { get; set; }
    }
}
