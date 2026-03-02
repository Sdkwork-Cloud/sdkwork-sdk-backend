using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusCard
    {
        public int? TenantId { get; set; }
        public int? OrganizationId { get; set; }
        public string? DataScope { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? V { get; set; }
        public int? CardOrganizationId { get; set; }
        public string? CardType { get; set; }
        public string? CodeType { get; set; }
        public string? Title { get; set; }
        public string? BrandName { get; set; }
        public string? LogoUrl { get; set; }
        public string? Notice { get; set; }
        public string? Description { get; set; }
        public string? Color { get; set; }
        public int? Quantity { get; set; }
        public int? GetLimit { get; set; }
        public bool? CanShare { get; set; }
        public bool? CanGiveFriend { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public string? Status { get; set; }
    }
}
