using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusSystemInvoiceVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Title { get; set; }
        public string? TaxId { get; set; }
        public string? Type { get; set; }
        public double? Amount { get; set; }
        public string? Status { get; set; }
        public string? Content { get; set; }
        public string? Email { get; set; }
        public string? Address { get; set; }
        public string? CreateTime { get; set; }
    }
}
