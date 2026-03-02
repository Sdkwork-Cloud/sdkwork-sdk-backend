using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusSku
    {
        public int? TenantId { get; set; }
        public int? OrganizationId { get; set; }
        public string? DataScope { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? V { get; set; }
        public int? ProductId { get; set; }
        public string? SkuCode { get; set; }
        public string? Name { get; set; }
        public string? Title { get; set; }
        public double? Price { get; set; }
        public double? OriginalPrice { get; set; }
        public int? Stock { get; set; }
        public int? Sales { get; set; }
        public int? Status { get; set; }
        public string? Image { get; set; }
        public string? Specs { get; set; }
    }
}
