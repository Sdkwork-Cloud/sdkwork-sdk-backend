using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerationContext
    {
        public int? GenerationId { get; set; }
        public string? GenerationType { get; set; }
        public string? GenerationStatus { get; set; }
        public string? Channel { get; set; }
        public string? RequestId { get; set; }
        public string? ChannelTaskId { get; set; }
        public string? RoutingStrategy { get; set; }
        public string? RoutingProduct { get; set; }
        public string? RoutingProvider { get; set; }
    }
}
