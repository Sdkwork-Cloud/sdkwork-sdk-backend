using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChannelResourceItem
    {
        public string? Type { get; set; }
        public List<string>? Functions { get; set; }
    }
}
