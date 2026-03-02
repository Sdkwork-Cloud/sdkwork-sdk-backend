using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CartGroup
    {
        public string? Uuid { get; set; }
        public string? Name { get; set; }
        public List<CartItem>? Items { get; set; }
        public int? TotalQuantity { get; set; }
        public double? TotalPrice { get; set; }
    }
}
