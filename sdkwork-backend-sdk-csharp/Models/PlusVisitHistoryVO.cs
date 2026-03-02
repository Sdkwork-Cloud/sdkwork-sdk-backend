using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVisitHistoryVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? UserId { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public int? VisitCount { get; set; }
        public string? LastVisitedAt { get; set; }
        public int? Duration { get; set; }
        public string? Source { get; set; }
    }
}
