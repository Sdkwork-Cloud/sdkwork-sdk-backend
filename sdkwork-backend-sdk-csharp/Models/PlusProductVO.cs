using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusProductVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? UserId { get; set; }
        public string? Title { get; set; }
        public string? Code { get; set; }
        public string? Subtitle { get; set; }
        public AssetMediaResourceList? Resources { get; set; }
        public TagsContent? Tags { get; set; }
        public double? Price { get; set; }
        public double? OriginalPrice { get; set; }
        public int? Stock { get; set; }
        public int? SalesCount { get; set; }
        public string? Status { get; set; }
        public string? OnSaleAt { get; set; }
        public string? Description { get; set; }
        public int? CategoryId { get; set; }
        public Attributes? BaseAttributes { get; set; }
        public Attributes? SpecAttributes { get; set; }
    }
}
