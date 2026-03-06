using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CreateVipOrderForm
    {
        public List<OrderContentItem>? Items { get; set; }
        public string? ExpireTime { get; set; }
    }
}
