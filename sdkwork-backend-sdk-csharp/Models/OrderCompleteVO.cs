using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OrderCompleteVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Success { get; set; }
        public string? Message { get; set; }
        public string? OperationTime { get; set; }
        public int? OrderId { get; set; }
        public string? CompleteTime { get; set; }
        public bool? Reviewed { get; set; }
        public int? PointsEarned { get; set; }
    }
}
