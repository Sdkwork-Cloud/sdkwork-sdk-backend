using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class DnsServer
    {
        public string? Address { get; set; }
        public int? Port { get; set; }
        public string? Type { get; set; }
        public int? Priority { get; set; }
        public bool? Enabled { get; set; }
    }
}
