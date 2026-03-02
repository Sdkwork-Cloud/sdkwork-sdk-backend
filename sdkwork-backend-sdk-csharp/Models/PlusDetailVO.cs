using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusDetailVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public DetailContent? Content { get; set; }
        public int? ProductId { get; set; }
        public int? SkuId { get; set; }
    }
}
