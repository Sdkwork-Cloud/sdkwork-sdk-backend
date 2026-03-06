using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusCouponTemplateForm
    {
        public string? Name { get; set; }
        public string? TemplateCode { get; set; }
        public string? Type { get; set; }
        public string? Description { get; set; }
        public int? Amount { get; set; }
        public double? Discount { get; set; }
        public int? MinConsume { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public int? Total { get; set; }
        public int? GetLimit { get; set; }
        public string? Status { get; set; }
        public string? ValidityType { get; set; }
        public int? ValidityDays { get; set; }
        public bool? CanShare { get; set; }
        public string? ScopeType { get; set; }
        public string? ScopeValue { get; set; }
    }
}
