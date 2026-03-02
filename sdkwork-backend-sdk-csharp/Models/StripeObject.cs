using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class StripeObject
    {
        public string? SessionId { get; set; }
        public string? PaymentUrl { get; set; }
        public string? ClientSecret { get; set; }
        public string? PaymentIntentId { get; set; }
        public string? PublishableKey { get; set; }
        public string? ReturnUrl { get; set; }
        public string? Amount { get; set; }
        public string? Currency { get; set; }
    }
}
