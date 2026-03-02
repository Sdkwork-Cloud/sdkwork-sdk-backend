using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class UnionPayObject
    {
        public string? PayUrl { get; set; }
        public string? Tn { get; set; }
        public string? MerOrderId { get; set; }
        public string? MerId { get; set; }
        public string? Mode { get; set; }
        public string? SchemeStr { get; set; }
        public string? Signature { get; set; }
    }
}
