using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusCardTemplateForm
    {
        public string? Name { get; set; }
        public string? TemplateCode { get; set; }
        public string? CardType { get; set; }
        public string? CodeType { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? BrandName { get; set; }
        public string? LogoUrl { get; set; }
        public string? Notice { get; set; }
        public string? Color { get; set; }
        public int? Quantity { get; set; }
        public int? GetLimit { get; set; }
        public bool? CanShare { get; set; }
        public bool? CanGiveFriend { get; set; }
        public double? MinimumBalance { get; set; }
        public double? InitialBalance { get; set; }
        public double? DiscountRate { get; set; }
        public string? ValidityType { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public int? ValidityDays { get; set; }
        public bool? IsDeleted { get; set; }
    }
}
