using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusOrderWorkerDispatchProfileForm
    {
        public int? UserId { get; set; }
        public string? RatingLevel { get; set; }
        public bool? Enabled { get; set; }
        public int? GlobalMaxInProgress { get; set; }
        public OrderWorkerDispatchMetadata? Metadata { get; set; }
    }
}
