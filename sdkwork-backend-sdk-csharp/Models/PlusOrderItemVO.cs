using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusOrderItemVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? OrderId { get; set; }
        public string? ProductType { get; set; }
        public int? ProductId { get; set; }
        public int? SkuId { get; set; }
        public int? Quantity { get; set; }
        public double? UnitPrice { get; set; }
        public double? TotalAmount { get; set; }
        public string? ExpireTime { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
    }
}
