using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVisitHistoryForm
    {
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public int? VisitCount { get; set; }
        public string? LastVisitedAt { get; set; }
        public int? Duration { get; set; }
        public string? Source { get; set; }
    }
}
