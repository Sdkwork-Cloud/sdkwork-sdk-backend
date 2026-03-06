using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CreateBookingOrderForm
    {
        public List<OrderContentItem>? Items { get; set; }
        public string? ExpireTime { get; set; }
    }
}
