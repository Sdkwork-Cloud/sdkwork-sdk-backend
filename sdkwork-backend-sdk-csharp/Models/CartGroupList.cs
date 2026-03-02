using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CartGroupList
    {
        public List<CartGroup>? Groups { get; set; }
        public int? TotalQuantity { get; set; }
        public double? TotalPrice { get; set; }
        public int? SelectedQuantity { get; set; }
        public double? SelectedPrice { get; set; }
        public List<CartItem>? AllItems { get; set; }
    }
}
