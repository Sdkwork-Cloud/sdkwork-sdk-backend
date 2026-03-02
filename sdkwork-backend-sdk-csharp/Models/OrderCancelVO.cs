using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OrderCancelVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Success { get; set; }
        public string? Message { get; set; }
        public string? OperationTime { get; set; }
        public int? OrderId { get; set; }
        public string? CancelReason { get; set; }
        public bool? Refundable { get; set; }
        public string? RefundAmount { get; set; }
        public string? CancelTime { get; set; }
    }
}
