using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusChannelProxyForm
    {
        public string? Name { get; set; }
        public string? Channel { get; set; }
        public string? Proxy { get; set; }
        public string? DefaultModel { get; set; }
        public string? Status { get; set; }
        public string? Description { get; set; }
    }
}
