using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusShoppingCartItemVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? CartId { get; set; }
        public string? CartGroupUuid { get; set; }
        public int? ProductId { get; set; }
        public int? SkuId { get; set; }
        public int? Quantity { get; set; }
        public double? Price { get; set; }
        public bool? Selected { get; set; }
    }
}
