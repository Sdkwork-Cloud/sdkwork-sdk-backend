using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CartItem
    {
        public int? Id { get; set; }
        public PlusSku? Sku { get; set; }
        public int? Quantity { get; set; }
        public double? UnitPrice { get; set; }
        public double? TotalPrice { get; set; }
        public bool? Selected { get; set; }
    }
}
