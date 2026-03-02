using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusSkuForm
    {
        public string? Title { get; set; }
        public int? ProductId { get; set; }
        public string? SkuCode { get; set; }
        public ImageMediaResourceList? Images { get; set; }
        public AssetMediaResourceList? Resources { get; set; }
        public double? Price { get; set; }
        public double? OriginalPrice { get; set; }
        public int? Stock { get; set; }
        public int? SalesCount { get; set; }
        public string? Status { get; set; }
        public int? CategoryId { get; set; }
        public List<AttributeItem>? Attributes { get; set; }
    }
}
