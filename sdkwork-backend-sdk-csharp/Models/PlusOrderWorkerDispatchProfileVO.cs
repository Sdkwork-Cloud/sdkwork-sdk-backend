using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusOrderWorkerDispatchProfileVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public int? UserId { get; set; }
        public string? RatingLevel { get; set; }
        public bool? Enabled { get; set; }
        public int? GlobalMaxInProgress { get; set; }
        public OrderWorkerDispatchMetadata? Metadata { get; set; }
    }
}
