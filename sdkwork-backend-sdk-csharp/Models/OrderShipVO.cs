using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OrderShipVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Success { get; set; }
        public string? Message { get; set; }
        public string? OperationTime { get; set; }
        public int? OrderId { get; set; }
        public string? ShippingCompany { get; set; }
        public string? TrackingNumber { get; set; }
        public string? ShipTime { get; set; }
        public string? EstimatedArrivalTime { get; set; }
    }
}
