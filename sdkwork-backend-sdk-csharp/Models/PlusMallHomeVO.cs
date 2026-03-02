using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusMallHomeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public List<PlusCategoryVO>? GridCategories { get; set; }
        public List<PlusProductVO>? Products { get; set; }
        public List<PlusProductVO>? Banners { get; set; }
        public List<PlusProductVO>? HotProducts { get; set; }
        public List<PlusProductVO>? NewProducts { get; set; }
        public List<PlusProductVO>? RecommendProducts { get; set; }
        public List<PlusProductVO>? HotSalesProducts { get; set; }
    }
}
