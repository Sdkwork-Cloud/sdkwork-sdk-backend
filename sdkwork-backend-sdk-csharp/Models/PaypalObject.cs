using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PaypalObject
    {
        public string? Token { get; set; }
        public string? PayerId { get; set; }
        public string? PaymentUrl { get; set; }
        public string? Invoice { get; set; }
        public string? Amount { get; set; }
        public string? Currency { get; set; }
        public string? PaymentStatus { get; set; }
        public string? TransactionId { get; set; }
        public string? ReturnUrl { get; set; }
        public string? CancelUrl { get; set; }
    }
}
