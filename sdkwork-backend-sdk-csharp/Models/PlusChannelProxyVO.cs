using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusChannelProxyVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? UserId { get; set; }
        public string? Name { get; set; }
        public string? Channel { get; set; }
        public string? Proxy { get; set; }
        public string? DefaultModel { get; set; }
        public string? Status { get; set; }
        public string? Description { get; set; }
    }
}
