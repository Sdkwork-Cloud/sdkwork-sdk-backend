using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusSystemInvoiceApplyForm
    {
        public string? Title { get; set; }
        public string? TaxId { get; set; }
        public string? Type { get; set; }
        public double? Amount { get; set; }
        public string? Content { get; set; }
        public string? Email { get; set; }
        public string? Address { get; set; }
    }
}
