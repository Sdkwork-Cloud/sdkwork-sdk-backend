using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiGenerationForm
    {
        public int? UserId { get; set; }
        public string? RequestId { get; set; }
        public string? Model { get; set; }
        public string? Channel { get; set; }
        public string? Type { get; set; }
        public double? Cost { get; set; }
        public string? Status { get; set; }
    }
}
