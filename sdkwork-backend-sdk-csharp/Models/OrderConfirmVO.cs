using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OrderConfirmVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Success { get; set; }
        public string? Message { get; set; }
        public string? OperationTime { get; set; }
        public int? OrderId { get; set; }
        public string? ConfirmTime { get; set; }
        public string? EstimatedShipTime { get; set; }
    }
}
