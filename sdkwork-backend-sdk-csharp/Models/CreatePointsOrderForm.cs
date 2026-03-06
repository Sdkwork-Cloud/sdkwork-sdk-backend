using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CreatePointsOrderForm
    {
        public List<OrderContentItem>? Items { get; set; }
        public int? PointsAmount { get; set; }
        public string? ExpireTime { get; set; }
    }
}
