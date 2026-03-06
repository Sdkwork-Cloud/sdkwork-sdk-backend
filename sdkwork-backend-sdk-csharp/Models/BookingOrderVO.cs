using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class BookingOrderVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? OrderId { get; set; }
        public string? OrderSn { get; set; }
        public bool? Success { get; set; }
        public string? Message { get; set; }
    }
}
