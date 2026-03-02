using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusShareVisitRecordForm
    {
        public int? ShareId { get; set; }
        public string? IpAddress { get; set; }
        public string? UserAgent { get; set; }
        public string? AccessedAt { get; set; }
        public bool? Success { get; set; }
    }
}
