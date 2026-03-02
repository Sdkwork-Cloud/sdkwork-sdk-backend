using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusShareVisitRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? ShareId { get; set; }
        public string? IpAddress { get; set; }
        public string? UserAgent { get; set; }
        public string? AccessedAt { get; set; }
        public bool? Success { get; set; }
    }
}
