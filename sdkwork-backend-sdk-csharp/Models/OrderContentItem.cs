using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OrderContentItem
    {
        public int? Id { get; set; }
        public int? ProductId { get; set; }
        public int? SkuId { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public int? Quantity { get; set; }
        public double? UnitPrice { get; set; }
        public double? TotalPrice { get; set; }
    }
}
